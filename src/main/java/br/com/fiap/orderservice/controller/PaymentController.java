package br.com.fiap.orderservice.controller;

import br.com.fiap.orderservice.model.Payment;
import br.com.fiap.orderservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService service;

    @GetMapping("/payment/findById/{id}")
    public ResponseEntity findById(@PathVariable("id") int id) {
        Payment payment = service.findById(id);
        return new ResponseEntity<>(payment, HttpStatus.OK);
    }

    @PostMapping("/payment/create")
    public ResponseEntity<String> save(@RequestBody Payment payment) {
        service.save(payment);
        return new ResponseEntity<>("/payment/findById/" + payment.getIdTransacao(),
                HttpStatus.ACCEPTED);
    }

    @PostMapping("/payment/update/{id}")
    public ResponseEntity<Payment> update(@PathVariable("id") int id, @RequestBody Payment payment) {
        service.update(id, payment);
        return new ResponseEntity<>(payment, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/payment/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int id) {
        Payment payment = service.delete(id);
        return new ResponseEntity<>(payment, HttpStatus.OK);
    }

}