package br.com.fiap.orderservice.service;

import br.com.fiap.orderservice.exceptions.EntityNotFoundException;
import br.com.fiap.orderservice.exceptions.InvalidRegistryException;
import br.com.fiap.orderservice.model.Order;
import br.com.fiap.orderservice.model.OrderDTO;
import br.com.fiap.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private OrderRepository repository;
    private int id;

    @Autowired
    public OrderService(OrderRepository repository) {
        this.repository = repository;
        this.id = 0;
    }

    public OrderDTO findById(int id) throws EntityNotFoundException {
        Order order = repository.findById(id);

        if (order == null)
            throw new EntityNotFoundException("Pedido com ID " + id + " não encontrado.");

        OrderDTO orderDTO = new OrderDTO(order.getEmail(), order.getNomeCompleto(), order.getShippingAddress(),
                order.getIdPedido(), order.getDescricaoPedido(), order.getQuantidadePedido(), order.getPreco(),
                order.getPrecoTotalPagamento(), order.getFormaPagamento(), order.getDataPedido(), order.getStatus(),
                order.getIdTransacao(), order.getNumeroCartao(), order.getValidadeCartao(), order.getBandeira());
        return orderDTO;
    }

    public void save(Order order) {
        Order ord = new Order(id, order.getEmail(), order.getNomeCompleto(), order.getShippingAddress(),
                order.getIdPedido(), order.getDescricaoPedido(), order.getQuantidadePedido(), order.getPreco(),
                order.getPrecoTotalPagamento(), order.getFormaPagamento(), order.getDataPedido(), order.getStatus(),
                order.getIdTransacao(), order.getNumeroCartao(), order.getValidadeCartao(), order.getBandeira());
        this.repository.save(ord);
        id++;
    }

    public void update(int idOrder, OrderDTO order) throws EntityNotFoundException {
        if (repository.findById(idOrder) == null)
            throw new EntityNotFoundException("Pedido com ID " + idOrder + " não encontrado.");
        repository.update(idOrder, order);
    }

    public OrderDTO delete(int idOrder) throws EntityNotFoundException {
        if (repository.findById(idOrder) == null)
            throw new EntityNotFoundException("Pedido com ID " + idOrder + " não encontrado.");
        Order order = repository.delete(idOrder);
        OrderDTO orderDTO = new OrderDTO(order.getEmail(), order.getNomeCompleto(), order.getShippingAddress(),
                order.getIdPedido(), order.getDescricaoPedido(), order.getQuantidadePedido(), order.getPreco(),
                order.getPrecoTotalPagamento(), order.getFormaPagamento(), order.getDataPedido(), order.getStatus(),
                order.getIdTransacao(), order.getNumeroCartao(), order.getValidadeCartao(), order.getBandeira());
        return orderDTO;
    }

    public int getCurrentId() {
        return this.id;
    }
}
