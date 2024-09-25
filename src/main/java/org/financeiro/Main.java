package org.financeiro;

import org.financeiro.model.Estoque;
import org.financeiro.model.Gerente;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal valorInicial = new BigDecimal("1090.0");
        BigDecimal desconto = new BigDecimal("10.0");
        Gerente gerente = new Gerente("João");
        Estoque estoque = new Estoque("Camiseta", valorInicial, desconto);
        estoque.attach(gerente);//attach - anexar
        estoque.setValor(valorInicial);
    }
}