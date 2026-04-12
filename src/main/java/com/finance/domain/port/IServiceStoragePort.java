package com.finance.domain.port;

import com.finance.interfaces.dto.AccountDto;

import java.util.List;

public interface IServiceStoragePort {
    List<AccountDto> getAllAccounts();
}
