package com.demo.kafka.springbootwithkafka.model;

public class Transaction {

    private String ido;

    private double amount;

    private long numberCreditCard;

    private String expirationDateMonth;

    private String expirationDateYear;

    private String codeCVC;

    public Transaction(){
    }

    public Transaction(String ido, double amount, long numberCreditCard, String expirationDateMonth, String expirationDateYear, String codeCVC) {
        this.ido = ido;
        this.amount = amount;
        this.numberCreditCard = numberCreditCard;
        this.expirationDateMonth = expirationDateMonth;
        this.expirationDateYear = expirationDateYear;
        this.codeCVC = codeCVC;
    }

    public String getIdo() {
        return ido;
    }


    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public long getNumberCreditCard() {
        return numberCreditCard;
    }

    public void setNumberCreditCard(long numberCreditCard) {
        this.numberCreditCard = numberCreditCard;
    }

    public String getExpirationDateMonth() {
        return expirationDateMonth;
    }

    public void setExpirationDateMonth(String expirationDateMonth) {
        this.expirationDateMonth = expirationDateMonth;
    }

    public String getExpirationDateYear() {
        return expirationDateYear;
    }

    public void setExpirationDateYear(String expirationDateYear) {
        this.expirationDateYear = expirationDateYear;
    }

    public String getCodeCVC() {
        return codeCVC;
    }

    public void setCodeCVC(String codeCVC) {
        this.codeCVC = codeCVC;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "ido='" + ido + '\'' +
                ", amount=" + amount +
                ", numberCreditCard=" + numberCreditCard +
                ", expirationDateMonth='" + expirationDateMonth + '\'' +
                ", expirationDateYear='" + expirationDateYear + '\'' +
                ", codeCVC='" + codeCVC + '\'' +
                '}';
    }

}
