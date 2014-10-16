package josbide.util;

import josbide.Activator;
import josbide.preferences.PreferenceConstants;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.MessageConsoleStream;

public class EclipseLogger {
	
	private static EclipseLogger instance;
	private MessageConsole console;
	
	private EclipseLogger(){
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager consoleManager = plugin.getConsoleManager();
		
		console = new MessageConsole("Osbide", null);
		consoleManager.addConsoles(new IConsole[] {this.console});		
	}
	
	/**
	 * Access the singleton
	 * @return The Eclipse logger
	 */
	
	public static synchronized EclipseLogger getInstance(){
		if(EclipseLogger.instance == null)
			EclipseLogger.instance = new EclipseLogger();
		
		return EclipseLogger.instance;
	}
	
	public synchronized void log(Object who, String msg){
		String toPrint = who.getClass().getCanonicalName() +" : " + msg;
		console.newMessageStream().println(toPrint);
	}
	
	public synchronized void logInfo(String msg){
		String toPrint = "Info: " + msg;
		console.newMessageStream().println(toPrint);
	}
	
	public synchronized void logDebug(String msg){
		if(Activator.getDefault().getPreferenceStore().getBoolean(PreferenceConstants.P_DEBUGSETTINGS)){
			console.newMessageStream().println(msg);
		}
	}
}
