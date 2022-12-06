package unitel;



/**
 *
 * @author José Dias
 */

//CLASSE ABSTRATA QUE NÃO PODE SER INSTANCIADA
public abstract class METODOS implements INTERFACE {


    //MÉTODOS ABSTRATOS - POLIMORFISMO
    @Override
    public abstract void registrar(int num);

    @Override
    public  abstract void ver();
    
    @Override
    public  abstract void verR();

    @Override
    public abstract void actualizar(int id);

    @Override
    public abstract void eliminar(int num);
    
    @Override
    public abstract void eliminarT();
    
    @Override
    public abstract void rembolsar(int id);
    
    @Override
    public abstract void comprar(int saldo);

}




