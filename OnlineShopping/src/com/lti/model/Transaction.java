package com.lti.model;

import java.time.LocalDate;

public class Transaction {
	int TtransactionId;
	LocalDate transactionDate;
	double transactionAmount;
	public int getTtransactionId() {
		return TtransactionId;
	}
	public void setTtransactionId(int ttransactionId) {
		TtransactionId = ttransactionId;
	}
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	public double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	
}
