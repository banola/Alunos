/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho_pratico_m1.model;

/**
 *
 * @author alunocmc
 */
public class Aluno {
    
    private int ID;
    private String Nome;
    private String Email;
    private String Curso;
    private String Ano_de_Ingresso;
    
    public Aluno(String Nome, String Email, String Curso, String Ano_de_Ingresso) {
        this.Nome = Nome;
        this.Email = Email;
        this.Curso = Curso;
        this.Ano_de_Ingresso = Ano_de_Ingresso;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public String getAno_de_Ingresso() {
        return Ano_de_Ingresso;
    }

    public void setAno_de_Ingresso(String Ano_de_Ingresso) {
        this.Ano_de_Ingresso = Ano_de_Ingresso;
    }

}
