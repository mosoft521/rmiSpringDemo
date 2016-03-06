package com.gmail.mosoft521.rmiSpringDemo;

public interface AccountService {
    int queryBalance(String mobileNo);

    String shoopingPayment(String mobileNo, byte protocol);
}