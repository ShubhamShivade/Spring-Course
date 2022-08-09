package com.example.database.databasedemo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.database.databasedemo.entity.Person;

@Repository
public class PersonJdbcDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
//	class PersonRowMapper implements RowMapper<Person>{
//		@Override
//		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
//			Person person = new Person();
//			person.setId(rs.getInt("id"));
//			person.setName(rs.getString("name"));
//			person.setLocation(rs.getString("location"));
//			return person;
//		}
//	}

	// select * from person
	public List<Person> findAll() {
		return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper(Person.class));
	}

//	select * from person where id = ?
	public Person findById(int id) {
		return jdbcTemplate.queryForObject("select * from person where id = ?", new Object[] { id },
				new BeanPropertyRowMapper<Person>(Person.class));
	}

//	delete from person where id = ?
	public int deleteById(int id) {
		return jdbcTemplate.update("delete from person where id = ?", new Object[] { id });
	}

//	insert into person (id,name,location)" + " values(?,?,?)
	public int insert(Person person) {
		return jdbcTemplate.update("insert into person (id,name,location)" + " values(?,?,?)",
				new Object[] { person.getId(), person.getName(), person.getLocation() });
	}

//	update person " + "set name = ? , location = ?" + "where id =?
	public int update(Person person) {
		return jdbcTemplate.update("update person " + "set name = ? , location = ?" + "where id =?",
				new Object[] {person.getName(), person.getLocation(), person.getId() });
	}

}
