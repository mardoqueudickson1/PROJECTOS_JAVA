
package agenda;

/**
 *
 * @author Eduardo
 */

//CLASSE PRINCIPAL COM TODOS OS ATRIBUTOS
public class Pai {
    
    public String Nome;
    public String Eventos;
    public int Telefone;
   

    public Pai() {
        
    }

    public Pai(String Nome, String Eventos, int Telefone) {
        this.Nome = Nome;
        this.Eventos = Eventos;
        this.Telefone = Telefone;
       
       
    }
    
    
    //SETTERS 

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setEventos(String Eventos) {
        this.Eventos = Eventos;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

   
    
    
    
    //GETTERS

    public String getNome() {
        return Nome;
    }

    public String getEventos() {
        return Eventos;
    }

    public int getTelefone() {
        return Telefone;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
