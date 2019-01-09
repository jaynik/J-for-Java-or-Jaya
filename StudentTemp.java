package com.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper; 

import com.beans.Student;

public class StudentTemp {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public int save(Student p){    
	    String sql="insert into register(First_Name,Last_Name,Gender,Mailing_Address,City,State,Zip_Code)"
	    		+ "values('"+p.getFname()+"','"+p.getLname()+"','"+p.getGender()+
	    		"','"+p.getMaddress()+"','"+p.getCity()+"','"+p.getState()+"','"
	    		+p.getZipcode()+"')";    
	    return template.update(sql);    
	} 
	
	public List<Student> show() {
		return template.query("select * from register", new RowMapper<Student>() {
			public Student mapRow(ResultSet rs, int row) throws SQLException {
				Student s=new Student();
				s.setID(rs.getInt(1));
				s.setFname(rs.getString(2));
				s.setLname(rs.getString(3));
				s.setGender(rs.getString(4));
				s.setMaddress(rs.getString(5));
				s.setCity(rs.getString(6));
				s.setState(rs.getString(7));
				s.setZipcode(rs.getString(8));
				return s;
			}
		});
	}
	
	public int delete(int id) {
		String sql="delete from register where id="+id+"";
		return template.update(sql);
	}
	
}
