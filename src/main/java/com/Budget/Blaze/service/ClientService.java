package com.Budget.Blaze.service;

import com.Budget.Blaze.entity.Client;

public interface ClientService {
    void saveClient(Client client);
    Client findClientById(int id);
}
