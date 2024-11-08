<%-- saldo.jsp --%>
<!DOCTYPE html>
<html lang="pt">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Página de Saldo</title>
  <!-- Bootstrap CSS -->
  <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
</head>
<body class="bg-light d-flex justify-content-center align-items-center" style="height: 100vh;">

<div class="container text-center border rounded shadow-sm p-4 bg-white" style="max-width: 400px;">
  <div class="d-flex justify-content-between">
    <small class="text-muted">Saldo Total</small>
    <small class="text-muted">00/00/0000</small>
  </div>
  <h3 class="font-weight-bold my-3">R$ 0.000,00</h3>

  <div class="my-3">
    <p class="mb-1">Bem vindo, "USUARIO"</p>
    <i class="fas fa-user-circle fa-3x text-dark"></i>
  </div>

  <!-- Formulário para redirecionar para extrato.jsp -->
  <form method="post">
    <div class="d-flex justify-content-between align-items-center my-3">
      <button type="submit" name="redirectToExtrato" class="btn btn-dark btn-block">Extrato</button>
    </div>
  </form>

  <div class="d-flex justify-content-between mt-4">
    <i class="fas fa-arrow-left fa-lg"></i>
  </div>
</div>

<!-- JSP para redirecionamento -->
<%
  if (request.getParameter("redirectToExtrato") != null) {
    response.sendRedirect("extrato.jsp");
  }
%>

<!-- Bootstrap JS and Font Awesome -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
