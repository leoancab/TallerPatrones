/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tallerpatrones;

/**
 *
 * @author leoan
 */
public class TallerPatrones {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        SistemaInformes sistemaInformes = SistemaInformes.getInstance();
        PDFcreator I1creator = new PDFcreator();
        sistemaInformes.generarYVisualizarInforme(I1creator);

        InformeCreator I2creator = new ExcelCreator();
        sistemaInformes.generarYVisualizarInforme(I2creator);

    }
}
