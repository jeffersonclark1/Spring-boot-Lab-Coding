package br.com.fiap.orderservice.model;

import java.math.BigDecimal;

public class Order {

    private int id;
    private String email;
    private String nomeCompleto;
    private String shippingAddress;
    private int idPedido;
    private String descricaoPedido;
    private int quantidadePedido;
    private BigDecimal preco;
    private BigDecimal precoTotalPagamento;
    private String formaPagamento;
    private String dataPedido;
    private String status;
    private int idTransacao;
    private String numeroCartao;
    private String validadeCartao;
    private String bandeira;

    public Order() {

    }

    public Order(int id, String email, String nomeCompleto, String shippingAddress, int idPedido, String descricaoPedido,
                 int quantidadePedido, BigDecimal preco, BigDecimal precoTotalPagamento, String formaPagamento,
                 String dataPedido, String status, int idTransacao, String numeroCartao, String validadeCartao,
                 String bandeira) {
        this.id = id;
        this.email = email;
        this.nomeCompleto = nomeCompleto;
        this.shippingAddress = shippingAddress;
        this.idPedido = idPedido;
        this.descricaoPedido = descricaoPedido;
        this.quantidadePedido = quantidadePedido;
        this.preco = preco;
        this.precoTotalPagamento = precoTotalPagamento;
        this.formaPagamento = formaPagamento;
        this.dataPedido = dataPedido;
        this.status = status;
        this.idTransacao = idTransacao;
        this.numeroCartao = numeroCartao;
        this.validadeCartao = validadeCartao;
        this.bandeira = bandeira;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getDescricaoPedido() {
        return descricaoPedido;
    }

    public void setDescricaoPedido(String descricaoPedido) {
        this.descricaoPedido = descricaoPedido;
    }

    public int getQuantidadePedido() {
        return quantidadePedido;
    }

    public void setQuantidadePedido(int quantidadePedido) {
        this.quantidadePedido = quantidadePedido;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public BigDecimal getPrecoTotalPagamento() {
        return precoTotalPagamento;
    }

    public void setPrecoTotalPagamento(BigDecimal precoTotalPagamento) {
        this.precoTotalPagamento = precoTotalPagamento;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getValidadeCartao() {
        return validadeCartao;
    }

    public void setValidadeCartao(String validadeCartao) {
        this.validadeCartao = validadeCartao;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
}
