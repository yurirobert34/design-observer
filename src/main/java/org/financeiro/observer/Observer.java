package org.financeiro.observer;

import org.financeiro.model.Estoque;

public interface Observer {
    public void update(Estoque estoque);
}
