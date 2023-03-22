package com.invoicing.invoicing.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.invoicing.invoicing.entity.Invoice;

public interface InvoiceRepository extends CrudRepository<Invoice, Long> {
    
    List<Invoice> findAll();
    
}
