/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.trabalho_pratico_m1.controller;

import com.mycompany.trabalho_pratico_m1.model.Aluno;
import com.mycompany.trabalho_pratico_m1.services.AlunoService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alunocmc
 */
@WebServlet("/listarAlunos")
public class ListarAlunosServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        AlunoService alunoService = new AlunoService();
        List<Aluno> listadeAlunos = alunoService.listarAlunos();
        request.setAttribute("listadeAlunos", listadeAlunos);
        request.getRequestDispatcher("IndexListarAlunos.jsp").forward(request, response);
    }
            
}
