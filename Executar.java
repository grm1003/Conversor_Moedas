


import javax.swing.JOptionPane;

import java.io.IOException;

import javax.swing.JFrame;

public class Executar extends Conversormoeda  {
    public static void main(String[] args) throws IOException {

        JFrame frame = new JFrame("JOptionPane teste");
        JOptionPane.showMessageDialog(frame, "Seja bem vindo, ao conversor");
        Object[] moedas = {"Dolar","Euro","Peso Argentino","Peso Chileno","Real","Libra Esterlina"};
        String in = (String) JOptionPane.showInputDialog(frame, "Escolha o tipo de moeda que voce vai inserir",
                "Opcao", JOptionPane.INFORMATION_MESSAGE, null, moedas, null);
        String n_string = JOptionPane.showInputDialog("Digite o valor para ser convertido:");
        double n = Double.parseDouble(n_string);
        String out = (String) JOptionPane.showInputDialog(frame, "Escolha o tipo de moeda que o valor vai se coverter",
                "Opcao", JOptionPane.INFORMATION_MESSAGE, null, moedas, null);
        float n_out =  (float) converte(n, in, out);
        JOptionPane.showMessageDialog(frame, "O valor convertido para "+ out + " eh " + n_out);
            

    }
}
