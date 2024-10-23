<%-- 
    Document   : adicionarAluno
    Created on : 18 de set. de 2024, 20:35:00
    Author     : alunocmc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adicionado com Sucesso</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <style>
            body {
                background: linear-gradient(to right, rgba(8, 3, 82, 0.8), rgba(53, 2, 77, 0.8));
                min-height: 100vh;
                margin: 0;
                background-attachment: fixed;
                background-size: cover;
            }
            .highlight-text {
                background-color: rgba(0, 0, 0, 0.3);
                padding: 10px;
                border-radius: 5px;
                color: white;
            }
        </style>
    </head>
    <body>
        <div class="container text-center text-white d-flex flex-column align-items-center justify-content-center" style="min-height: 100vh;">
        <h1>Aluno Adicionado com Sucesso</h1>
        <p class="highlight-text">As informações do aluno foram cadastradas.</p>
        <a class="btn btn-success mt-3" href="/trabalho_pratico_m1/listarAlunos">Ver lista de alunos</a>
    </div>
    </body>
</html>
