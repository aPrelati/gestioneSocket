/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionesocket;

import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aless
 */
public class Server {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //apertura porta e avvio del servizio
            ServerSocket serverSocket = new ServerSocket(2000);
            System.out.println("Server avviato correttamente");
            
            //attesa di richieste dal client
            Socket socket=serverSocket.accept(); //metodo bloccante (non fa nulla fino a quando non gli arriva la richiesta)
            System.out.println("Connessione avventuta");
            System.out.println("Socket: "+socket);
            
        } catch(BindException ex){
            System.err.println("Porta occupata");
        }
        catch (IOException ex) {
            System.err.println("Errore avvio server sulla porta 2000");
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
