package TCPSocket;

import java.io.*; 
import java.net.*; 
import java.util.*;

public class mainSocket {

	public void startServer()throws IOException{

		
		
			ServerSocket connectionSocket = null;
			PrintWriter out = null;
			BufferedReader in = null;
			
			
			try {
				System.out.println("Initializing Server...");
				connectionSocket = new ServerSocket(8000);
				Socket clientSocket = connectionSocket.accept();
				System.out.println("Sucessfully Connected someone...");
				
				out = new PrintWriter(clientSocket.getOutputStream(), true);
				
				in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				
			} catch (IOException e) {
					// no need to catch anything faget
				
			}
			
			
			
			
			String inputLine = "";
			String outputLine = " ";
			
			while(true){
				
				break;
			}
			
		
			connectionSocket.close();
			
		}
		
		
	}

	
