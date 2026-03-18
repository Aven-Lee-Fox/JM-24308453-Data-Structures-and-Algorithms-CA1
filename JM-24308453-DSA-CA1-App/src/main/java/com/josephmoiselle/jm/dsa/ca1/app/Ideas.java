/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.josephmoiselle.jm.dsa.ca1.app;

import java.io.Serializable;

/**
 *
 * @author Joseph Moiselle 24308453
 */
public class Ideas implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    String title;
    String desc;
    String area;
    
    public Ideas(String title, String desc, String area){
    
        this.title = title;
        this.desc = desc;
        this.area = area;
        
    }
    
    public String getTitle(){
    
        return title;
        
    }
    
    public String getDesc(){
    
        return desc;
        
    }
    
    public String getArea(){
    
        return area;
        
    }
    
}