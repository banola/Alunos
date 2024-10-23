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
@WebServlet("/deletarAluno")
public class DeletarAlunoServlet extends HttpServlet {
    private AlunoService alunoService = new AlunoService();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String stringID = request.getParameter("ID");
        
        if (stringID != null && !stringID.isEmpty()){
            try{
            int ID = Integer.parseInt(stringID);
            
            alunoService.deletarAluno(ID);
                        
            request.getRequestDispatcher("/deletarAluno.jsp").forward(request, response);
            } catch(NumberFormatException e){
                response.sendError(HttpServletResponse.SC_BAD_REQUEST, "ID inválido.");
            }

        } else {
            response.sendError(HttpServletResponse.SC_NOT_FOUND, "Aluno não encontrado");
        }        
    }
}
