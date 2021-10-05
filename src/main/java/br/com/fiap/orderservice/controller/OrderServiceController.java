package br.com.fiap.orderservice.controller;

import br.com.fiap.orderservice.exceptions.EntityNotFoundException;
import br.com.fiap.orderservice.exceptions.InvalidRegistryException;
import br.com.fiap.orderservice.model.Order;
import br.com.fiap.orderservice.model.OrderDTO;
import br.com.fiap.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderServiceController {

    @Autowired
    private OrderService service;

    @GetMapping("/order/findById/{id}")
    public ResponseEntity findById(@PathVariable("id") int id) throws EntityNotFoundException {
        OrderDTO order = service.findById(id);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

    @PostMapping("/order/create")
    public ResponseEntity<String> create(@RequestBody Order order){

        service.save(order);
        return new ResponseEntity<>("/findById/" + (service.getCurrentId() - 1),
                HttpStatus.ACCEPTED);
    }

    @PostMapping("/order/update/{id}")
    public ResponseEntity<OrderDTO> update(@PathVariable("id") int idOrder, @RequestBody OrderDTO order)
            throws EntityNotFoundException, InvalidRegistryException {
        service.update(idOrder, order);
        return new ResponseEntity<>(order, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/order/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int id) throws EntityNotFoundException {
        OrderDTO order = service.delete(id);
        return new ResponseEntity<>(order, HttpStatus.OK);
    }

}
