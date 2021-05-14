package rmi_cliente_servidor;

import java.rmi.Naming;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;

/**
 *
 * @author miguel
 */
public class Cliente {

    public static void main(String[] args) throws RemoteException {
        
        String x = "", y = "";
        
        try {
            Suma s = (Suma) Naming.lookup("//85.187.158.121:1099/Suma"); /*Dirección de otra computadora que vamos a conectar*/
            
            while(true) {
                String menu = JOptionPane.showInputDialog(null, "Suma de 2 numeros\n"
                + "1.- Sumar\n"
                + "2.- Salir\n", "Cliente Servidor RMI", JOptionPane.DEFAULT_OPTION);
                
                switch(menu){
                    case "1":
                        x = JOptionPane.showInputDialog(null, "Primer numero", "Suma", JOptionPane.QUESTION_MESSAGE);
                        y = JOptionPane.showInputDialog(null, "Segundo numero", "Suma", JOptionPane.QUESTION_MESSAGE);

                        JOptionPane.showMessageDialog(null, "La suma es: " + s.suma(x, y));

                        break;
                        
                    case "2":
                        JOptionPane.showMessageDialog(null, "Saliendo", null, JOptionPane.WARNING_MESSAGE);
                        System.exit(0);
                        break;
                }
            }
            
        } catch (Exception e){
      
        
        }
    }
}
