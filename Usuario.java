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
public class Usuario implements Serializable, Comparable
{
    
    private int id;
    private int age;
    private String city;
    private String state;
    private String country;
    
    public Usuario(int id, int age, String city, String state, String country)
    {
        this.id = id;
        this.age = age;
        this.city = city;
        this.state = state;
        this.country = country;
    }

	@Override
	public int compareTo(Object arg0) {
		Usuario usuario = (Usuario) arg0;
		return this.country.compareTo(usuario.country);
	}
    
}
