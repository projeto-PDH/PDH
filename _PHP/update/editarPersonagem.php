<!DOCTYPE html>
<html lang="pt-br">
<head>
  <title>Edição de Personagem</title>
  <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <script src="js/jquery-3.3.1.min.js"></script>


    <link href="https://fonts.googleapis.com/css?family=Caveat" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="../css/style2ponto0.css">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Dancing+Script" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Caveat" rel="stylesheet">
</head>
<body id="corpo">
  <?php
      include_once "../pages/menu.php";

      $id = $_GET['id'];
      $nome = $_GET['nome'];
      $origem = $_GET['origem'];
      $profissao = $_GET['profissao'];

  ?>
  <div class="jumbotron"> 
    <h1 id="titulo"> Editar Personagem </h1>

    <br>
    <form name="consulta" id="formulario" action="personagemEditado.php" method="post">
      <div class="form-group row">
        <label class="col-sm-2 col-form-label">Id</label>
        <div class="col-sm-10">
          <input type="text" class="form-control disabled" name="id" placeholder="id" value=<?php echo $id; ?> readonly>
        </div>
      </div>
      <div class="form-group row">
        <label class="col-sm-2 col-form-label">Nome</label>
        <div class="col-sm-10">
          <input type="text" class="form-control" name="nome" placeholder="Nome" value=<?php echo $nome; ?>>
        </div>
      </div>
      <div class="form-group row">
        <label class="col-sm-2 col-form-label">Origem</label>
        <div class="col-sm-10">
          <input type="text" class="form-control" name="origem" placeholder="origem" value=<?php echo $origem;?>>
        </div>
      </div>
      <div class="form-group row">
        <label class="col-sm-2 col-form-label">Profissão</label>
        <div class="col-sm-10">
          <input type="text" class="form-control" name="profissao" placeholder="profissao" value=<?php echo $profissao;?>>
        </div>
      </div>
      <div class="form-group row">
        <div class="col-sm-10">
          <button type="submit" class="btn btn-outline-success ">Salvar</button>

          <button class="btn btn-outline-success"><a href="../pages/inicio.php">Cancelar</a></button>
        </div>
      </div>
    </form>
  </div>

  <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>  

</body>
</html>
