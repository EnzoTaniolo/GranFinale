<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="pt">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Fintech - Extrato Bancário</title>
  <!-- Bootstrap CSS -->
  <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light d-flex justify-content-center align-items-center" style="min-height: 100vh;">

<div class="container my-5 p-4 bg-white rounded shadow-sm" style="max-width: 800px;">
  <!-- Saldo Total -->
  <div class="text-center mb-4">
    <h3 class="font-weight-bold">Saldo Total</h3>
    <p class="display-4 text-success">R$ 6.234,12</p>
  </div>

  <!-- Tabela de Extrato Bancário -->
  <div class="table-responsive">
    <table class="table table-striped table-hover">
      <thead class="thead-dark">
      <tr>
        <th scope="col">Data</th>
        <th scope="col">Descrição</th>
        <th scope="col">Tipo</th>
        <th scope="col" class="text-right">Valor (R$)</th>
      </tr>
      </thead>
      <tbody>
      <tr>
        <td>08/11/2024</td>
        <td>Depósito</td>
        <td class="text-success">Crédito</td>
        <td class="text-right text-success">+500,00</td>
      </tr>
      <tr>
        <td>07/11/2024</td>
        <td>Compra Supermercado</td>
        <td class="text-danger">Débito</td>
        <td class="text-right text-danger">-150,00</td>
      </tr>
      <tr>
        <td>05/11/2024</td>
        <td>Pagamento Conta de Luz</td>
        <td class="text-danger">Débito</td>
        <td class="text-right text-danger">-200,00</td>
      </tr>
      <tr>
        <td>03/11/2024</td>
        <td>Salário</td>
        <td class="text-success">Crédito</td>
        <td class="text-right text-success">+3.000,00</td>
      </tr>
      <!-- Adicione mais linhas conforme necessário -->
      </tbody>
    </table>
  </div>
</div>

<!-- Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
