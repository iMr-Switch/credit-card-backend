package com.antonioviedo.api.dao;

import com.antonioviedo.api.entity.Client;
import com.antonioviedo.api.mapper.ClientRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientDaoImpl implements ClientDao{

    public ClientDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    NamedParameterJdbcTemplate template;

    @Override
    public List<Client> findAll() {
        return template.query("select f.id, f.name, f.address, f.city, f.phone, array_agg(s.id) from clients f inner join cards s on f.id = s.client group by f.id", new ClientRowMapper());
    }
}
