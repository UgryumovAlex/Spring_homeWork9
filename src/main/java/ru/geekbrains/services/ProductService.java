package ru.geekbrains.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.entities.Product;
import ru.geekbrains.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private ProductRepository repository;

    @Autowired
    public void setRepository(ProductRepository repository) {
        this.repository = repository;
    }

    public Product createOrUpdate(Product product) {
        return repository.save(product);
    }

    public Optional<Product> findById(Long id) {
        return repository.findById(id);
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
