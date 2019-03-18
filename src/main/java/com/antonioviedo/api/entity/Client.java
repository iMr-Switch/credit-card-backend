package com.antonioviedo.api.entity;

import java.util.List;

public class Client {
    public Integer id;
    public String name;
    public String address;
    public String city;
    public String phone;
    public List<String> cards;

    public void setClientId(Integer clientId) {
        this.id = clientId;
    }

    public void setClientName(String clientName) {
        this.name = clientName;
    }

    public void setClientAddress(String clientAddress) {
        this.address = clientAddress;
    }

    public void setClientCity(String clientCity) {
        this.city = clientCity;
    }

    public void setClientPhone(String clientPhone) {
        this.phone = clientPhone;
    }

    public void setClientCards(List<String> clientCards) {
        this.cards = clientCards;
    }
}


