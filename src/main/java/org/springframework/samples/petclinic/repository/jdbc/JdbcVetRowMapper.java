package org.springframework.samples.petclinic.repository.jdbc;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.samples.petclinic.model.Vet;

import java.sql.ResultSet;
import java.sql.SQLException;

class JdbcVetRowMapper implements RowMapper<Vet> {

    @Override
    public Vet mapRow(ResultSet rs, int row) throws SQLException {
        Vet vet = new Vet();
        vet.setId(rs.getInt("vet_id"));
        vet.setFirstName(rs.getString("first_name"));
        vet.setLastName(rs.getString("last_name"));
        return vet;
    }
}
