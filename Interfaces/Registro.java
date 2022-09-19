package Interfaces;

import java.awt.Font;
import javax.swing.*;
import Interfaces.Components.Butao;

public class Registro {
    int telaHeight = 600, telaWidth = 400, textoHeight = 25, textoWidth = 200, gap = 30, paddinTop = 55;
    public Registro(){
        JFrame tela = new JFrame();

        JLabel titulo = new JLabel("REGISTRAR");
        titulo.setFont(new Font("Arial", Font.BOLD, textoHeight));
        titulo.setBounds(telaWidth - 3*textoWidth/2, textoHeight+paddinTop, textoWidth, textoHeight);
        titulo.setHorizontalAlignment(JTextField.CENTER);
        
        JLabel usuario = new JLabel("USUÁRIO");
        usuario.setBounds(telaWidth - 3*textoWidth/2, textoHeight+gap*1+paddinTop, textoWidth, textoHeight);
        JTextField usuarioInput = new JTextField();
        usuarioInput.setBounds(telaWidth - 3*textoWidth/2, textoHeight+gap*2+paddinTop, textoWidth, textoHeight);

        JLabel senha = new JLabel("SENHA");
        senha.setBounds(telaWidth - 3*textoWidth/2, textoHeight+gap*3+paddinTop, textoWidth, textoHeight);
        JPasswordField senhaInput = new JPasswordField();
        senhaInput.setBounds(telaWidth - 3*textoWidth/2, textoHeight+gap*4+paddinTop, textoWidth, textoHeight);

        JLabel usuarioNome = new JLabel("NOME");
        usuarioNome.setBounds(telaWidth - 3*textoWidth/2, textoHeight+gap*5+paddinTop, textoWidth, textoHeight);
        JTextField usuarioNomeInput = new JTextField();
        usuarioNomeInput.setBounds(telaWidth - 3*textoWidth/2, textoHeight+gap*6+paddinTop, textoWidth, textoHeight);

        JLabel usuarioArea = new JLabel("AREA DE ATUAÇÃO");
        usuarioArea.setBounds(telaWidth - 3*textoWidth/2, textoHeight+gap*7+paddinTop, textoWidth, textoHeight);
        JTextField usuarioAreaInput = new JTextField();
        usuarioAreaInput.setBounds(telaWidth - 3*textoWidth/2, textoHeight+gap*8+paddinTop, textoWidth, textoHeight);

        JButton enviar = new Butao("CADASTRAR");
        enviar.setBounds(telaWidth - 3*textoWidth/2, textoHeight+gap*(9+1)+paddinTop, textoWidth, textoHeight);

        JButton cadastrar = new Butao("ENTRAR");
        cadastrar.setBounds(telaWidth - 3*textoWidth/2, textoHeight+gap*(10+1)+paddinTop, textoWidth, textoHeight);

        tela.add(titulo);
        tela.add(usuario);
        tela.add(usuarioInput);
        tela.add(senha);
        tela.add(senhaInput);
        tela.add(usuarioNome);
        tela.add(usuarioNomeInput);
        tela.add(usuarioArea);
        tela.add(usuarioAreaInput);
        tela.add(enviar);
        tela.add(cadastrar);

        tela.setSize(telaWidth, telaHeight);
        tela.setResizable(false);
        tela.setLayout(null);
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
