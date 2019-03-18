package com.antonioviedo.api.service;

import com.antonioviedo.api.entity.Client;

import java.util.List;

public interface ClientService {
    List<Client> findAll();
}
