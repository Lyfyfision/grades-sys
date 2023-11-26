package com.ltp.gradesubmission.web;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//TODO: Add all methods

@WebMvcTest(StudentController.class)
public class StudentControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void getStudent() throws Exception {
		this.mockMvc.perform(get("/student/{id}", 123L))
			.andExpect(status().isOk())
			.andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
			.andExpect(jsonPath("$.id").value("<value>"))
			.andExpect(jsonPath("$.name").value("<value>"))
			.andExpect(jsonPath("$.birthDate").value("<value>"))
			.andExpect(jsonPath("$.grades[0]").value("<value>"))
			.andExpect(jsonPath("$.courses").value("<value>"));
	}
}
