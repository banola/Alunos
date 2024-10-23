<%-- 
    Document   : IndexListarAlunos
    Created on : 18 de set de 2024, 23:16:11
    Author     : rafha
--%>

<%@page import="java.util.List"%>
<%@page import="com.mycompany.trabalho_pratico_m1.model.Aluno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Alunos</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <style>
            body {
                background: linear-gradient(to right, rgba(8, 3, 82, 0.8), rgba(53, 2, 77, 0.8));
                min-height: 100vh;
                margin: 0;
                background-attachment: fixed;
                background-size: cover;
            }
            .container {
                margin-top: 20px;
                padding: 20px;
                background-color: #fff;
                border-radius: 8px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            }
            .table {
                margin-bottom: 20px;
            }
            .btn-secondary {
                margin-top: 10px;
            }
        </style>
    </head>
    <body>
        <div class="container mt-5">
            <h2 class="text-center mb-4">Lista de Alunos Cadastrados</h2>

            <table class="table table-bordered table-striped">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Nome</th>
                        <th>Email</th>
                        <th>Curso</th>
                        <th>Ano de Ingresso</th>
                        <th>Ações</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        List<Aluno> alunos = (List<Aluno>) request.getAttribute("listadeAlunos");
                        if (alunos != null && !alunos.isEmpty()) {
                            for (Aluno aluno : alunos) {
                    %>
                    <tr>
                        <td><%= aluno.getID() %></td>
                        <td><%= aluno.getNome() %></td>
                        <td><%= aluno.getEmail() %></td>
                        <td><%= aluno.getCurso() %></td>
                        <td><%= aluno.getAno_de_Ingresso() %></td>
                        <td>
                            <div class="btn-group gap-2 d-md-block">
                                <a href="/trabalho_pratico_m1/editarAluno?ID=<%= aluno.getID() %>" class="btn btn-warning btn-sm">Editar</a>
                                <a href="/trabalho_pratico_m1/deletarAluno?ID=<%= aluno.getID() %>" class="btn btn-danger btn-sm" onclick="return confirm('Tem certeza que deseja excluir este aluno?');">Excluir</a>
                            </div>
                        </td>
                    </tr>
                    <%
                        }
                    } else {
                    %>
                    <tr>
                        <td colspan="6" class="text-center">Nenhum aluno cadastrado.</td>
                    </tr>
                    <%
                    }
                    %>
                </tbody>
            </table>

            <a href="/trabalho_pratico_m1/IndexAdicionarAluno.jsp" class="btn btn-primary">Adicionar Novo Aluno</a>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-p5M0qIBPHzmPm5v4gNxUuWV+5qSAQAs7F4F9eD5KlF2B5R3Vt3MLO2dD9I1wRzH5" crossorigin="anonymous"></script>
    </body>
</html>

