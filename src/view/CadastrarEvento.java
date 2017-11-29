package view;

import model.Evento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by igor on 30/10/17.
 */
public class CadastrarEvento extends JPanel{
    JLabel nomeEventolb;
    JLabel precoIngressolb;
    JLabel qtdIngressosDisponiveislb;
    JLabel descontoClienteEspeciallb;

    JTextField nomeEventotxt;
    JTextField precoIngressotxt;
    JTextField qtdIngressosDisponiveistxt;
    JTextField descontoClienteEspecialtxt;

    JButton cadastrar;

    public JTextField getNomeEventotxt() {
        return nomeEventotxt;
    }

    public JTextField getPrecoIngressotxt() {
        return precoIngressotxt;
    }

    public JTextField getQtdIngressosDisponiveistxt() {
        return qtdIngressosDisponiveistxt;
    }

    public JTextField getDescontoClienteEspecialtxt() {
        return descontoClienteEspecialtxt;
    }

    public CadastrarEvento (Color backGroundColour, final TelaPrincipal telaPrincipal){

        nomeEventolb = new JLabel("Nome do evento: ");
        precoIngressolb = new JLabel("Preço do ingresso: ");
        qtdIngressosDisponiveislb = new JLabel("Total de ingressos: ");
        descontoClienteEspeciallb = new JLabel("Desconto do cliente especial (em porcentagem): ");

        nomeEventotxt = new JTextField(20);
        precoIngressotxt = new JTextField(10);
        qtdIngressosDisponiveistxt = new JTextField(10);
        descontoClienteEspecialtxt = new JTextField(3);

        cadastrar = new JButton("Salvar");

        add(nomeEventolb);
        add(nomeEventotxt);
        add(precoIngressolb);
        add(precoIngressotxt);
        add(qtdIngressosDisponiveislb);
        add(qtdIngressosDisponiveistxt);
        add(descontoClienteEspeciallb);
        add(descontoClienteEspecialtxt);
        add(cadastrar);

        cadastrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    telaPrincipal.getControladorPrincipal().getEventos().add(new Evento(telaPrincipal.getEvento()));
                    telaPrincipal.getVenderIngresso().attPage(telaPrincipal);
                    //telaPrincipal.attMenuBar();
                    JOptionPane.showMessageDialog(null, "Evento cadastrado com sucesso");
                    // TODO Auto-generated method stub
                    telaPrincipal.telaBase();
                }catch (Exception j) {
                    // TODO: handle exception
                    JOptionPane.showMessageDialog(null, "Erro");
                    telaPrincipal.telaBase();
                }
                //System.out.printf("%f", Float.parseFloat(precoIngressotxt.getText()));



//                telaPrincipal.getControladorPrincipal().getEventos().add(new Evento(telaPrincipal.getEvento()));
//                telaPrincipal.getVenderIngresso().attPage(telaPrincipal);
//                //telaPrincipal.attMenuBar();
//                JOptionPane.showMessageDialog(null, "Evento cadastrado com sucesso");
//                // TODO Auto-generated method stub
//                telaPrincipal.telaBase();
            }
        });
    }
}
