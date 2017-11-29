package model;

import view.TelaPrincipal;
import view.VenderIngresso;

import java.util.Random;

/**
 * Created by igor on 30/10/17.
 */
public class Ingresso {
    Cliente cliente;
    int id;
    double preco;
    int numeroDaMeia;
    String modoDePagamento;
    boolean meia;
    Evento evento;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getNumeroDaMeia() {
        return numeroDaMeia;
    }

    public void setNumeroDaMeia(int numeroDaMeia) {
        this.numeroDaMeia = numeroDaMeia;
    }

    public String getModoDePagamento() {
        return modoDePagamento;
    }

    public void setModoDePagamento(String modoDePagamento) {
        this.modoDePagamento = modoDePagamento;
    }

    public boolean isMeia() {
        return meia;
    }

    public void setMeia(boolean meia) {
        this.meia = meia;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Ingresso(VenderIngresso ingresso, TelaPrincipal telaPrincipal){

        modoDePagamento = ingresso.getModoDePagamento().getSelectedItem().toString();
        for (int i = 0; i<telaPrincipal.getControladorPrincipal().getClientes().size(); i++){
            if (ingresso.getClientes().getSelectedItem().toString().equals(telaPrincipal.getControladorPrincipal().getClientes().get(i).getNome())){
                this.cliente = telaPrincipal.getControladorPrincipal().getClientes().get(i);
            }
        }
        for (int i = 0; i<telaPrincipal.getControladorPrincipal().getEventos().size(); i++){
            if (ingresso.getEvento().getSelectedItem().toString().equals(telaPrincipal.getControladorPrincipal().getEventos().get(i).getNome())){
                telaPrincipal.getControladorPrincipal().getEventos().get(i).setQtdIngressosVendidos(telaPrincipal.getControladorPrincipal().getEventos().get(i).getQtdIngressosVendidos()+1);
                this.evento = telaPrincipal.getControladorPrincipal().getEventos().get(i);
            }
        }
        if (cliente.isClienteEspecial()){
        preco = evento.getPreco()*(1.0-(evento.getDescontoClienteEspecial()/100.0));
        } else{
            preco = evento.getPreco();
        }
        Random rd = new Random();
        id = rd.nextInt(9999999);
        //this.evento.setQtdIngressosVendidos(this.evento.getQtdIngressosVendidos()+1); //deixar comentado
    }
}
