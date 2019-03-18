package com.antonioviedo.api.service;

import com.antonioviedo.api.dao.AdviserDao;
import com.antonioviedo.api.entity.Adviser;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class AdviserServiceImpl implements AdviserService {
    @Resource
    AdviserDao adviserDao;

    @Override
    public List<Adviser> findAll() {
        return adviserDao.findAll();
    }

}

