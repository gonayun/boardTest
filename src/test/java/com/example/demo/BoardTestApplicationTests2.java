package com.example.demo;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestApplicationTests2 {

	@Autowired
	private SqlSessionFactory sqlSession;

	
	@Test
	public void sqlSessionTest() throws Exception{
		System.out.println(sqlSession);
	}

}
