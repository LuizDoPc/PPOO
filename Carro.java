package com.company;

public class Carro extends Veiculo implements Tributavel{
    private String categoria;

    public Carro(String marca, String modelo, int anoFabricacao, String categoria) {
        super(marca, modelo, anoFabricacao);
        setCategoria(categoria);
    }

    public double calcularIPVA(){
        if(getCategoria() == "passeio"){
            return 1500/(2019 - getAnoFabricacao());
        }else {
            return 1000/(2019 - getAnoFabricacao());
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nCategoria: " + getCategoria() + "\nIPVA: " + calcularIPVA();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
