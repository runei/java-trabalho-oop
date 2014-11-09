package javaapplication1;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author henrique
 */
public class Livro implements Serializable
{
    
    private long isbn;
    private String titulo;
    
    public Livro()
    {
        
    }
    
    public Livro(long isbn, String titulo)
    {
        this.isbn = isbn;
        this.titulo = titulo;
    }
    
}
