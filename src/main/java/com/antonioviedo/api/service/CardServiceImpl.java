package com.antonioviedo.api.service;

import com.antonioviedo.api.dao.CardDao;
import com.antonioviedo.api.entity.Card;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class CardServiceImpl implements CardService {
    @Resource
    CardDao cardDao;

    @Override
    public List<Card> getCard(String card) {
        return cardDao.getCard(card);
    }

}