package ufal.p3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by myron on 31/07/2017.
 */
public class Empregado {
    private int id;
    private String nome;
    private String endereco;
    private double salarioPorHora;
    private double salarioMensal;
    private double comissao;
    private int tipo;
    private AgendaPagamento agendaPagamento;
    private List<CartaoPonto> cartaoPontoList = new ArrayList<CartaoPonto>();
    private List<Venda> vendas = new ArrayList<Venda>();
    private List<ServicoSindicato> servicos = new ArrayList<ServicoSindicato>();


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public AgendaPagamento getAgendaPagamento() {
        return agendaPagamento;
    }

    public void setAgendaPagamento(AgendaPagamento agendaPagamento) {
        this.agendaPagamento = agendaPagamento;
    }

    public List<CartaoPonto> getCartaoPontoList() {
        return cartaoPontoList;
    }

    public void setCartaoPontoList(List<CartaoPonto> cartaoPontoList) {
        this.cartaoPontoList = cartaoPontoList;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }

    public List<ServicoSindicato> getServicos() {
        return servicos;
    }

    public void setServicos(List<ServicoSindicato> servicos) {
        this.servicos = servicos;
    }

}
