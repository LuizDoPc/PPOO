package com.company;

public class Caminhao extends Veiculo implements Tributavel{
    private int numEixos;

    public Caminhao(String marca, String modelo, int anoFabricacao, int numEixos) {
        super(marca, modelo, anoFabricacao);
        setNumEixos(numEixos);
    }

    public double calcularIPVA(){
        return 200 * getNumEixos() / (2019 - getAnoFabricacao());
    }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero de Eixos: " + getNumEixos() + "\nIPVA: " + calcularIPVA();
    }

    public int getNumEixos() {
        return numEixos;
    }

    public void setNumEixos(int numEixos) {
        this.numEixos = numEixos;
    }
}
