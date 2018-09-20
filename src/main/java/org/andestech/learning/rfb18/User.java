package org.andestech.learning.rfb18;

import java.util.Random;

public class User {

    private final UserAccount account;
    private int client_number = 0;

    public int getClient_number() {
         return client_number;
    }

    public User(UserAccount account) {
        this.account = account;
        this.client_number = new Random().nextInt(100);
    }

    public UserAccount getAccount() {
        return account;
    }
}
