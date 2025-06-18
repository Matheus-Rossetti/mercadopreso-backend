package com.catolica.mercadopreso.service;

import com.catolica.mercadopreso.model.Client;
import com.catolica.mercadopreso.model.Product;
import com.catolica.mercadopreso.repository.ClientRepository;
import com.catolica.mercadopreso.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;


    public Client createNewClient(Client client) {

        // Hasha a senha antes de salvar
        client.setPassword(passwordEncoder.encode(client.getPassword()));

        return repository.save(client);
    }

    public Long authClient(String name, String password){
        Client client = repository.findByName(name);
        boolean rightPassword = passwordEncoder.matches(password, client.getPassword());

        if (rightPassword){
            return client.getId();
        }else {
            return 0L;
        }

    }

    public Client getClientById(Long id) {

        Client client = repository.findById(id).orElse(null);

        if (client == null) {
            client = new Client();
            return client;
        } // garante que se não tiver um client com o 'id' recebido, retorna um com os parametros nulos
          // caso contrário, não retorna nada

        return client;
    }


}
