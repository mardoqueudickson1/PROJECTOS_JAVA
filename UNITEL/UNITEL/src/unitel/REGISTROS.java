
package unitel;

/**
 *
 * @author José Dias
 */
public class REGISTROS {
    
    int numero;
    int saldo;
    int remboslso;
    String data;
    boolean just;

    public REGISTROS(int numero, int saldo, int remboslso, String data, boolean just) {
        this.numero = numero;
        this.saldo = saldo;
        this.remboslso = remboslso;
        this.data = data;
        this.just = just;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getRemboslso() {
        return remboslso;
    }

    public void setRemboslso(int remboslso) {
        this.remboslso = remboslso;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isJust() {
        return just;
    }

    public void setJust(boolean just) {
        this.just = just;
    }

    
    
    
    
}
