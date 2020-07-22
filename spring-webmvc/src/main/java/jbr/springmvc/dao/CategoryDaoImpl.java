package jbr.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jbr.springmvc.model.Categories;

public class CategoryDaoImpl implements CategoryDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Categories> getCategory() {
		return jdbcTemplate.query("select * from categories", new RowMapper<Categories>() {
			public Categories mapRow(ResultSet rs, int row) throws SQLException {
				Categories e = new Categories();
				e.setCategoryId(rs.getInt(1));
				e.setCategoryName(rs.getString(2));
				return e;
			}
		});
	}
}
