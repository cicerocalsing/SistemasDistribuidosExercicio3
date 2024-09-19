package Service;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    public static void main(String[] args) {
        try {
            // Obtém o registro RMI na máquina local (localhost)
            Registry registry = LocateRegistry.getRegistry("localhost");

            // Busca o objeto remoto registrado como "Calculadora"
            ServiceImple calculadora = (ServiceImple) registry.lookup("Service");

            // Teste das operações da calculadora
            int a = 10, b = 5;
            System.out.println("Soma: " + calculadora.soma(a, b));
            System.out.println("Subtração: " + calculadora.subtrai(a, b));
            System.out.println("Multiplicação: " + calculadora.multiplica(a, b));
            System.out.println("Divisão: " + calculadora.divide(a, b));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
