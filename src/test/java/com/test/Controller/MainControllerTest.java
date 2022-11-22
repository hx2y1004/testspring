package com.test.Controller;

import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import com.test.controller.MainController;

@WebMvcTest(controllers = MainController.class)
public class MainControllerTest {
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void mainTest() throws Exception{
		String chk = "check";
		
		mvc.perform(get("/"))
			.andExpect(status().isOk());
		
	}
}
