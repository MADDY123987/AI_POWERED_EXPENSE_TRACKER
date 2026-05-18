package com.AI.ExpenseTracker_Core.Controller;


import com.AI.ExpenseTracker_Core.Request.TransactionRequest;
import com.AI.ExpenseTracker_Core.Response.TransactionResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transactions")
public class TransactionsController {
    public ResponseEntity<TransactionResponse> createTransaction(TransactionRequest request){

    }
}
