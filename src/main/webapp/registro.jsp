<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Fintech - Registro</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./resources/css/bootstrap.css">
    <link rel="stylesheet" href="./resources/index.css">
</head>
<body>
<div class="login-card">
    <h1>Fintech</h1>
    <p>Olá, seja bem vindo!</p>
    <form action="registro" method="post">
        <input type="text" id="nome" name="nome" placeholder="Nome" required>
        <input type="email" id="email" name="email" placeholder="Email" required>
        <input type="text" id="cpf" name="cpf" placeholder="Cpf" required>
        <input type="date" id="data_nascimento" name="data_nascimento" placeholder="Data Nascimento" required>
        <input type="password" id="senha" name="senha" placeholder="Senha" required>

        <button type="submit" class="btn btn-dark">Criar Conta</button>
        <button type="button" class="btn btn-danger mt-1">Cancelar</button>
    </form>
</div>
<script src="resources/js/bootstrap.bundle.js"></script>
</body>
</html>
