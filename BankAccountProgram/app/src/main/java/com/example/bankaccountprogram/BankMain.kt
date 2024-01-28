package com.example.bankaccountprogram

fun main()
{
    val myBankAcc = BankAccount("Sirius", 1343.00)
    val bankAcc2 = BankAccount("Sarah",0.00)
    myBankAcc.deposit(208.00)
    myBankAcc.withdraw(1200.00)
    myBankAcc.deposit(3000.00)
    myBankAcc.deposit(2000.00)
    myBankAcc.withdraw(3333.15)
    myBankAcc.withdraw(2500.00)
    bankAcc2.deposit(100.00)
    bankAcc2.withdraw(10.00)
    bankAcc2.deposit(300.00)
    myBankAcc.displayTran()
    myBankAcc.disBalance()
    bankAcc2.displayTran()
    bankAcc2.disBalance()
    //println("${myBankAcc.accountHolder}'s balance is $${myBankAcc.balance}")
}