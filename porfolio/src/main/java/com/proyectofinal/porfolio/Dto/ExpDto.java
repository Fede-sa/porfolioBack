
package com.proyectofinal.porfolio.Dto;

import jakarta.validation.constraints.NotBlank;


public class ExpDto {
    
    @NotBlank
    private String nombreE;
    
    @NotBlank
    private String descripcionE;

    public ExpDto() {
    }

    public ExpDto(String nombreE, String descripcionE) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }
    
    
    
}
