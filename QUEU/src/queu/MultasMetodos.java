package queu;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Mardoqueu Dickson
 */
public class MultasMetodos implements IMULTAS {

    ArrayList<DadosMulta> Lista = new ArrayList<>();

    @Override
    public void multar(String nomeAg, String nomeC, String nomeCarro, String corCarro, String data, String local) {

        double multa = 0;
        int valor = 7000;
        int limite = 80;
        double velocidade = Double.parseDouble(JOptionPane.showInputDialog("Qual é a tua velocidade do carro: "));
        if (velocidade > limite) {

            multa = (velocidade - limite) * valor;
            JOptionPane.showMessageDialog(null, "Excedeu o limite de velocidade!\n\n A sua multa é de " + multa + "Kz");
            ;

        }

        DadosMulta dados = new DadosMulta(nomeAg, nomeC, nomeCarro, corCarro, data, local, multa);
        Lista.add(dados);

    }

    @Override
    public void consultarMulta(int id) {
       
        System.out.println("NOMe" +Lista.get(id).getNomeAg());
        JOptionPane.showMessageDialog(null, "Nome do agente: " + Lista.get(id).getNomeAg() + "\nNome do condutor: " + Lista.get(id).getNomeC() + "\nNome do carro: " + Lista.get(id).getNomeCarro() + "\nCor do carro: " + Lista.get(id).getCorCarro() + "\nData: " + Lista.get(id).getData() + "\nLocal: " + Lista.get(id).getLocal() + "\nMulta: " + Lista.get(id).getMulta());
    }

    @Override
    public void actualizarMultar(int id, String nomeAg, String nomeC, String nomeCarro, String corCarro, String data, String local, double  multa) {
        
        
        DadosMulta dados = new DadosMulta(nomeAg, nomeC, nomeCarro, corCarro, data, local, multa);
        Lista.set(id, dados);
    }

    @Override
    public void removerMulta(int id) {
        Lista.remove(id);
    }

}
