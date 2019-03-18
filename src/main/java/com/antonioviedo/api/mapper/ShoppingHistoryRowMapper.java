package com.antonioviedo.api.mapper;

import com.antonioviedo.api.entity.ShoppingHistory;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ShoppingHistoryRowMapper implements RowMapper<ShoppingHistory> {
    @Override
    public ShoppingHistory mapRow(ResultSet rs, int arg1) throws SQLException {
        ShoppingHistory shoppingHistory = new ShoppingHistory();
        shoppingHistory.setShoppingHistoryId(rs.getInt("id"));
        shoppingHistory.setShoppingHistoryDate(rs.getString("date"));
        shoppingHistory.setShoppingHistoryPrice(rs.getFloat("price"));
        shoppingHistory.setShoppingHistoryDescription(rs.getString("description"));
        shoppingHistory.setShoppingHistoryCard(rs.getString("card"));

        return shoppingHistory;
    }
}
