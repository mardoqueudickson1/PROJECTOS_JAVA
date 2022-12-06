package unitel;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author José Dias
 */
public class UNITEL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int ESCOLHA = 10010;
        int plano, t = 0;
        int pass = 1;

        PRINCIPAL p = new PRINCIPAL();

        while (true) {

            int senha = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A SENHA: "));
            t += 1;

            if (senha == pass) {
                while (true) {

                    ESCOLHA = Integer.parseInt(JOptionPane.showInputDialog("\n1-REGISTRAR NÚMERO\n2-COMPRAR SALDO\n3-LISTAR NÚMEROS\n4-REEMBOLSAR\n5-ATUALIZAR\n6-ELIMINAR\n0-SAIR\n\n ESCOLHA OPÇÃO: "));

                    if (ESCOLHA == 1) {
                        int num = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O NUMERO: "));
                        p.registrar(num);

                    }
                    if (ESCOLHA == 2) {

                        int saldos = Integer.parseInt(JOptionPane.showInputDialog("\n1-SALDO 500Kz\n2-SALDO 1000Kz\n3-SALDO 2000Kz\n\n ESCOLHA OPÇÃO: "));
                        if (saldos == 1) {

                            plano = 500;
                            p.comprar(plano);
                        }
                        if (saldos == 2) {

                            plano = 1000;
                            p.comprar(plano);
                        }
                        if (saldos == 3) {
                            plano = 2000;
                            p.comprar(plano);
                        }

                    }

                    if (ESCOLHA == 3) {
                        p.ver();
                    }

                    if (ESCOLHA == 4) {

                        int resp = Integer.parseInt(JOptionPane.showInputDialog("\n1-REEMBOLSAR\n2-VER NÚMEROS REEMBOLSADOS\n\n ESCOLHA OPÇÃO: "));

                        if (resp == 1) {
                            int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O ID DO NÚMERO: "));
                            p.rembolsar(id);
                        }

                        if (resp == 2) {
                            p.verR();
                        }

                    }

                    if (ESCOLHA == 5) {
                        
                        int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O ID NÚMERO: "));
                        p.actualizar(id);
                    }

                    if (ESCOLHA == 6) {
                        int resp = Integer.parseInt(JOptionPane.showInputDialog("\n1-ELIMINAR\n2-ELIMINAR TODOS\n\n ESCOLHA OPÇÃO: "));
                        if (resp == 1) {
                            int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O ID DO NÚMERO: "));
                            p.eliminar(id);
                        }

                        if (resp == 2) {
                            p.eliminarT();
                        }

                    }

                    if (ESCOLHA == 0) {

                        break;
                    }

                }

            }

            if (t == 3) {
                JOptionPane.showMessageDialog(null, "EXCEDEU O NÚMERO DE TENTIVAS");
                break;
            }

            if (ESCOLHA == 0) {
                JOptionPane.showMessageDialog(null, "FIM DO PROGRAMA");
                break;
            }
        }

    }

}
