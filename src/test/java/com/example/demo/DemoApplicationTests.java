package com.example.demo;

import com.example.demo.controller.EmployeeController;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.test.web.reactive.server.WebTestClient;

import java.util.List;

@WebFluxTest(controllers = EmployeeController.class)
class DemoApplicationTests {


	@Autowired
	private WebTestClient webClient;


	@Test
	void contextLoads() {
		List<String> mockList = Mockito.mock(List.class);
		mockList.add("Pankaj");
		mockList.size();

		Mockito.verify(mockList).add("Pankaj");
	}


	@Test
	void contextLoads1() {
		List<String> mockList = Mockito.mock(List.class);
		mockList.add("Pankaj");
		mockList.size();

		Mockito.verify(mockList).add("Pankaj");
	}

}
