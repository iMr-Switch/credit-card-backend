package com.antonioviedo.api.dao;


import com.antonioviedo.api.entity.Card;

import java.util.List;

public interface CardDao {
    List<Card> getCard(String card);
}
