/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.trabalho_pratico_m1.controller;

import com.mycompany.trabalho_pratico_m1.model.Aluno;
import com.mycompany.trabalho_pratico_m1.services.AlunoService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author rafha
 */
@WebServlet("/atualizarAluno")
public class AtualizarAlunoServlet extends HttpServlet {
    private AlunoService alunoService = new AlunoService();
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int ID = Integer.parseInt(request.getParameter("ID"));
        String Nome = request.getParameter("Nome");
        String Email = request.getParameter("Email");
        String Curso = request.getParameter("Curso");
        String Ano_de_Ingresso = request.getParameter("Ano_de_Ingresso");
        
        Aluno aluno = alunoService.buscarAluno(ID);
        if (aluno != null){
            aluno.setID(ID);
            aluno.setNome(Nome);
            aluno.setEmail(Email);
            aluno.setCurso(Curso);
            aluno.setAno_de_Ingresso(Ano_de_Ingresso);
            
            alunoService.atualizarAluno(aluno);
            
            request.getRequestDispatcher("/atualizarAluno.jsp").forward(request, response);
        } else{
            response.sendError(HttpServletResponse.SC_NOT_FOUND, "Aluno não encontrado");
        }
    }
}
