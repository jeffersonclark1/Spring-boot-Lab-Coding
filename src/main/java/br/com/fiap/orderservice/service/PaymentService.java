package br.com.fiap.orderservice.service;

import br.com.fiap.orderservice.model.Payment;
import br.com.fiap.orderservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private PaymentRepository repository;

    @Autowired
    public PaymentService(PaymentRepository repository) {
        this.repository = repository;
    }

    public Payment findById(int id) {
        Payment payment = repository.findById(id);
        return payment;
    }

    public void save(Payment payment) {
        this.repository.save(payment);
    }

    public void update(int id, Payment payment) {
        repository.update(id, payment);
    }

    public Payment delete(int id) {
        return repository.delete(id);
    }

}