<!DOCTYPE html>
<html>
<head>
	<title>Personagens Consultados</title>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <script src="js/jquery-3.3.1.min.js"></script>


    <link href="https://fonts.googleapis.com/css?family=Caveat" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="../css/styleCa.css">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Dancing+Script" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Caveat" rel="stylesheet">
      <script>
      function confirmarExclusao(id){
        var resposta = confirm("Excluir Personagem?");

        
        if (resposta) {
          window.location.replace ('../delete/recebe_excluirPersonagem.php?id=' + id);
        }
      }
    </script>
</head>
<body>
	<?php 
      include_once "../pages/menu.php";
      require_once "../class/personagem.class.php";
      require_once "../read/personagens.php";
      
      $nome = $_POST["nome"];
      $personagem = new Personagem("","","","");
      $consulta = $personagem->consultarPersonagens($nome);

      echo "<table class='table table-border'";
        echo "<tr>";
        echo  "<th>ID</th>";
        echo  "<th>Nome</th>";
        echo  "<th>Origem</th>";
        echo  "<th>Profissão</th>";
        echo "<th>Ações</th>";
        echo "</tr>";

        foreach ($consulta as $personagem) {
          echo "<tr>";
          echo "<td> {$personagem['id']} </td>";
          echo "<td> {$personagem['nome']} </td>";
          echo "<td> {$personagem['origem']} </td>";
          echo "<td> {$personagem['profissao']} </td>";
          echo "<td>";
          echo "<a href='../update/editarpersonagem.php?id={$personagem['id']}& nome={$personagem['nome']}& origem={$personagem['origem']}& profissao={$personagem['profissao']}'>Editar  </a>| ";
          echo "<a href='javascript:func()' onclick='confirmarExclusao({$personagem['id']})'>Excluir</a>";
          echo "</td>";
          echo "</tr>";
        }
      echo "</table";
  ?> 
  </body>
</html>