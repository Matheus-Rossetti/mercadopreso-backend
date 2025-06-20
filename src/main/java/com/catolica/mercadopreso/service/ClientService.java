package com.catolica.mercadopreso.service;

import com.catolica.mercadopreso.model.Cart;
import com.catolica.mercadopreso.model.Client;
import com.catolica.mercadopreso.model.Product;
import com.catolica.mercadopreso.repository.CartRepository;
import com.catolica.mercadopreso.repository.ClientRepository;
import com.catolica.mercadopreso.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    // ---- AUTH ----

    public Long authClient(String name, String password) {
        Client client = repository.findByName(name);
        boolean rightPassword = passwordEncoder.matches(password, client.getPassword());

        if (rightPassword) {
            return client.getId();
        } else {
            return 0L;
        }
    }

    // ---- CRUD ----

    public Client createNewClient(Client client) {
        // Hasha a senha antes de salvar
        client.setPassword(passwordEncoder.encode(client.getPassword()));
        return repository.save(client);
    }

    public Optional<Client> getClientById(Long id) {
        return repository.findById(id);
    }

    public Client updateClient(Client client) {
        // Hasha a senha antes de salvar
        client.setPassword(passwordEncoder.encode(client.getPassword()));
        return repository.save(client);
    }

    public void deleteClient(Long id) {
        repository.deleteById(id);
    }
}
