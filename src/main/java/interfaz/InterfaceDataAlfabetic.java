package interfaz;

import clases.Moneda;

import java.time.LocalDate;

public interface InterfaceDataAlfabetic {

    LocalDate getGenericData(); // ordenar por fecha

    String getGenericAlfabetic(); // ordenar por letra

    int getGenericValor(); // para iterar por valor ingresado por consola

}
