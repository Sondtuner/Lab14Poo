package view;

import model.Cliente;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by igor on 30/10/17.
 */
public class CadastrarCliente extends JPanel{
    private JLabel cpflb;
    private JLabel nomelb;
    private JLabel enderecolb;
    private JLabel telefonelb;
    private JLabel dataDeNascimentolb;
    private JLabel cidadelb;
    private JLabel clienteEspeciallb;

    private JCheckBox clienteEspecial;

    public JTextField getCpftxt() {
        return cpftxt;
    }

    public JTextField getNometxt() {
        return nometxt;
    }

    public JTextField getEnderecotxt() {
        return enderecotxt;
    }

    public JTextField getTelefonetxt() {
        return telefonetxt;
    }

    public JComboBox<String> getCidade() {
        return cidade;
    }

    public String getAno() {
        return (String) ano.getSelectedItem();
    }

    public String getMes() {
        return (String) mes.getSelectedItem();
    }
    public String getDia(){
        return (String) dia.getSelectedItem();
    }

    private JTextField cpftxt;
    private JTextField nometxt;
    private JTextField enderecotxt;
    private JTextField telefonetxt;

    private JComboBox<String> cidade;
    private JComboBox<String> ano;
    private JComboBox<String> dia;
    private JComboBox<String> mes;

    private JButton cadastrar;

    public JCheckBox getClienteEspecial() {
        return clienteEspecial;
    }

    public CadastrarCliente(Color backGroundColour, final TelaPrincipal telaPrincipal){
        String v[] = new String[2017-1949];
        for (int i = 1950; i<=2017; i++){
            v[i-1950] = String.valueOf(i);
        }
        ano = new JComboBox(v);
        v = new String[30];
        for (int i = 0; i<30; i++){
            v[i] = String.valueOf(i+1);
        }
        dia = new JComboBox(v);

        v = new String[]{"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        mes = new JComboBox(v);



        cpflb = new JLabel("CPF: ");
        nomelb = new JLabel("Nome: ");
        enderecolb = new JLabel("Endereço: ");
        telefonelb = new JLabel("Telefone: ");
        dataDeNascimentolb = new JLabel("Data de nascimento: ");
        cidadelb = new JLabel("Cidade: ");
        clienteEspeciallb = new JLabel("Cliente especial");

        cidade = new JComboBox<>(new String[]{"Fortaleza", "São Paulo", "Rio de Janeiro"});

        cpftxt = new JTextField(16);
        nometxt = new JTextField(20);
        enderecotxt = new JTextField(40);
        telefonetxt = new JTextField(15);

        clienteEspecial = new JCheckBox();

        cadastrar = new JButton("Cadastrar cliente");

        //como pegar o item do combobox
//        cidade.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println(cidade.getSelectedItem());
//            }
//        });
        cadastrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    // TODO Auto-generated method stub
                    telaPrincipal.getControladorPrincipal().addCliente(new Cliente(telaPrincipal.getCadastrarCliente()));
                    telaPrincipal.getVenderIngresso().attPage(telaPrincipal);
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
                    telaPrincipal.telaBase();
                }catch (Exception j) {
                    // TODO: handle exception
                    JOptionPane.showMessageDialog(null, "Erro");
                    telaPrincipal.telaBase();
                }

            }
        });

        add(nomelb);
        add(nometxt);
        add(cpflb);
        add(cpftxt);
        add(clienteEspeciallb);
        add(clienteEspecial);
        add(enderecolb);
        add(enderecotxt);
        add(telefonelb);
        add(telefonetxt);
        add(cidadelb);
        add(cidade);


        add(dataDeNascimentolb);
        add(dia);
        add(mes);
        add(ano);

        add(cadastrar);

    }

}
