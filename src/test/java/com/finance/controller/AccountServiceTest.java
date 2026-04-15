package com.finance.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import com.finance.utils.JsonComparisonUtils;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;


@AutoConfigureMockMvc
@SpringBootTest
@Slf4j
public class AccountServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getAccounts_ValidData() throws Exception {
        String result = mockMvc.perform(get("/accounts"))
                .andExpect(status().isOk())
                .andReturn()
                .getResponse()
                .getContentAsString();

        JsonComparisonUtils.assertEqual(result, "accounts/allAccounts_success.json");
    }
}
