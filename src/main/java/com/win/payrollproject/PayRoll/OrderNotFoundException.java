package com.win.payrollproject.PayRoll;

class OrderNotFoundException extends RuntimeException {

    OrderNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}