package agenda;

//IMPORTAÇÃO DA BIBLOTECA ARRAY LIST
import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {

    Scanner m = new Scanner(System.in);

    public Metodos() {

    }
    
    // INSTACIAMENTO DO ARRAY LIST
    //SINTAXE DO ARRAY LIST É ArrayList<TIPO DE DADO> NOME DA VARIAVEL = new ArrayList();
    
    //Esse Array esta a receber a classe Pai com todos os seus atributos
    ArrayList<Pai> DADOS = new ArrayList();

    int id = 0;

    void Angendar_Evento() {

        int escolha = 20;

        while (true) {
            
            System.out.print("DIGITE O NOME: ");
            String Nome = m.next();
            System.out.print("DIGITE O EVENTO: ");
            String Evento = m.next();
            System.out.print("DIGITE O NÚMERO: ");
            int Telefone = m.nextInt();

            System.out.println("");
            id += 1;
            System.out.println("EVENTO Nº" + id + " REGISTRADO COM SUCESSO");
            
            //Aqui estamos a instaciar a classe Pai e mandar as variáveis Nome, Evento, 
            //Telefone como argumentos
            //Essas variáveis são os valores que o usuário digita...
            Pai base = new Pai(Nome, Evento, Telefone);

            
            //Aqui estamos a pegar a variavél base  da classe pai dentro do ArrayLis DADOS, com todos os valores que o usuário digitou...
            DADOS.add(base);
            System.out.println("QUER CONTINUAR? SIM[1] NÃO[2]");
            System.out.print("R:");
            escolha = m.nextInt();
            
            if(escolha == 2){
                break;
            }
        }

    }

    void Lista_Eventos() {

    
        int ID = 0;
        String j = "";

        //Aqui  estamos a checar se o nosso ArrayList está vazio e retomar uma mensagem de erro.
        if (DADOS.isEmpty()) {
            System.out.println("NÃO TEM NENHUM EVENTO REGISTADO");
            return;
            //Se o Array estiver vazio ela imprime a mensagem e volta, já não executa nenhum comando abaixo.
        }

        System.out.println("");
        System.out.println("LISTA DAS AGENDAS: ");
        
        //Aqui estamos a fazer uma varredura no Array e imprimir todos os dados que foram registrados
        for (int i = 0; i < DADOS.size(); i++) {
            
            ID += 1;
            // A cada laço é acrescentado 1 valor na variável ID
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Agenda Nº :" +ID);
            System.out.println("Nome      : " +DADOS.get(i).getNome());
            System.out.println("Evento    : " +DADOS.get(i).getEventos());
            System.out.println("Telefone  : " +DADOS.get(i).getTelefone());
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("");
            
             //Aqui ela imprime os dados de acordo com as posições

            
           
        }
    }

    void Sair() {
        System.out.println(" \n\n\n \t\t ----> Agenda Finalizada <---- ");
        return;
    }

    void Defult() {
        System.out.println(" \n\n\n\t ==> Opção Inválida! <== ");
        System.out.println(" \t  => Tenta outra vez <= \n ");

    }

    void Apagar_Agendamento() {
        
        
        
        if(DADOS.isEmpty()){
            System.out.println("NÃO TEM NENHUM AGENDAMENTO REGISTRADO");
            return;
        }
        DADOS.removeAll(DADOS);
        System.out.println("OS EVENTOS FORAM CANCELADOS");

    }

}
