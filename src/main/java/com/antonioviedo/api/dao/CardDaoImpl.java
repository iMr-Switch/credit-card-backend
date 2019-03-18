package com.antonioviedo.api.dao;

import com.antonioviedo.api.entity.Card;
import com.antonioviedo.api.mapper.CardRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CardDaoImpl implements CardDao{

    public CardDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    NamedParameterJdbcTemplate template;

    @Override
    public List<Card> getCard(String id) {
        final String query = "select ccv, type from cards where id = :id";

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("id", id);

        return template.query(query, param, new CardRowMapper());
    }
}
