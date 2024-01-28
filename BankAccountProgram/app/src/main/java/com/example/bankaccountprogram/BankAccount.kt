package com.example.bankaccountprogram

class BankAccount (var accountHolder: String, var balance: Double){
    private val tranHist = mutableListOf<String>()
    fun deposit(amount: Double)
    {
        balance += amount
        tranHist.add("$accountHolder deposited $$amount")
    }
    fun withdraw(amount: Double)
    {
        if(balance <= amount)
        {
            tranHist.add("Not enough balance to withdraw $amount")
        }
        else
        {
            balance -= amount
            tranHist.add("$accountHolder withdrew $$amount")
        }
    }
    fun displayTran()
    {
        println("Account history for $accountHolder")
        for(transaction in tranHist)
        {
            println(transaction)
        }
    }
    fun disBalance()
    {
        println("Current balance of $accountHolder is $$balance")
    }
}