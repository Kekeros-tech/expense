package com.finance.infrastructure.storage;

import com.finance.domain.port.IServiceStoragePort;
import com.finance.interfaces.dto.AccountDto;
import com.finance.interfaces.dto.AccountStatusEnum;
import com.finance.interfaces.dto.AccountTypeEnum;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@ConditionalOnProperty(name = "storage.type", havingValue = "dev", matchIfMissing = true)
@RequiredArgsConstructor
@Slf4j
public class DevStoragePortAdapter implements IServiceStoragePort {

    public static final Map<Long, AccountDto> accounts = new HashMap<>();
    static {
        accounts.put(1L,
                AccountDto.builder()
                .id(1L)
                .name("Пиво")
                .type(AccountTypeEnum.CHECKING)
                .balance(125000L)
                .currency("RUB")
                .status(AccountStatusEnum.ACTIVE)
                .icon("piggy-bank")
                .build()
        );
    }

    @Override
    public List<AccountDto> getAllAccounts() {
        return accounts.values().stream().toList();
    }
}
