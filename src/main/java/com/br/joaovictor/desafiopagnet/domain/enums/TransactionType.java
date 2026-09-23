package com.br.joaovictor.desafiopagnet.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter 
@AllArgsConstructor 
public enum TransactionType {
   DEBIT("1","Debit",true),
   BANK_SLIP("2","Bank Slip",false),
   FINANCING("3","Financing",false),
   CREDIT("4","Credit",true),
   LOAN_RECEIPT("5","Loan Receipt",true),
   SALES("6","Sales",true),
   TED_RECEIPT("7","TED Receipt",true),
   DOC_RECEIPT("8","DOC Receipt",true),
   RENT("9","Rent",false);

   private final String code;
   private final String description;
   private final boolean entry;

   public static TransactionType fromCode(String code) {
    for (TransactionType type : values()) {
        if (type.code.equals(code)) {
            return type;
        }
    }
    throw new IllegalArgumentException("Unknown transaction code: " + code);
   }

   public int getSignal() {
    if (this.entry) {
        return 1;
    } else {
        return -1;
    }
   }
}
