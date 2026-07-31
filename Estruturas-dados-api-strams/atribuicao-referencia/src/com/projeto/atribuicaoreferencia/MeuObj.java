package com.projeto.atribuicaoreferencia;

public class MeuObj {
    Integer num;

    public Integer getNum(Integer num) {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }
    
}
