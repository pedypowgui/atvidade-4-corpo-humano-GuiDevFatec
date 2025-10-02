//package main.java;
public class CorpoHumano {
    private double volume, densidade, altura;
    
    public double massa;

//Construtor da classe
    public CorpoHumano(double massa, double volume, double densidade, double altura){
        this.massa = massa;
        this.volume = volume;
        this.densidade = densidade;
        this.altura = altura;
    }

//Calcular índice de massa corporal(IMC)
    public double calcularIMC(){
        return this.massa / (this.altura * this.altura);
    }

//Métodos setters
    public void setMassa(double massa) {
        this.massa = massa;
    }

//    private void setVolume(double volume)
    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setDensidade(double densidade) {
        this.densidade = densidade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


//Métodos getters
    public double getMassa() {
        return this.massa;
    }

    public double getVolume() {
        return this.volume;
    }

    public double getDensidade() {
        return this.densidade;
    }

    public double getAltura() {
        return this.altura;
    }
}
