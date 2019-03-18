package com.antonioviedo.api.dao;

import com.antonioviedo.api.entity.Adviser;

import java.util.List;

public interface AdviserDao {
    List<Adviser> findAll();
}
