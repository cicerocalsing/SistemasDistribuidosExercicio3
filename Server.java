package Service;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    public static void main(String[] args) {
        try {
            // Cria uma instância da implementação da calculadora
            ServiceImple calculadora = new ServiceImple();

            // Cria o registro RMI na porta 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Registra o objeto remoto no registro com o nome "Calculadora"
            registry.rebind("Calculadora", calculadora);

            System.out.println("Servidor pronto.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
