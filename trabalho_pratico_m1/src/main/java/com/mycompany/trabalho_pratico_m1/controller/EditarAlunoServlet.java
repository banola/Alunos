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
@WebServlet("/editarAluno")
public class EditarAlunoServlet extends HttpServlet {
    private AlunoService alunoService = new AlunoService();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int ID = Integer.parseInt(request.getParameter("ID"));
        
        Aluno aluno = alunoService.buscarAluno(ID);
        
        if (aluno == null){
            response.sendError(HttpServletResponse.SC_NOT_FOUND, "Aluno não encontrado.");
            return;
        }
        
        request.setAttribute("aluno", aluno);
        
        request.getRequestDispatcher("/editarAluno.jsp").forward(request, response);
    }
}
