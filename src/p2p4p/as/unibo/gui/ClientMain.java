/**
 * 
 */
package p2p4p.as.unibo.gui;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

import p2p4p.as.unibo.authentication.AuthenticationServerInterface;

/**
 * @author pasqualepuzio
 *
 */
public class ClientMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setSecurityManager(new RMISecurityManager());
			AuthenticationServerInterface auth = (AuthenticationServerInterface) Naming.lookup("rmi://localhost/auth");
			//System.out.println("SignUp: " + auth.signUp("riccardo", "forl“"));
			//System.out.println("SignUp: " + auth.signUp("riccardo", "forl“"));
			System.out.println("SignIn: " + auth.signIn("riccardo", "peppa"));
			System.out.println("SignIn: " + auth.signIn("riccardo", "forl“"));
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
