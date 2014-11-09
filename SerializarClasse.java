/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author UCS
 */
public class SerializarClasse {
    
    public void serializarLista(ArrayList lista, String caminho) throws IOException
    {
        ObjectOutputStream streamObjFlivros = new ObjectOutputStream(new FileOutputStream(caminho));
        streamObjFlivros.writeObject(lista);
    }
    
    public ArrayList<Livro> lerObj(String caminho) throws IOException, ClassNotFoundException
    {
        ArrayList<Livro> aLivros = new ArrayList<>();
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream(caminho));
        aLivros = (ArrayList<Livro>) stream.readObject();
        return aLivros;
    }

}
