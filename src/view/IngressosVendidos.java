package view;

import model.Ingresso;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by igor on 30/10/17.
 */
public class IngressosVendidos extends JPanel{
    private JLabel ingVendidos;
    private JLabel informacoes;

    private JList ingressos;

    private JScrollPane scrollPane;
    //Vector teste;
    private JButton entrar;

    private JButton visualizarInformacoes;

    public IngressosVendidos(Color backGroundColour, final TelaPrincipal telaPrincipal){


        ingVendidos = new JLabel("Ingressos Vendidos: ");


        ingressos = new JList(telaPrincipal.getControladorPrincipal().getIdsIngresso());

        scrollPane = new JScrollPane();

        scrollPane.setViewportView(ingressos);

        entrar = new JButton("Voltar");
        visualizarInformacoes = new JButton("Visualizar informações");

        add(ingVendidos);
        add(scrollPane);

        add(entrar);

        add(visualizarInformacoes);



        visualizarInformacoes.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    // TODO Auto-generated method stub
//                String teste = "Nome: ".concat(telaPrincipal.getControladorPrincipal().getClientes().get(ingressos.getSelectedIndex()).getNome()).concat("\nCPF: ").concat(telaPrincipal.getControladorPrincipal().getClientes().get(ingressos.getSelectedIndex()).getCpf()).concat("\nEndereço: ").concat(telaPrincipal.getControladorPrincipal().getClientes().get(ingressos.getSelectedIndex()).getEndereco()).concat("\nTelefone: ").concat(telaPrincipal.getControladorPrincipal().getClientes().get(ingressos.getSelectedIndex()).getTelefone()).concat("\nCidade: ").concat(telaPrincipal.getControladorPrincipal().getClientes().get(ingressos.getSelectedIndex()).getCidade()).concat("\nData de nascimento: ").concat(telaPrincipal.getControladorPrincipal().getClientes().get(ingressos.getSelectedIndex()).getDataDeNascimento());
                    telaPrincipal.getIngressosVendidos().reloadPage(telaPrincipal);
                    telaPrincipal.ingressosVendidos();
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                }catch (Exception j) {
                    // TODO: handle exception
                    JOptionPane.showMessageDialog(null, "Erro");
                }

            }
        });
        entrar.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {

                // TODO Auto-generated method stub
                telaPrincipal.telaBase();

            }
        });

    }

    public void reloadPage(TelaPrincipal telaPrincipal){
        this.removeAll();
//
//        ingVendidos = new JLabel("Ingressos Vendidos: ");
//
//
//        ingressos = new JList(telaPrincipal.getControladorPrincipal().getIdsIngresso());
//
//        scrollPane = new JScrollPane();
//
//        scrollPane.setViewportView(ingressos);
//
//        entrar = new JButton("Voltar");
//        visualizarInformacoes = new JButton("Visualizar informações");

        add(ingVendidos);
        add(scrollPane);

        add(entrar);

        add(visualizarInformacoes);

        //System.out.printf("%s", String.valueOf(telaPrincipal.getControladorPrincipal().getIngressos().get(ingressos.getSelectedIndex()).getPreco()));
        String aux = String.valueOf(telaPrincipal.getControladorPrincipal().getIngressos().get(ingressos.getSelectedIndex()).getPreco());
//        String teste = "Nome: ".concat(telaPrincipal.getControladorPrincipal().getIngressos().get(ingressos.getSelectedIndex()).getCliente().getNome());
        String teste = "Nome: ".concat(telaPrincipal.getControladorPrincipal().getIngressos().get(ingressos.getSelectedIndex()).getCliente().getNome()).concat(" - CPF: ").concat(telaPrincipal.getControladorPrincipal().getIngressos().get(ingressos.getSelectedIndex()).getCliente().getCpf()).concat(" - Endereço: ").concat(telaPrincipal.getControladorPrincipal().getIngressos().get(ingressos.getSelectedIndex()).getCliente().getEndereco()).concat(" - Telefone: ".concat(telaPrincipal.getControladorPrincipal().getIngressos().get(ingressos.getSelectedIndex()).getCliente().getTelefone())).concat(" - Evento: ".concat(telaPrincipal.getControladorPrincipal().getIngressos().get(ingressos.getSelectedIndex()).getEvento().getNome()));
        System.out.printf(teste);
//        informacoes = new JLabel("Nome: ".concat(telaPrincipal.getControladorPrincipal().getIngressos().get(ingressos.getSelectedIndex()).getCliente().getNome()));
//        add(informacoes);
//        informacoes = new JLabel("CPF: ".concat(telaPrincipal.getControladorPrincipal().getIngressos().get(ingressos.getSelectedIndex()).getCliente().getCpf()));
//        add(informacoes);
        informacoes = new JLabel(teste);
        add(informacoes);
        informacoes = new JLabel("Cidade: ".concat(telaPrincipal.getControladorPrincipal().getIngressos().get(ingressos.getSelectedIndex()).getCliente().getCidade()).concat(" - Data de nascimento: ").concat(telaPrincipal.getControladorPrincipal().getIngressos().get(ingressos.getSelectedIndex()).getCliente().getDataDeNascimento()).concat(" - Preço: ").concat(String.valueOf(telaPrincipal.getControladorPrincipal().getIngressos().get(ingressos.getSelectedIndex()).getPreco())));
        add(informacoes);

        visualizarInformacoes.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
//                String teste = "Nome: ".concat(telaPrincipal.getControladorPrincipal().getClientes().get(ingressos.getSelectedIndex()).getNome()).concat("\nCPF: ").concat(telaPrincipal.getControladorPrincipal().getClientes().get(ingressos.getSelectedIndex()).getCpf()).concat("\nEndereço: ").concat(telaPrincipal.getControladorPrincipal().getClientes().get(ingressos.getSelectedIndex()).getEndereco()).concat("\nTelefone: ").concat(telaPrincipal.getControladorPrincipal().getClientes().get(ingressos.getSelectedIndex()).getTelefone()).concat("\nCidade: ").concat(telaPrincipal.getControladorPrincipal().getClientes().get(ingressos.getSelectedIndex()).getCidade()).concat("\nData de nascimento: ").concat(telaPrincipal.getControladorPrincipal().getClientes().get(ingressos.getSelectedIndex()).getDataDeNascimento());
                telaPrincipal.getIngressosVendidos().reloadPage(telaPrincipal);
                telaPrincipal.ingressosVendidos();
            }
        });
        entrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                telaPrincipal.telaBase();

            }
        });

    }


    public void addIngresso(Ingresso ing){
        //ingressos.add(ing);
    }

}
