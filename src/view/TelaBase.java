package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by igor on 30/10/17.
 */
public class TelaBase extends JPanel{
    private JButton venderIngresso;
    private JButton visualizarIngressos;
    private JButton cadastrarCliente;
    private JButton cadastrarEvento;

    public TelaBase(Color backGroundColour, final TelaPrincipal telaPrincipal){
        venderIngresso = new JButton("Vender Ingresso");
        visualizarIngressos = new JButton("Visualizar ingressos");
        cadastrarCliente = new JButton("Cadastrar cliente");
        cadastrarEvento = new JButton("Cadastrar evento");

        add(venderIngresso);
        add(visualizarIngressos);
        add(cadastrarCliente);
        add(cadastrarEvento);

        cadastrarCliente.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                telaPrincipal.cadastrarCliente();
//                telaPrincipal.addMenuBar();
//                telaPrincipal.telaCadastro();
            }
        });
        cadastrarEvento.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                telaPrincipal.cadastrarEvento();
//                telaPrincipal.addMenuBar();
//                telaPrincipal.telaCadastro();
            }
        });
        visualizarIngressos.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                telaPrincipal.ingressosVendidos();
//                telaPrincipal.addMenuBar();
//                telaPrincipal.telaCadastro();
            }
        });
        venderIngresso.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                telaPrincipal.venderIngresso();
//                telaPrincipal.addMenuBar();
//                telaPrincipal.telaCadastro();
            }
        });
    }
}
