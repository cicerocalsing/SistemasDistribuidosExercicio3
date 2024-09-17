import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class SumNumbers extends UnicastRemoteObject implements InterfaceRemota {
    public SumNumbers() throws RemoteException {
        super();
    }

    @Override
    public int sum(int primeiroNumero, int segundoNumero) throws RemoteException {
        return primeiroNumero + segundoNumero;
    }
}
