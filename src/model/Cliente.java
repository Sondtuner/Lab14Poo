package model;

import view.CadastrarCliente;

/**
 * Created by igor on 31/10/17.
 */
public class Cliente {
    String nome;
    String cpf;
    String endereco;
    String telefone;
    String cidade;
    String dataDeNascimento;
    boolean clienteEspecial;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public boolean isClienteEspecial() {
        return clienteEspecial;
    }

    public void setClienteEspecial(boolean clienteEspecial) {
        this.clienteEspecial = clienteEspecial;
    }

    public Cliente(CadastrarCliente info){
        clienteEspecial = false;

        nome = info.getNometxt().getText();
        cpf = info.getCpftxt().getText();
        endereco = info.getEnderecotxt().getText();
        telefone = info.getTelefonetxt().getText();
        cidade = info.getCidade().getSelectedItem().toString();
        dataDeNascimento = info.getDia() + " " + info.getMes() + " " + info.getAno();
        clienteEspecial = info.getClienteEspecial().isSelected();
    }
    public String getNome(){
        return nome;
    }
}
