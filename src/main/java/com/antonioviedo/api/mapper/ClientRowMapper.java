package com.antonioviedo.api.mapper;

import com.antonioviedo.api.entity.Client;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class ClientRowMapper implements RowMapper<Client> {
    @Override
    public Client mapRow(ResultSet rs, int arg1) throws SQLException {
        Client client = new Client();
        client.setClientId(rs.getInt("id"));
        client.setClientName(rs.getString("name"));
        client.setClientAddress(rs.getString("address"));
        client.setClientCity(rs.getString("city"));
        client.setClientPhone(rs.getString("phone"));
        client.setClientCards(Arrays.asList((String[]) rs.getArray("array_agg").getArray()));
    return client;
    }
}
