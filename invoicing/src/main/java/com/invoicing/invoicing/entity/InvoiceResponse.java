package com.invoicing.invoicing.entity;

import java.util.List;

public class InvoiceResponse {
    private List<Invoice> invoices;

    public InvoiceResponse() {}

    public InvoiceResponse(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }
}
