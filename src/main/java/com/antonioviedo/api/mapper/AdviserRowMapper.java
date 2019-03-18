package com.antonioviedo.api.mapper;

import com.antonioviedo.api.entity.Adviser;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AdviserRowMapper implements RowMapper<Adviser> {
    @Override
    public Adviser mapRow(ResultSet rs, int arg1) throws SQLException {
        Adviser adviser = new Adviser();
        adviser.setAdviserId(rs.getInt("id"));
        adviser.setAdviserName(rs.getString("name"));
        adviser.setAdviserSpeciality(rs.getString("speciality"));
        return adviser;
    }
}
