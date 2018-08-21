package org.andestech.learning.rfb18;

public interface IAccount {

    void withdrawal(double w) throws TransactionalException;

    void put(double p) throws TransactionalException;

    void CheckLimit();

    void report();
}