package agenda;

import java.util.Scanner;

public class Agendamento extends Metodos {

    public static void main(String[] args) {

        //Costumize-o
        //Senha vai ao teu critério
        
       
        int escolha = 300;
        int password = 12345;
        int v = 0;

        Metodos Mt = new Metodos();
        Scanner in = new Scanner(System.in);

        System.out.print("DIGITE A PASSWORD: ");
        v = in.nextInt();
        while (true) {

                //Checagem da palavra passe
            if (v != password) {
                System.out.println("SENHA ERRADA!");
                System.out.println("FIM DO PROGRAMA");
                break;

            } else {
                System.out.println("");
                System.out.println(" [1] - Agendar ");
                System.out.println(" [2] - Consultar Agenda ");
                System.out.println(" [3] - Cancelar Agendamento ");
                System.out.println(" [4] - sair \n\n");
                System.out.print(" Escolher opção: ");
                escolha = in.nextInt();
                switch (escolha) {

                    case 1:

                        Mt.Angendar_Evento();
                        break;

                    case 2:
                        Mt.Lista_Eventos();
                        break;
                        
                    case 3:
                    Mt.Apagar_Agendamento();
                    break;

                    case 4:
                        Mt.Sair();
                        break;
                        
                    default:
                        Mt.Defult();

                
                }
                
            }
            
            if(escolha == 4){
                break;
            }
        }

    }
}
