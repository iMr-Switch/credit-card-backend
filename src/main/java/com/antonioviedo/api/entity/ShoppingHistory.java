package com.antonioviedo.api.entity;

public class ShoppingHistory {
    public Integer id;
    public String date;
    public Float price;
    public String description;
    public String card;


    public void setShoppingHistoryId(Integer shoppingHistoryId) {
        this.id = shoppingHistoryId;
    }

    public void setShoppingHistoryDate(String shoppingHistoryDate) {
        this.date = shoppingHistoryDate;
    }

    public void setShoppingHistoryPrice(Float shoppingHistoryPrice) {
        this.price = shoppingHistoryPrice;
    }

    public void setShoppingHistoryDescription(String shoppingHistoryDescription) {
        this.description = shoppingHistoryDescription;
    }

    public void setShoppingHistoryCard(String shoppingHistoryCard) {
        this.card = shoppingHistoryCard;
    }
}


