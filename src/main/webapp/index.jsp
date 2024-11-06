<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Fintech - Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./resources/css/bootstrap.css">
    <link rel="stylesheet" href="./resources/index.css">
</head>
<body>
<div class="login-card">
    <h1>Fintech</h1>
    <p>Olá, seja bem vindo!</p>
    <form>
        <input type="email" placeholder="email" required>
        <input type="password" placeholder="senha" required>
        <button type="submit" class="btn btn-dark">Entrar</button>
        <button type="button" class="btn btn-outline-dark mt-2">Criar Conta</button>
    </form>
</div>
<script src="resources/js/bootstrap.bundle.js"></script>
</body>
</html>
