package josbide.wcf.soap;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import josbide.wcf.soap.operations.OsbideOperation;

import org.reficio.ws.SoapContext;
import org.reficio.ws.builder.SoapBuilder;
import org.reficio.ws.builder.core.Wsdl;

public class EasyClient {

	//Our WSDL file URL(DO NOT CHANGE THIS!):
	public final String OSBIDE_WEBSERVICE_WSDL_ADRESS = "http://osbide.com/Services/OsbideWebService.svc?singleWsdl";
	//Our binding scheme(DO NOT CHANGE THIS!):
	public final String OSBIDE_WEBSERVICE_BINDING = "BasicHttpBinding_OsbideWebService";

	//Privates:
	private Wsdl webservice;
	private SoapBuilder builder;
	private ExecutorService threadpool;
	private boolean ownThreadpool;

	public EasyClient() {
		//Create thread pool, this is just a simple way to launch an callable in an seperate thread
		ExecutorService threads = Executors.newFixedThreadPool(1);
		//Create everything automatically:
		this.init(this.OSBIDE_WEBSERVICE_WSDL_ADRESS, this.OSBIDE_WEBSERVICE_BINDING, threads);
		this.ownThreadpool = true;
	}

	public EasyClient(ExecutorService threads) {
		//Init Client:
		this.init(this.OSBIDE_WEBSERVICE_WSDL_ADRESS, this.OSBIDE_WEBSERVICE_BINDING, threads);
		this.ownThreadpool = false;
	}

	private void init(String wsdlAdress, String binding, ExecutorService threadpool) {

		//Create a Soap Context for Configuration:
		SoapContext ctx = SoapContext.builder().alwaysBuildHeaders(true).exampleContent(false)
				.build();

		//Initialize the web service
		this.webservice = Wsdl.parse(wsdlAdress);
		this.builder = webservice.binding().localPart(binding).find(ctx);

		//Set threadpool:
		this.threadpool = threadpool;
	}

	/**
	 * Shutdown the client properly.
	 */

	public void shutdown() {
		//Shutdown our own threadpool:
		if (this.ownThreadpool) {
			try {
				//Initiate shutdown:
				this.threadpool.shutdown();
				//Wait for a maximum of 3 seconds:
				this.threadpool.awaitTermination(3, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				//Just inform the user/developer, we'll take action in the finally block
				System.err.println("Threadpool could not be shut down properly, forcing it!");
			} finally {
				//Force shutdown if necessary
				if (!this.threadpool.isShutdown())
					this.threadpool.shutdownNow();
			}
		}

		//Delete our references:
		this.threadpool = null;
		this.builder = null;
		this.webservice = null;
	}

	/**
	 * Do a Call to the OSBIDE Web Service. This is a non-blocking function
	 * 
	 * @param op
	 *            What operation to do
	 * @return Future of the results
	 */

	public Future<List<SoapParameter>> doAsyncOperation(OsbideOperation op) {
		//Create Callable:
		Callable<List<SoapParameter>> callToService = new SoapCall(this.builder, op);
		//Execute
		Future<List<SoapParameter>> result = this.threadpool.submit(callToService);
		//Deliver Future
		return result;
	}

	/**
	 * Do a Call to the OSBIDE Web Service. This is a blocking function
	 * recieved
	 * 
	 * @param op
	 *            The OsbideOperation to do
	 * @return The result als ParameterList
	 * @throws ExecutionException
	 *             When the asyn operation failed via Exception. Possible:
	 *             Exception, IllegalStateException,
	 *             IllegalArgumentException, NoSuchElementException
	 * @throws InterruptedException
	 *             When the call was interrupted
	 */

	public List<SoapParameter> doSyncOperation(OsbideOperation op) throws ExecutionException,
			InterruptedException {
		//Do async call
		Future<List<SoapParameter>> result = this.doAsyncOperation(op);
		//Now wait for the result:
		return result.get();
	}

}
