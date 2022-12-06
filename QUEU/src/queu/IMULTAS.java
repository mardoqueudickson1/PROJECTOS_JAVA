package queu;
import java.util.ArrayList;

/**
 *
 * @author Mardoqueu Dickson
 */
public interface IMULTAS {
  
   
    void multar(String nomeAg, String nomeC, String nomeCarro, String corCarro, String data, String local);
    void consultarMulta(int id);
    void actualizarMultar(int id, String nomeAg, String nomeC, String nomeCarro, String corCarro, String data, String local, double  multa);
    void removerMulta(int id);
    
    
}
