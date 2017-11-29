package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by igor on 30/10/17.
 */
public class Login extends JPanel{
    private JLabel loginlb;
    private JLabel senhalb;

    private JTextField logintxt;
    private JPasswordField senhatxt;

    private JButton entrar;

    public Login(Color backGroundColour, final TelaPrincipal telaPrincipal){
        loginlb = new JLabel("Login: ");
        senhalb = new JLabel("Senha: ");

        logintxt = new JTextField(20);
        senhatxt = new JPasswordField(20);

        entrar = new JButton("Entrar");



        add(loginlb);
        add(logintxt);
        add(senhalb);
        add(senhatxt);
        add(entrar);


        entrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //telaPrincipal.addMenuBar();
                telaPrincipal.telaBase();

            }
        });

    }
}
