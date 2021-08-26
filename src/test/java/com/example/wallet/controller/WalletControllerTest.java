package com.example.wallet.controller;

import com.example.wallet.dataModelObject.Money;
import com.example.wallet.service.WalletService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static com.example.wallet.dataModelObject.Currency.DOLLAR;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(WalletController.class)
class WalletControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private WalletService walletService;

    @Test
    public void shouldReturnDepositAmountDetailsWhenAmountIsDeposited() throws Exception {

        String expectedMoney =  "{" +
                "\"amount\": 20.00,"+ "\"currency\": \"DOLLAR\""+"}";

        Money money= Money.builder()
                .amount(20.00)
                .currency(DOLLAR)
                .build();

        when(walletService.deposit(money)).thenReturn(money);

        mockMvc.perform(post("/api/v1/depositAmount")
                .contentType(MediaType.APPLICATION_JSON)
                .content(expectedMoney)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
                //.andExpect(content().string(containsString(money.getAmount())));
        
    }

    @Test
    public void shouldReturnBadRequestWhenInvalidCurrencyIsGiven() throws Exception {

        String expectedMoney =  "{" +
                "\"amount\": 20.00,"+ "\"currency\": \"Yen\""+"}";

        mockMvc.perform(post("/api/v1/depositAmount")
                .contentType(MediaType.APPLICATION_JSON)
                .content(expectedMoney)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest())
                .andReturn();

    }

}