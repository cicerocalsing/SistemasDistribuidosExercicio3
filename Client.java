package Service;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            // Obt�m o registro RMI na m�quina local (localhost)
            Registry registry = LocateRegistry.getRegistry("localhost");

            // Busca o objeto remoto registrado como "Calculadora"
            ServiceImple calculadora = (ServiceImple) registry.lookup("Service");

            // Teste das opera��es da calculadora
            int a = 10, b = 5;
            System.out.println("Soma: " + calculadora.soma(a, b));
            System.out.println("Subtra��o: " + calculadora.subtrai(a, b));
            System.out.println("Multiplica��o: " + calculadora.multiplica(a, b));
            System.out.println("Divis�o: " + calculadora.divide(a, b));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
