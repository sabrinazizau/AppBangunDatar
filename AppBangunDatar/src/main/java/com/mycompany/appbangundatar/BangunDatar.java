/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.appbangundatar;

/**
 *
 * @author SABRINA AZIZA UTAMI
 */
abstract class BangunDatar {
    private String namaBangunDatar;

    public BangunDatar() {
    }

    public String getNamaBangunDatar() {
        return namaBangunDatar;
    }

    public void setNamaBangunDatar(String namaBangunDatar) {
        this.namaBangunDatar = namaBangunDatar;
    }
    
    abstract double luas();
    abstract double keliling();
    
}
