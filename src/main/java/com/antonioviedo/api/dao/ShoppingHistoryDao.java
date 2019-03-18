package com.antonioviedo.api.dao;

import com.antonioviedo.api.entity.ShoppingHistory;

import java.util.List;

public interface ShoppingHistoryDao {
    List<ShoppingHistory> getHistory(String card);
}
