/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author henrique
 */
public class JavaApplication1 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        System.out.println("LerOBJ");
        SerializarClasse serClasse = new SerializarClasse();
        try {
            ArrayList<Livro> aLivros = serClasse.lerObj("C:/listaLivro.obj");
        } catch (IOException ex) {
            Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JavaApplication1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("LerCSV");
        try
        {
            LerCSV obj = new LerCSV();
            
            ArrayList<Livro> livros = obj.carregarLivros();
            ArrayList<Usuario> usuarios = obj.carregarUsuarios();
            ArrayList<Rating> rating = obj.carregarRating();
            
            SerializarClasse serializar = new SerializarClasse();
            serializar.serializarLista(livros, "C:/listaLivro.obj");
            serializar.serializarLista(usuarios, "C:/listaUsuarios.obj");
            serializar.serializarLista(rating, "C:/listaRating.obj");
            
            System.out.println("Arquivos carregados com sucesso!");
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
    
}
