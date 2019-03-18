package com.antonioviedo.api.service;


import com.antonioviedo.api.entity.Card;

import java.util.List;

public interface CardService {
    List<Card> getCard(String card);
}
