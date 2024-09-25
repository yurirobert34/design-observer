package org.financeiro.model;

import org.financeiro.observer.Observer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private String produto;
    private BigDecimal valor; //quero observar esse valor
    private BigDecimal desconto;
    private List<Observer> observers = new ArrayList<Observer>();

    public Estoque(){};
    public Estoque(String produto, BigDecimal valor, BigDecimal desconto) {
        this.produto = produto;
        this.valor = valor;
        this.desconto = desconto;
    }


//Observer é a nossa interface - ela que chama o Gerente
    public void attach(Observer observer) {
        observers.add(observer);
    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
        notifyObservers();
    }
    public String getProduto() {
        return produto;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }
}
