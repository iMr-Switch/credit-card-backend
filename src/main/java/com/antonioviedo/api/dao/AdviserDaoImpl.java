package com.antonioviedo.api.dao;

import com.antonioviedo.api.entity.Adviser;
import com.antonioviedo.api.mapper.AdviserRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdviserDaoImpl implements AdviserDao{

    public AdviserDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    NamedParameterJdbcTemplate template;

    @Override
    public List<Adviser> findAll() {
        return template.query("select * from advisers", new AdviserRowMapper());
    }
}
