package com.antonioviedo.api.service;

import com.antonioviedo.api.entity.ShoppingHistory;

import java.util.List;

public interface ShoppingHistoryService {
    List<ShoppingHistory> getHistory(String card);
}
