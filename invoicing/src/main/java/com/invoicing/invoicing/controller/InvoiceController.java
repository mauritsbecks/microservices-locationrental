package com.invoicing.invoicing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.invoicing.invoicing.entity.InvoiceResponse;
import com.invoicing.invoicing.repository.InvoiceRepository;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class InvoiceController {

    @Autowired
    InvoiceRepository invoiceRepository;

    @GetMapping("/invoices")
    public InvoiceResponse getAllInvoices(){
        return new InvoiceResponse(invoiceRepository.findAll());
    }
    
}
