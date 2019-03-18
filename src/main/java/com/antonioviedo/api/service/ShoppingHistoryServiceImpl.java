package com.antonioviedo.api.service;

import com.antonioviedo.api.dao.ShoppingHistoryDao;
import com.antonioviedo.api.entity.ShoppingHistory;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class ShoppingHistoryServiceImpl implements ShoppingHistoryService {
    @Resource
    ShoppingHistoryDao shoppingHistoryDao;

    @Override
    public List<ShoppingHistory> getHistory(String card) {
        return shoppingHistoryDao.getHistory(card);
    }

}