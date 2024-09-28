/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IECJDI.biblioteca.servicos;

import IECJDI.biblioteca.Autor;
import IECJDI.biblioteca.Editora;
import IECJDI.biblioteca.Livro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nilton Goes
 */
public class BaseDeDados {
    
    private List<Livro> livros;
    
    private List<Autor> autores;
    
    private List<Editora> editoras;

    public BaseDeDados() {
        autores = new ArrayList<>();
        livros = new ArrayList<>();
        editoras = new ArrayList<>();
                    
    }
    
    
    
    public boolean criarAutor(Autor autor){
        return autores.add(autor);
    }
    
    public Autor buscarAutor(String nome){
        for(Autor autor :autores){
            if(autor.getNome().equalsIgnoreCase(nome)) {
                return autor;
            }
        }
        return null;
    }
    
    public boolean apagarAutor(Autor autor){
        if(autores.contains(autor)){
           return autores.remove(autor);
        }
        return false;
    }
    
    public Autor atualizarAutor(Autor autor){
        if(autores.contains(autor)){
            apagarAutor(autor);
            autores.add(autor);
        }
        return autor;
    }
    
    public void popularAutores(){
        
        Autor autor = new Autor();
        autor.setNome("Nilton Goes");
        autor.setGenero(true);       
        autores.add(autor);
        
        autor = new Autor();
        autor.setNome("Graziela Fernanda");
        autor.setGenero(false);       
        autores.add(autor);
        
        autor = new Autor();
        autor.setNome("Pablo Mina");
        autor.setGenero(true);       
        autores.add(autor);
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }
    
    
    
}
