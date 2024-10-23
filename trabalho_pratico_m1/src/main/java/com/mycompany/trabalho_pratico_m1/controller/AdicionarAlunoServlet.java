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
 * @author alunocmc
 */
@WebServlet("/adicionarAluno")
public class AdicionarAlunoServlet extends HttpServlet {
    private final AlunoService alunosService = new AlunoService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
    String Nome = request.getParameter("Nome");
    String Email = request.getParameter("Email");
    String Curso = request.getParameter("Curso");
    String Ano_de_Ingresso = request.getParameter("Ano_de_Ingresso");
    Aluno aluno = new Aluno(Nome, Email, Curso, Ano_de_Ingresso);
    alunosService.adicionarAluno(aluno);
    response.sendRedirect("adicionarAluno.jsp");
    }
    
}
