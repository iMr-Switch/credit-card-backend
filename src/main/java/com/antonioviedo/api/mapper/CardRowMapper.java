package com.antonioviedo.api.mapper;

import com.antonioviedo.api.entity.Card;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CardRowMapper implements RowMapper<Card> {
    @Override
    public Card mapRow(ResultSet rs, int arg1) throws SQLException {
        Card card = new Card();
        card.setCardCcv(rs.getString("ccv"));
        card.setCardType(rs.getString("type"));

        return card;
    }
}
