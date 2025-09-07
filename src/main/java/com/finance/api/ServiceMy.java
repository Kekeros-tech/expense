package com.finance.api;

import com.finance.model.Expense;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
@RestController
public class ServiceMy implements ApiApi {
    @Override
    public ResponseEntity<List<Expense>> apiExpensesGet() {
        log.info("Response");
        Expense exp = new Expense();
        exp.setId(1L);
        exp.setAmount(new BigDecimal("10.2"));
        List<Expense> res = List.of(exp);
        return ResponseEntity.ok(res);
    }
}