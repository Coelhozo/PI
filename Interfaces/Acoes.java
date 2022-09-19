package Interfaces;

import Interfaces.Components.Butao;
import javax.swing.*;
import java.awt.Font;

public class Acoes {
    int telaHeight = 400, telaWidth = 600, textoHeight = 25, textoWidth = telaWidth/2, gap = 30, paddinTop = 55;

    public Acoes(){
        JFrame tela = new JFrame();

        JLabel titulo = new JLabel("BEM-VINDO FULANO");
        titulo.setFont(new Font("Arial", Font.BOLD, textoHeight));
        titulo.setBounds(telaWidth - 3*textoWidth/2, textoHeight+paddinTop, textoWidth, textoHeight);
        titulo.setHorizontalAlignment(JTextField.CENTER);

        JButton inserir = new Butao("INSERIR PERGUNTA");
        inserir.setBounds(telaWidth - 3*textoWidth/2, textoHeight+gap*2+paddinTop, textoWidth, textoHeight);
    
        JButton criar = new Butao("INICIAR ENTREVISTA");
        criar.setBounds(telaWidth - 3*textoWidth/2, textoHeight+gap*3+paddinTop, textoWidth, textoHeight);

        JButton exibir = new Butao("EXIBIR HISTÓRICO");
        exibir.setBounds(telaWidth - 3*textoWidth/2, textoHeight+gap*4+paddinTop, textoWidth, textoHeight);
    
        tela.add(titulo);
        tela.add(inserir);
        tela.add(criar);
        tela.add(exibir);

        tela.setSize(telaWidth, telaHeight);
        tela.setResizable(false);
        tela.setLayout(null);
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
