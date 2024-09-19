package Service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServiceImple extends UnicastRemoteObject implements Service {
    
    public ServiceImple() throws RemoteException {
        super();
    }

    @Override
    public int soma(int a, int b) throws RemoteException {
        return a + b;
    }

    @Override
    public int subtrai(int a, int b) throws RemoteException {
        return a - b;
    }

    @Override
    public int multiplica(int a, int b) throws RemoteException {
        return a * b;
    }

    @Override
    public double divide(int a, int b) throws RemoteException {
        if (b == 0) {
            throw new ArithmeticException("Divis�o por zero n�o � permitida.");
        }
        return (double) a / b;
    }
}
