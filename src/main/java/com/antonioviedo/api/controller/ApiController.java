package com.antonioviedo.api.controller;

import com.antonioviedo.api.entity.Adviser;
import com.antonioviedo.api.entity.Card;
import com.antonioviedo.api.entity.ShoppingHistory;
import com.antonioviedo.api.service.AdviserService;
import com.antonioviedo.api.entity.Client;
import com.antonioviedo.api.service.CardService;
import com.antonioviedo.api.service.ClientService;
import com.antonioviedo.api.service.ShoppingHistoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class ApiController {
    @Resource
    ClientService clientService;

    @Resource
    AdviserService adviserService;

    @Resource
    CardService cardService;

    @Resource
    ShoppingHistoryService shoppingHistoryService;


    @GetMapping(value = "/clients")
    public List<Client> getClients() {
        return clientService.findAll();
    }

    @GetMapping(value = "/advisers")
    public List<Adviser> getAdvisers() {
        return adviserService.findAll();
    }

    @GetMapping(value = "/shoppinghistory/{card}")
    public List<ShoppingHistory> getShoppingHistory(@PathVariable String card) {
        return shoppingHistoryService.getHistory(card);
    }

    @GetMapping(value = "/card/{card}")
    public List<Card> getCard(@PathVariable String card) {
        return cardService.getCard(card);
    }

    @RequestMapping(
            value = "/**",
            method = RequestMethod.OPTIONS
    )
    public ResponseEntity handle() {
        return new ResponseEntity(HttpStatus.OK);
    }
}
