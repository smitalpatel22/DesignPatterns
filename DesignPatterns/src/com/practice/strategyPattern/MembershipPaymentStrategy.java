package com.practice.strategyPattern;

public class MembershipPaymentStrategy implements PaymentStrategy
{
    private String emailId;
    private String password;

    MembershipPaymentStrategy(String email, String pwd){
        this.emailId=email;
        this.password=pwd;
    }

    @Override
    public void pay (int amount)
    {
        System.out.println(amount + " paid using Membership Account.");
    }
}
