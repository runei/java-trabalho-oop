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
public class Rating implements Serializable
{
    
    private int usuario_id;
    private long isbn;
    private int rating;
    
    public Rating(int usuario_id, long isbn, int rating)
    {
        this.usuario_id = usuario_id;
        this.isbn = isbn;
        this.rating = rating;
    }
    
}
