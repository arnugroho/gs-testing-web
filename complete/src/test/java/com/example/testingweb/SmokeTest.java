package com.example.testingweb;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/*
* Melakukan test untuk memastikan apakah class yang dibangun
* beserta dependensinya berjalan dengan baik
*
* */
@SpringBootTest
public class SmokeTest {

	@Autowired
	private HomeController controller;

	@Test
	public void contextLoads() {
		assertThat(controller).isNotNull();
	}
}
