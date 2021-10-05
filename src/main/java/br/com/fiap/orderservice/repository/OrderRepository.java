package br.com.fiap.orderservice.repository;

import br.com.fiap.orderservice.model.Order;
import br.com.fiap.orderservice.model.OrderDTO;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {

    private List<Order> orders = new ArrayList<Order>();

    public Order findById(int id) {
        for (Order order : orders) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    public void save(Order ord) {
        orders.add(ord);
    }

    public void update(int idOrder, OrderDTO order) {
        Order newOrder = this.findById(idOrder);
        newOrder.setShippingAddress(order.getShippingAddress());
        newOrder.setDescricaoPedido(order.getDescricaoPedido());
        newOrder.setQuantidadePedido(order.getQuantidadePedido());
        newOrder.setPrecoTotalPagamento(order.getPrecoTotalPagamento());
        newOrder.setPreco(order.getPreco());
        newOrder.setFormaPagamento(order.getFormaPagamento());
        newOrder.setIdTransacao(order.getIdTransacao());
        newOrder.setNumeroCartao(order.getNumeroCartao());
        newOrder.setValidadeCartao(order.getValidadeCartao());
        newOrder.setBandeira(order.getBandeira());
    }

    public Order delete(int idOrder) {
        Order order = this.findById(idOrder);
        Order oldOrder = new Order();
        oldOrder.setId(order.getId());
        oldOrder.setEmail(order.getEmail());
        oldOrder.setNomeCompleto(order.getNomeCompleto());
        oldOrder.setShippingAddress(order.getShippingAddress());
        oldOrder.setIdPedido(order.getIdPedido());
        oldOrder.setDescricaoPedido(order.getDescricaoPedido());
        oldOrder.setQuantidadePedido(order.getQuantidadePedido());
        oldOrder.setPreco(order.getPreco());
        oldOrder.setPrecoTotalPagamento(order.getPrecoTotalPagamento());
        oldOrder.setFormaPagamento(order.getFormaPagamento());
        oldOrder.setDataPedido(order.getDataPedido());
        oldOrder.setStatus(order.getStatus());
        oldOrder.setIdTransacao(order.getIdTransacao());
        oldOrder.setNumeroCartao(order.getNumeroCartao());
        oldOrder.setValidadeCartao(order.getValidadeCartao());
        oldOrder.setBandeira(order.getBandeira());
        orders.remove(order);
        return oldOrder;
    }
}
