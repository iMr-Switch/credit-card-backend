package com.antonioviedo.api.service;

import com.antonioviedo.api.dao.ClientDao;
import com.antonioviedo.api.entity.Client;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class ClientServiceImpl implements ClientService {
    @Resource
    ClientDao clientDao;

    @Override
    public List<Client> findAll() {
        return clientDao.findAll();
    }

}
