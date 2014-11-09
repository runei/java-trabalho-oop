package javaapplication1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
 
public class LerCSV
{

    private static final String cvsSplitBy = ";";
 
    public LerCSV() 
    {
    }
 
    public ArrayList<Livro> carregarLivros() 
    {
        String csvFile = "/home/henrique/Downloads/BX-CSV-Dump/BX-Books.csv";
        BufferedReader br = null;
        String line;
        ArrayList<Livro> aLivros = new ArrayList<>();
        
        try 
        {

            br = new BufferedReader(new FileReader(csvFile));
            line = br.readLine();
            while ((line = br.readLine()) != null) 
            {
                String[] livro = line.split(cvsSplitBy);
                Livro l = new Livro(Long.parseLong(livro[0]), livro[1]);
                aLivros.add(l);
            }

        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            if (br != null) 
            {
                try 
                {
                    br.close();
                } 
                catch (IOException e) 
                {
                    e.printStackTrace();
                }
            }
        }
        return aLivros;
    }
 
    public ArrayList<Usuario> carregarUsuarios() 
    {
        String csvFile = "/home/henrique/Downloads/BX-CSV-Dump/BX-Users.csv";
        BufferedReader br = null;
        String line;
        ArrayList<Usuario> aUsuarios = new ArrayList<>();
        
        try 
        {

            br = new BufferedReader(new FileReader(csvFile));
            line = br.readLine();
            while ((line = br.readLine()) != null) 
            {
                String[] usuario = line.split(cvsSplitBy);
                String[] local = usuario[1].split(",");
                Usuario u = new Usuario(Integer.parseInt(usuario[0]), Integer.parseInt(local[0]), local[1], local[2] , usuario[2]);
                aUsuarios.add(u);
            }
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            if (br != null) 
            {
                try 
                {
                    br.close();
                } 
                catch (IOException e) 
                {
                    e.printStackTrace();
                }
            }
        }
        return aUsuarios;
    }
    
    public ArrayList<Rating> carregarRating() 
    {
        String csvFile = "/home/henrique/Downloads/BX-CSV-Dump/BX-Book-Ratings.csv";
        BufferedReader br = null;
        String line;
        ArrayList<Rating> aRating = new ArrayList<>();
        
        try 
        {

            br = new BufferedReader(new FileReader(csvFile));
            line = br.readLine();
            while ((line = br.readLine()) != null) 
            {
                String[] rating = line.split(cvsSplitBy);
                Rating r = new Rating(Integer.parseInt(rating[0]), Long.parseLong(rating[1]), Integer.parseInt(rating[2]));
                aRating.add(r);
            }
       } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        } 
        finally 
        {
            if (br != null) 
            {
                try 
                {
                    br.close();
                } 
                catch (IOException e) 
                {
                    e.printStackTrace();
                }
            }
        }
        return aRating;
    }
    
}