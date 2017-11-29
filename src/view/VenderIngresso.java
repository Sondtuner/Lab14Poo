package view;

import model.Ingresso;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by igor on 30/10/17.
 */
public class VenderIngresso extends JPanel{
    JComboBox<String> clientes;
    JComboBox<String> modoDePagamento;
    JComboBox<String> evento;

    JLabel clientelb;
    JLabel qtdIngressoslb;
    JLabel modoDePagamentolb;
    JLabel eventolb;

    JTextField qtdIngressostxt;

    JButton concluir;

    String[] teste;


    public VenderIngresso(Color backGroundColour, final TelaPrincipal telaPrincipal){
        teste = new String[1];
        clientes = new JComboBox(teste);
        modoDePagamento = new JComboBox<>(new String[]{"Cartão de crédito", "Cartão de débito", "Dinheiro em espécie"});
        evento = new JComboBox<>(teste);
        qtdIngressoslb = new JLabel("Quantidades de ingressos desejados: ");
        modoDePagamentolb = new JLabel("Modo de pagamento: ");
        clientelb = new JLabel("Cliente: ");

        qtdIngressostxt = new JTextField(5);

        concluir = new JButton("Concluir");

        concluir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                try{
                    for (int i = 0; i<Integer.parseInt(qtdIngressostxt.getText()); i++) {
                    telaPrincipal.getControladorPrincipal().getIngressos().add(new Ingresso(telaPrincipal.getVenderIngresso(), telaPrincipal));
                }
                    telaPrincipal.attIngressosVendidos();
                    telaPrincipal.telaBase();
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                }catch (Exception j) {
                    // TODO: handle exception
                    JOptionPane.showMessageDialog(null, "Erro");
                    telaPrincipal.telaBase();
                }


            }
        });

        add(clientelb);
        add(clientes);
        add(qtdIngressoslb);
        add(qtdIngressostxt);
        add(modoDePagamentolb);
        add(modoDePagamento);
        add(concluir);

    }

    public JComboBox<String> getEvento() {
        return evento;
    }

    public void reloadPage(final TelaPrincipal telaPrincipal){
        clientes = new JComboBox(telaPrincipal.getControladorPrincipal().getNomes());
        modoDePagamento = new JComboBox<>(new String[]{"Cartão de crédito", "Cartão de débito", "Dinheiro em espécie"});
        evento = new JComboBox<>(telaPrincipal.getControladorPrincipal().getNomesEventos());

        qtdIngressoslb = new JLabel("Quantidades de ingressos desejados: ");
        modoDePagamentolb = new JLabel("Modo de pagamento: ");
        clientelb = new JLabel("Cliente: ");
        eventolb = new JLabel("Evento: ");


        qtdIngressostxt = new JTextField(5);

        concluir = new JButton("Concluir");

        concluir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                try{
                    if (Integer.parseInt(telaPrincipal.getVenderIngresso().getQtdIngressostxt().getText())+telaPrincipal.getControladorPrincipal().getEventos().get(telaPrincipal.getVenderIngresso().getEvento().getSelectedIndex()).getQtdIngressosVendidos()<=telaPrincipal.getControladorPrincipal().getEventos().get(telaPrincipal.getVenderIngresso().getEvento().getSelectedIndex()).getQtdTotalDeIngressos()) {
                    for (int i = 0; i < Integer.parseInt(qtdIngressostxt.getText()); i++) {
                        telaPrincipal.getControladorPrincipal().getIngressos().add(new Ingresso(telaPrincipal.getVenderIngresso(), telaPrincipal));
                    }
                    JOptionPane.showMessageDialog(null, "Ingresso(s) vendido(s) com sucesso");
                }else {
                    System.out.printf("%d + %d = %d",Integer.parseInt(telaPrincipal.getVenderIngresso().getQtdIngressostxt().getText()), telaPrincipal.getControladorPrincipal().getEventos().get(telaPrincipal.getVenderIngresso().getEvento().getSelectedIndex()).getQtdIngressosVendidos(), telaPrincipal.getControladorPrincipal().getEventos().get(telaPrincipal.getVenderIngresso().getEvento().getSelectedIndex()).getQtdTotalDeIngressos());
                    JOptionPane.showMessageDialog(null, "Numero de ingressos nao disponiveis");
                }
                    telaPrincipal.attIngressosVendidos();

                    telaPrincipal.telaBase();
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                }catch (Exception j) {
                    // TODO: handle exception
                    JOptionPane.showMessageDialog(null, "Erro");
                    telaPrincipal.telaBase();
                }


            }
        });

        add(clientelb);
        add(clientes);
        add(eventolb);
        add(evento);
        add(qtdIngressoslb);
        add(qtdIngressostxt);
        add(modoDePagamentolb);
        add(modoDePagamento);
        add(concluir);

    }

    public JComboBox<String> getClientes() {
        return clientes;
    }

    public JComboBox<String> getModoDePagamento() {
        return modoDePagamento;
    }

    public JTextField getQtdIngressostxt() {
        return qtdIngressostxt;
    }

    public String[] getTeste() {
        return teste;
    }

    public void attPage(final TelaPrincipal telaPrincipal){

        this.removeAll();
        this.reloadPage(telaPrincipal);
        //telaPrincipal.reloadVenderIngresso();
    }

}
