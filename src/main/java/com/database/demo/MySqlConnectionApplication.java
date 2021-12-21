package com.database.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class MySqlConnectionApplication implements CommandLineRunner{
@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(MySqlConnectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql="INSERT INTO demodb(id,email,password) VALUES(?,?,?)";
		int result=jdbcTemplate.update(sql,"1","kowsi@gmail.com","kowsi@123");
		
		if(result>0)
		{
			System.out.println("A new row has been inserted");
			
		}
				
		
	}

}
