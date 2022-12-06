
package queu;

/**
 *
 * @author Alpha Base
 */
public class DadosMulta {
    String nomeAg;
    String nomeC;
    String nomeCarro;
    String corCarro;
    String data;
    String local;
    double multa;

    public DadosMulta(String nomeAg, String nomeC, String nomeCarro, String corCarro, String data, String local, double multa) {
        this.nomeAg = nomeAg;
        this.nomeC = nomeC;
        this.nomeCarro = nomeCarro;
        this.corCarro = corCarro;
        this.data = data;
        this.local = local;
        this.multa = multa;
    }
   
    
    //Getters

    public String getNomeAg() {
        return nomeAg;
    }

    public void setNomeAg(String nomeAg) {
        this.nomeAg = nomeAg;
    }

    public String getNomeC() {
        return nomeC;
    }

    public void setNomeC(String nomeC) {
        this.nomeC = nomeC;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public String getCorCarro() {
        return corCarro;
    }

    public void setCorCarro(String corCarro) {
        this.corCarro = corCarro;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    

    
    
    
            
}
