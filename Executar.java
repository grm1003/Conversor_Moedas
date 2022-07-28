


import javax.swing.JOptionPane;

import java.io.IOException;

import javax.swing.JFrame;

public class Executar  {
    public static void main(String[] args) throws IOException {


        JFrame frame = new JFrame("JOptionPane teste");
        JOptionPane.showMessageDialog(frame, "Seja bem vindo, ao conversor");
        Object[] conversor = {"Moedas","Temperatura"};
        String cv = (String) JOptionPane.showInputDialog(frame, "Escolha o tipo de moeda que voce vai inserir",
                "Opcao", JOptionPane.INFORMATION_MESSAGE, null, conversor, null);
        if(cv == "Moedas") {
            Conversormoeda dinheiro = new Conversormoeda();
            dinheiro.tela();
        }else {
           Conversortemperatura temperatura = new Conversortemperatura();
           Conversortemperatura.tela();

        }

    }

    }

