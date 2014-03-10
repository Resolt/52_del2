package TCPSocket;

import java.io.*; 
import java.net.*; 
import java.util.*;

public class mainSocket {

		public static boolean connectionStatus = false;
		
//		public void startConnection() throws IOException
//	    { 
//			Scanner scanData = new Scanner(System.in);
//			
//	        String sentence = " "; 
//	        String modifiedSentence; 
//	        
//	        BufferedReader inFromUser = 
//	          new BufferedReader(new InputStreamReader(System.in)); 
//
//	        ServerSocket connectionPort = new ServerSocket(6747);
//	        
//	        System.out.println("Please enter an ip first, then the port number: ");
//	        
//	        Socket serverSocket = new Socket("127.0.0.1", 10000); // create local server socket at port 10k
//	       
//	        BufferedReader inFromServer = 
//	                new BufferedReader(new
//	                InputStreamReader(serverSocket.getInputStream())); 
//	    	System.out.println("Choose from the following: \nT to Tare \nS to display weight\nD \"<message>\" to enter a message \nZ to zero the weight.\nQ to exit");
//	    	
//	        while(sentence.charAt(0) != 'Q'){
//	        
//	        	sentence = inFromUser.readLine(); 
//	        	
//	        	if(sentence.charAt(0) != 'Q'){
//	              
//	              modifiedSentence = inFromServer.readLine(); 
//
//	              System.out.println("FROM SERVER: " + modifiedSentence); 
//	        	}
//
//	        }
//	              System.out.println("Closing Connection...");
//	              serverSocket.close(); 
//	              scanData.close();
//	              inFromUser.close();
//	              serverSocket.close();
//
//	    }
		
		
		public void startServer()throws IOException{

			ServerSocket connectionSocket = null;
			
			try {
				connectionSocket = new ServerSocket(6747);
				Socket clientSocket = connectionSocket.accept();
				PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
				
				BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				
			} catch (IOException e) {
				// no need to catch anything, faget.
			
			}
		
		
			connectionSocket.close();
			
		}
		
		
	}

	
