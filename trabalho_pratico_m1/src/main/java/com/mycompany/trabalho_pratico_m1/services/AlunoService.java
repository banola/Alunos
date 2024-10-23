/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho_pratico_m1.services;

import com.mycompany.trabalho_pratico_m1.model.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunocmc
 */
public class AlunoService {
    
    private static List<Aluno> alunos = new ArrayList<>();
    private int idCounter = 1;
    
    public AlunoService(){

    }
    
    public void adicionarAluno (Aluno aluno){
        aluno.setID(idCounter++);//adicionar ID automaticamente
        alunos.add(aluno);//adiciona aluno
    }
    
    public List<Aluno> listarAlunos(){
        return new ArrayList<>(alunos);//retorna lista de alunos
    }
    
    public Aluno buscarAluno(int ID) {
        for (Aluno aluno : alunos) {
            if (aluno.getID() == ID) {
                return aluno; // Retorna o aluno encontrado
            }
        }
        return null; // Retorna null se não encontrar o aluno
    }
    
    public void atualizarAluno(Aluno aluno) {
            for (int i = 0; i < alunos.size(); i++) {
                Aluno alunoExistente = alunos.get(i);
                if (alunoExistente.getID() == aluno.getID()) {               
                    alunos.set(i, aluno);
                    return;// Atualiza as informações do aluno existente
                }
            }
    }
    
    public void deletarAluno(int ID){
        alunos.removeIf(aluno -> aluno.getID() == ID);//deleta aluno pelo ID
    }
    
}
