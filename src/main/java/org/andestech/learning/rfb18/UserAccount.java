package org.andestech.learning.rfb18;

import java.util.ArrayList;
import java.util.List;

public class UserAccount implements IAccount {

    private int account = 0;
    private int balance = 0;
    private List<String> operations = new ArrayList<>();

    public UserAccount(int account, int balance) {
        this.account = account;
        this.balance = balance;
    }

    @Override
    public void withdrawal(int money) {
        if (this.balance >= money) {
            this.balance = this.balance - money;
            operations.add("Снятие с счета суммы: " + money);
        } else {
            System.out.println("На счету недостаточно средств для соверщения операции");
        }


    }

    @Override
    public void checkTransaction() {
        operations.add("Текущий баланс: " + balance);
    }

    @Override
    public void put(int money) {
        operations.add("Зачисление на счет суммы: " + money);
        this.balance = this.balance + money;
    }

    public String report() {

        StringBuilder sb = new StringBuilder("Report:\n");
        for(String operation : operations) {
            sb.append(operation).append("\n");
        }
        return sb.toString();
    }
}
