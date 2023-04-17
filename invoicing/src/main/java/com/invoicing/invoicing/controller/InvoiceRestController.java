package com.invoicing.invoicing.controller;

import com.invoicing.invoicing.entity.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.invoicing.invoicing.entity.InvoiceResponse;
import com.invoicing.invoicing.repository.InvoiceRepository;

import java.util.Optional;


@RestController
public class InvoiceRestController {

    @Autowired
    InvoiceRepository invoiceRepository;

    @GetMapping("/invoices")
    public InvoiceResponse getAllInvoices(){
        return new InvoiceResponse(invoiceRepository.findAll());
    }

    @GetMapping("/invoices/{id}")
    public Invoice getInvoice(@PathVariable Long id) {
        return invoiceRepository.findById(id).get();
    }

    @PostMapping("/invoices")
    public ResponseEntity<String> createInvoice(@RequestBody Invoice invoice) {
        Invoice savedInvoice = invoiceRepository.save(invoice);
        return ResponseEntity.ok("Invoice created with ID: " + savedInvoice.getID());
    }

    // Not all params are used as they cannot / should not be edited (e.g. invoice location)
    @PutMapping("/invoices/{id}")
    public ResponseEntity editInvoice(
            @PathVariable Long id,
            @RequestParam int StaffID,
            @RequestParam(required = false) String Payment_Date) {
        Optional<Invoice> optionalInvoice = invoiceRepository.findById(id);
        if (optionalInvoice.isPresent()) {
            Invoice invoice = optionalInvoice.get();
            invoice.setStaffID(StaffID);

            if (Payment_Date != null) {
                invoice.setPayment_Date(Payment_Date);
            }

            invoiceRepository.save(invoice);
            return ResponseEntity.ok("Invoice edited with ID: " + invoice.getID());
        }
        return ResponseEntity.badRequest().body("Not able to update the invoice");
    }


    @DeleteMapping("/invoices/{id}")
    public boolean deleteInvoice(@PathVariable Long id) {
        Optional<Invoice> invoice = invoiceRepository.findById(id);

        if (invoice.isPresent()) {
            invoiceRepository.delete(invoice.get());
            return true;
        } else {
            return false;
        }
    }
    
}
