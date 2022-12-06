package unitel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author José Dias
 */
public class PRINCIPAL extends METODOS {

    ArrayList<REGISTROS> registros = new ArrayList<>();
    ArrayList<String> Jreembolsados = new ArrayList<>();

    int rembolso = 0;
    int saldoo = 0;
    boolean just = false;

    //Metodo registrar
    @Override
    public void registrar(int num) {
        //Pega data do SISTEMA OPERATIVO e converte em String
        Date dd = new Date();
        DateFormat converte = new SimpleDateFormat("dd/MM/yyyy / HH:mm:ss");
        String data = converte.format(dd);

        REGISTROS dados = new REGISTROS(num, saldoo, rembolso, data, just);
        registros.add(dados);
        JOptionPane.showMessageDialog(null, "NÚMERO REGISTRADO COM SUCESSO ");

    }

    @Override
    public void ver() {

        if (registros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "NÃO TEM NENHUM NÚMERO NA BASE DE DADOS ");
            return;
        }

        for (var i : registros) {

            System.out.println();
            JOptionPane.showMessageDialog(null, "DANCO DE DADOS\n\nNÚMERO: " + i.numero + "\nSALDO: " + i.saldo + "\nSALDO REEMBOLSADO: " + i.remboslso + "\n-DATA DE REGISTRO: " + i.getData());
        }

    }

    @Override
    public void verR() {

        boolean s = false;
        if (registros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "NÃO FOI REEMBOLSADO NEHUM NÚMERO AINDA");
            return;
        }

        for (var i : Jreembolsados) {
            JOptionPane.showMessageDialog(null, "NÚMEROS REEMBOLSADO\n\nNÚMERO: " + i);
        }
    }

    @Override
    public void actualizar(int id) {
        
       boolean s = false;
       
        for (int j = 0; j < registros.size(); j++) {

            if (id == j) {

                s = true;
            }
        }
        if (s == false) {
            JOptionPane.showMessageDialog(null, "ID INVÁLIDO");
            return;
        }
        int num = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O NOVO NÚMERO: "));
        int saldoo = registros.get(id).getSaldo();
        int rembolso = registros.get(id).getRemboslso();
        boolean ja = registros.get(id).isJust();
        String data = registros.get(id).getData();

        REGISTROS dados = new REGISTROS(num, saldoo, rembolso, data, ja);
        registros.set(num, dados);
    }

    @Override
    public void eliminar(int id) {

        boolean s = false;

        for (int j = 0; j < registros.size(); j++) {

            if (id == j) {

                s = true;
            }
        }
        if (s == false) {
            JOptionPane.showMessageDialog(null, "ID NÃO INVÁLIDO");
            return;
        }

        String resp = JOptionPane.showInputDialog("TEM CERTEZA QUE QUER ELIMINAR TUDO?\n\nSIM[S] NÃO[N]: ");
        if (resp.equals("SIM") || resp.equals("sim") || resp.equals("s") || resp.equals("S")) {
            registros.removeAll(registros);
            JOptionPane.showMessageDialog(null, "LISTA APAGADA COM SUCESSO");
        }
    }

    @Override
    public void eliminarT() {

        String resp = JOptionPane.showInputDialog("TEM CERTEZA QUE QUER ELIMINAR TUDO?\n\nSIM[S] NÃO[N]: ");
        if (resp.equals("SIM") || resp.equals("sim") || resp.equals("s") || resp.equals("S")) {
            registros.removeAll(registros);
            JOptionPane.showMessageDialog(null, "LISTA APAGADA COM SUCESSO");
        }

    }

    @Override
    public void rembolsar(int id) {

        int plano = registros.get(id).getSaldo();
        boolean s = false;

        //FAZ ATUALIZAÇÃO COM OS DADOS EXISTENTES
        int numN = registros.get(id).getNumero();
        String dataN = registros.get(id).getData();

        for (int j = 0; j < registros.size(); j++) {

            if (id == j) {

                s = true;
            }
        }
        if (s == false) {
            JOptionPane.showMessageDialog(null, "ID  INVÁLIDO");
            return;

        }

        //CHECKA SE O NÚMERO JÁ RECEBEU REEMBOLSO
        if (registros.get(id).isJust() != true) {

            if (s == true) {

                if (registros.get(id).getSaldo() == 0) {
                    JOptionPane.showMessageDialog(null, "O NÚMERO " + registros.get(id).getNumero() + "NÃO TEM NENHUM PLANO.\nPRECISA RECARREGAR A SUA CONTA");
                    return;
                }
                //CALCULO DE PERCENTAGEM
                if (registros.get(id).getSaldo() == 500) {

                    just = true;
                    int saldoRE = (plano / 100) * 25;
                    REGISTROS dados = new REGISTROS(numN, plano, saldoRE, dataN, just);
                    int dd = registros.get(id).numero;
                    String a = String.valueOf(dd);
                    Jreembolsados.add(a);
                    registros.set(id, dados);
                    JOptionPane.showMessageDialog(null, "NÚMERO                           "+ registros.get(id).getNumero() + " FOI REEMBOLSADO SALDO DE " + saldoRE + "kz");

                }

                if (registros.get(id).getSaldo() == 1000) {
                    just = true;
                    int saldoRE = (plano / 100) * 45;
                    REGISTROS dados = new REGISTROS(numN, plano, saldoRE, dataN, just);
                    registros.set(id, dados);
                    int dd = registros.get(id).numero;
                    String a = String.valueOf(dd);
                    Jreembolsados.add(a);
                    registros.set(id, dados);
                    JOptionPane.showMessageDialog(null, "FOI REEMBOLSADO SALDO DE " + saldoRE + "kz");

                }

                if (registros.get(id).getSaldo() == 2000) {
                    just = true;
                    int saldoRE = (plano / 100) * 65;
                    REGISTROS dados = new REGISTROS(numN, plano, saldoRE, dataN, just);
                    registros.set(id, dados);
                    int dd = registros.get(id).numero;
                    String a = String.valueOf(dd);
                    Jreembolsados.add(a);
                    registros.set(id, dados);
                    JOptionPane.showMessageDialog(null, "FOI REEMBOLSADO SALDO DE " + saldoRE + "kz");

                }
            }

        } else if (registros.get(id).isJust() == true) {
            JOptionPane.showMessageDialog(null, "O NÚMERO JÁ FOI REEMBOLSADO, NÃO PODE REMBOLSAR 2 VEZES");
        }

    }
    
    public void VerRe(){
         if (registros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "NÃO FOI REEMBOLSADO NEHUM NÚMERO AINDA");
            return;
        }
        
    }

    //MÉTODO COMPRAR SALDO
    @Override
    public void comprar(int saldoN) {

        int plano = saldoN;
        boolean s = false;

        int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O ID DO NÚMERO: "));

        for (int j = 0; j < registros.size(); j++) {

            if (id == j) {

                s = true;
            }
        }
        if (s == false) {
            JOptionPane.showMessageDialog(null, "ID INVÁLIDO");
            return;

        }
        int re = registros.get(id).getRemboslso();

        //CHECKA SE O ID FAZ PARTE DO ARRAYLIST
        //FAZ ATUALIZAÇÃO COM OS DADOS EXISTENTES
        int numN = registros.get(id).getNumero();
        String dataN = registros.get(id).getData();

        if (s == true) {
            REGISTROS dados = new REGISTROS(numN, saldoN, re, dataN, just);
            registros.set(id, dados);
            JOptionPane.showMessageDialog(null, "SALDO COMPRADO COM SUCESSO");
        }

    }

}
