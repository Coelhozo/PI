package Interfaces;
import java.awt.Font;
import javax.swing.*;
import Interfaces.Components.Butao;
//import java.awt.*;
public class Login {
    int telaHeight = 450, telaWidth = 400, textoHeight = 25, textoWidth = 200, gap = 30, paddinTop = 55;
    public Login(){
        JFrame tela = new JFrame();

        JLabel titulo = new JLabel("ENTRAR");
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

        JButton enviar = new Butao("ENVIAR");
        enviar.setBounds(telaWidth - 3*textoWidth/2, textoHeight+gap*5+paddinTop, textoWidth, textoHeight);

        JButton cadastrar = new Butao("CADASTRE-SE");
        cadastrar.setBounds(telaWidth - 3*textoWidth/2, textoHeight+gap*6+paddinTop, textoWidth, textoHeight);

        tela.add(titulo);
        tela.add(usuario);
        tela.add(usuarioInput);
        tela.add(senha);
        tela.add(senhaInput);
        tela.add(enviar);
        tela.add(cadastrar);

        tela.setSize(telaWidth, telaHeight);
        tela.setResizable(false);
        tela.setLayout(null);
        tela.setVisible(true);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
