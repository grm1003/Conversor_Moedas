


import javax.swing.JOptionPane;

import java.io.IOException;

import javax.swing.JFrame;

public class Executar  {
    public static void main(String[] args) throws IOException {


        JFrame frame = new JFrame("JOptionPane teste");
        JOptionPane.showMessageDialog(frame, "Seja bem vindo, ao conversor");
        Object[] conversor = {"Moedas","Temperatura"};
        Object[] continuar = {"Sim","Não"};
        String cv = (String) JOptionPane.showInputDialog(frame, "Escolha o tipo de moeda que voce vai inserir",
                "Opcao", JOptionPane.INFORMATION_MESSAGE, null, conversor, null);
        if(cv == "Moedas") {
            while(1>0) {
                Conversormoeda dinheiro = new Conversormoeda();
                dinheiro.tela();
                String in = (String) JOptionPane.showInputDialog(frame, "Deseja continuar?",
                        "Opcao", JOptionPane.INFORMATION_MESSAGE, null, continuar, null);
                if (in == "Não"){
                    break;
                }

            }
        }else {
            while(1>0) {
                Conversortemperatura temperatura = new Conversortemperatura();
                Conversortemperatura.tela();
                String in = (String) JOptionPane.showInputDialog(frame, "Deseja continuar?",
                        "Opcao", JOptionPane.INFORMATION_MESSAGE, null, continuar, null);
                if (in == "Não") {
                    break;
                }
            }

        }


    }

    }

