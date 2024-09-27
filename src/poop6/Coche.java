/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop6;

/**
 *
 * @author Fernando, Emilinao, Sebastian    
 */
public class Coche {
    private String color;
    private String marca;
    private String placa;
    
    /**
    * Constructor vacío
    */
    public Coche() {
    }

    /**
    *
    * @param color El color del coche
    * @param marca La marca del coche
    * @param placa Placa vehicular
    */
    public Coche(String color, String marca, String placa) {
        this.color = color;
        this.marca = marca;
        this.placa = placa;
    }

    /**
    * Método que devuelve el color
    * @return color del coche
    */
    public String getColor() {
        return color;
    }

    /**
    * Método que establece el color
    * @param color El color del coche
    */
    public void setColor(String color) {
        this.color = color;
    }

    /**
    * Método que devuelve la marca del coche
    * @return La marca del coche
    */
    public String getMarca() {
        return marca;
    }

    /**
    * Método que establece la marca del coche
    * @param marca La marca del coche
    */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
    * Método que devuelve la placa del coche.
    * @return La placa del coche.
    */
    public String getPlaca() {
        return placa;
    }

    /**
    * Método que establece la placa del coche.
    * @param placa La placa del coche.
    */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
    * Método que acelera el coche.
    */
    public void acelerar() {
        System.out.println("Estoy acelerando.");
    }

    /**
    * Método que hace que frene el coche.
    */
    public void frenar() {
        System.out.println("Frenar");
    }

    /**
    * Método que carga una cosa en el coche.
    * @param cosa Lo que va a cargar el coche.
    * @return Lo que va a cargar el coche.
    */
    public String carga(String cosa) {
        System.out.println("Estoy cargando " + cosa);
        return cosa;
    }

    /**
    * Método que parsea un objeto en una cadena.
    * @return Los atributos del objeto en cadena.
    */
    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", marca=" + marca + ", placa=" + placa + '}';
    }
}
