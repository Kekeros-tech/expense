package com.finance.interfaces.rest;

import com.finance.controller.AccountsApi;
import com.finance.dto.AccountDto;
import com.finance.domain.port.IServiceStoragePort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class AccountsService implements AccountsApi {

    private final IServiceStoragePort storage;

    @Override
    public List<AccountDto> getAccounts() {
        return storage.getAllAccounts();
    }
}
