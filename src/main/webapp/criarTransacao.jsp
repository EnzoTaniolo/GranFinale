<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Fintech - Criar Transação</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="./resources/css/bootstrap.css">
    <link rel="stylesheet" href="./resources/index.css">
</head>
<body>
<div class="container mt-5">
    <div class="card">
        <div class="card-header">
            <h3>Criar Transação</h3>
        </div>
        <div class="card-body">
            <form action="criarTransacao" method="POST">
                <div class="mb-3">
                    <label for="transacao" class="form-label">Valor</label>
                    <input type="number" class="form-control" id="transacao" name="valor" required placeholder="Informe o valor da transação" step="0.01">
                </div>
                <div class="mb-3">
                    <label for="descricao" class="form-label">Descrição</label>
                    <textarea class="form-control" id="descricao" name="descricao" rows="3" required placeholder="Informe a descrição da transação"></textarea>
                </div>
                <div class="mb-3">
                    <label for="data" class="form-label">Data</label>
                    <input type="date" class="form-control" id="data" name="data" required>
                </div>
                <button type="submit" class="btn btn-dark">Criar Transação</button>
                <a href="/home" class="btn btn-outline-dark mt-2">Cancelar</a>
            </form>
        </div>
    </div>
</div>
<script src="resources/js/bootstrap.bundle.js"></script>
</body>
</html>