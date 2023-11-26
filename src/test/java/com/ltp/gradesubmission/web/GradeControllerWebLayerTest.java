package com.ltp.gradesubmission.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(GradeController.class)
public class GradeControllerWebLayerTest {
    @Autowired
    private MockMvc mockMvc;
}
