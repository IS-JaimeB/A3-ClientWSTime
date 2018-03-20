/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientwstime;

/**
 *
 * @author entrar
 */
public class ClientWSTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewJerseyClient time = new NewJerseyClient();
        System.out.println(time.getJson());
    }
    
}
