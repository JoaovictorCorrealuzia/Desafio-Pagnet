package com.br.joaovictor.desafiopagnet.domain.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import com.br.joaovictor.desafiopagnet.domain.enums.TransactionType;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter 
@AllArgsConstructor  
public class Transaction {
   
   private final TransactionType transactionType;
   private final LocalDate date;
   private final BigDecimal value;
   private final String cpf;
   private final String card;
   private final LocalTime hour;
   private final String storeOwner;
   private final String storeName;
}
