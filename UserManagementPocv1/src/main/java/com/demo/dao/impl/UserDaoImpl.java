package com.demo.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.demo.dao.EmployeeDao;
import com.demo.dao.UserDao;
import com.demo.model.Employee;
import com.demo.model.SecurityUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {
	
	@Autowired 
	DataSource dataSource;
	
	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}
	
	@Override
	public void deleteUserById(int id) {
		String sql = "DELETE FROM users WHERE id = ?";
		int cnt = getJdbcTemplate().update(sql, id);
	}
	
	@Override
	public void addNewUser(SecurityUser securityUser) {
		String sql = "INSERT INTO users " +
				"(username, password, email) VALUES (?, ?, ?)" ;
		getJdbcTemplate().update(sql, new Object[]{
				securityUser.getUsername(),
				securityUser.getPassword(),
				securityUser.getEmail()
		});
	}
	
	@Override
	public List<SecurityUser> getAllusers(){
		String sql = "SELECT * FROM users";
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		
		List<SecurityUser> result = new ArrayList<SecurityUser>();
		for(Map<String, Object> row:rows){
			SecurityUser securityuser = new SecurityUser();
			securityuser.setId((int)row.get("id"));
			securityuser.setUsername((String)row.get("username"));
			securityuser.setPassword((String)row.get("password"));
			securityuser.setEmail((String)row.get("email"));
			
			result.add(securityuser);
		}
		
		return result;
	}

	@Override
	public SecurityUser getUserById(int id) {
		String sql = "SELECT * FROM users WHERE id = ?";
		return (SecurityUser)getJdbcTemplate().queryForObject(sql, new Object[]{id}, new RowMapper<SecurityUser>(){
			@Override
			public SecurityUser mapRow(ResultSet rs, int rwNumber) throws SQLException {
				SecurityUser securityuser = new SecurityUser();
				securityuser.setId(rs.getInt("id"));
				securityuser.setUsername(rs.getString("username"));
				securityuser.setPassword(rs.getString("password"));
				securityuser.setEmail(rs.getString("email"));
				
				return securityuser;
			}
		});
	}
}

