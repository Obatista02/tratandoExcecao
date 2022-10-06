package model.entities1;

import model.exception.excecao;

public class conta {

	private Integer number;
	private String holder;
	private Double balance;
	private Double saqueLimit;
	
	public conta() {
	}

	public conta(Integer number, String holder, Double balance, Double saqueLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.saqueLimit = saqueLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Double getSaqueLimit() {
		return saqueLimit;
	}

	public void setSaqueLimit(Double saqueLimit) {
		this.saqueLimit = saqueLimit;
	}
	
	public void deposit(Double montante) {
		balance += montante;
	}
	public void saque(Double montante) {
		balance -= montante;
	}
	
	public void validaSaque(double montante) {
			if(montante > getSaqueLimit()) {
				throw new excecao("Erro de Saque: A quantia vai alem da permitida");
			}
			if(montante > getBalance()) {
				throw new exception("Erro de saque: Saldo insuficiente");
			}
	}
	
}
