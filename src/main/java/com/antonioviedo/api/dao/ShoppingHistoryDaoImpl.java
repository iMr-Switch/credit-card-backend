package com.antonioviedo.api.dao;

import com.antonioviedo.api.entity.ShoppingHistory;
import com.antonioviedo.api.mapper.ShoppingHistoryRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ShoppingHistoryDaoImpl implements ShoppingHistoryDao{

    public ShoppingHistoryDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    NamedParameterJdbcTemplate template;

    @Override
    public List<ShoppingHistory> getHistory(String card) {
        final String query = "select * from shopping_history where card = :card";

        SqlParameterSource param = new MapSqlParameterSource()
                                .addValue("card", card);

        return template.query(query, param, new ShoppingHistoryRowMapper());
    }
}
