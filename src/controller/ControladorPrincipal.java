package controller;

import model.Cliente;
import model.Evento;
import model.Ingresso;
import view.TelaPrincipal;

import java.util.ArrayList;

/**
 * Created by igor on 01/11/17.
 */
public class ControladorPrincipal {
    ControladorClientes controladorClientes;
    TelaPrincipal telaPrincipal;
    ArrayList<Cliente> clientes;
    ArrayList<Evento> eventos;
    ArrayList<Ingresso> ingressos;

    public ArrayList<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(ArrayList<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    public ControladorPrincipal(){
        controladorClientes = new ControladorClientes();
        clientes = new ArrayList<>();
        eventos = new ArrayList<>();
        ingressos = new ArrayList<>();

        iniciar();
    }









    public void iniciar(){
        telaPrincipal = new TelaPrincipal("Sistema de eventos", this);
    }

    public ControladorClientes getControladorClientes() {
        return controladorClientes;
    }

    public void setControladorClientes(ControladorClientes controladorClientes) {
        this.controladorClientes = controladorClientes;
    }

    public TelaPrincipal getTelaPrincipal() {
        return telaPrincipal;
    }

    public void setTelaPrincipal(TelaPrincipal telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void addCliente(Cliente cliente){
        clientes.add(cliente);

    }
    public String[] getNomes(){
        String v[] = new String[clientes.size()];
        for (int i = 0; i<v.length; i++){
            v[i] = clientes.get(i).getNome();
        }
        return v;
    }
    public String[] getNomesEventos(){
        String v[] = new String[eventos.size()];
        for (int i = 0; i<v.length; i++){
            v[i] = eventos.get(i).getNome();
        }
        return v;
    }
    public String[] getIdsIngresso(){
        String v[] = new String[ingressos.size()];
        for (int i = 0; i<v.length; i++){
            v[i] = String.valueOf(ingressos.get(i).getId());
        }
        return v;
    }
}
