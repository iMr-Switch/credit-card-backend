package com.antonioviedo.api.dao;

import com.antonioviedo.api.entity.Client;

import java.util.List;

public interface ClientDao {
    List<Client> findAll();
}
