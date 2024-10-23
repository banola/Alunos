<%-- 
    Document   : IndexAdicionarAluno
    Created on : 18 de set de 2024, 23:13:18
    Author     : rafha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adicionar Aluno</title>
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
            .form-group {
                margin-bottom: 15px;
            }
            .form-control {
                border-radius: 4px;
                box-shadow: none;
            }
            .btn-primary {
                border-radius: 4px;
            }
        </style>
    </head>
    
    <body>
        <div class="container mt-5">
            <h2 class="text-center mb-4">Adicionar Novo Aluno</h2>
    
            <form action="adicionarAluno" method="post">
                <div class="mb-3">
                    <label for="Nome" class="form-label">Nome</label>
                    <input type="text" class="form-control" id="Nome" name="Nome" required />
                </div>
                <div class="mb-3">
                    <label for="Email" class="form-label">Email</label>
                    <input type="email" class="form-control" id="Email" name="Email" required />
                </div>
                <div class="mb-3">
                    <label for="Curso" class="form-label">Curso</label>
                    <input type="text" class="form-control" id="Curso" name="Curso" required />
                </div>
                <div class="mb-3">
                    <label for="Ano_de_Ingresso" class="form-label">Ano de Ingresso</label>
                    <input type="number" class="form-control" id="Ano_de_Ingresso" name="Ano_de_Ingresso" required />
                </div>
                <input type="submit" class="btn btn-primary mb-3" value="Adicionar Aluno" />
            </form>
            
            <div>                           
                <a href="/trabalho_pratico_m1/listarAlunos" class="btn btn-secondary">Ver lista de alunos</a>           
            </div>

        </div>
        
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-p5M0qIBPHzmPm5v4gNxUuWV+5qSAQAs7F4F9eD5KlF2B5R3Vt3MLO2dD9I1wRzH5" crossorigin="anonymous"></script>
        
    </body>
</html>
