package com.company;

public class Bicicleta extends Veiculo{
    private int marchas;

    public Bicicleta(String marca, String modelo, int anoFabricacao, int marchas) {
        super(marca, modelo, anoFabricacao);
        setMarchas(marchas);
    }

    @Override
    public String toString() {
        return super.toString() + "\nMarchas: " + getMarchas();
    }

    public int getMarchas() {
        return marchas;
    }

    public void setMarchas(int marchas) {
        this.marchas = marchas;
    }
}
