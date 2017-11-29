package model;

import view.CadastrarEvento;

/**
 * Created by igor on 01/11/17.
 */
public class Evento {
    String nome;
    float preco;
    int qtdTotalDeIngressos;
    int qtdIngressosVendidos;

    public int getQtdIngressosVendidos() {
        return qtdIngressosVendidos;
    }

    public void setQtdIngressosVendidos(int qtdIngressosVendidos) {
        this.qtdIngressosVendidos = qtdIngressosVendidos;
    }

    int descontoClienteEspecial;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQtdTotalDeIngressos() {
        return qtdTotalDeIngressos;
    }

    public void setQtdTotalDeIngressos(int qtdTotalDeIngressos) {
        this.qtdTotalDeIngressos = qtdTotalDeIngressos;
    }

    public int getDescontoClienteEspecial() {
        return descontoClienteEspecial;
    }

    public void setDescontoClienteEspecial(int descontoClienteEspecial) {
        this.descontoClienteEspecial = descontoClienteEspecial;
    }

    public Evento(CadastrarEvento evento){
        nome = evento.getNomeEventotxt().getText();
        preco = Float.parseFloat(evento.getPrecoIngressotxt().getText());
        qtdTotalDeIngressos = Integer.parseInt(evento.getQtdIngressosDisponiveistxt().getText());
        descontoClienteEspecial = Integer.parseInt(evento.getDescontoClienteEspecialtxt().getText());
        qtdIngressosVendidos = 0;
    }
}
