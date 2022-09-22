package br.treelogy.modelmicroservice.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class UserControlerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void case1() throws Exception {

        String json = "{\n" +
                "    \"id\":1,\n" +
                "    \"name\":\"Cezar Silva\"\n" +
                "}";

        mockMvc.perform(post("/v1/user")
                        .contentType("application/json")
                        .content(json))
                .andExpect(status().isOk());
    }
    @Test
    void case2() throws Exception {
        long id = 1L;
        mockMvc.perform(get("/v1/user/"+id)
                        .contentType("application/json"))
                .andExpect(status().isOk());
    }
}