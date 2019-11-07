<!DOCTYPE html>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link href="https://fonts.googleapis.com/css?family=Caveat" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="../css/style2ponto0.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Dancing+Script" rel="stylesheet">

 
    <title>Formulário</title>
  </head>
<body>

	<?php 
      include_once "../pages/menu.php";
    ?>
<section class="Conteudo">
	<div class="jumbotron">
	<h1 id="subiTitulo">Formulário de Cadastro</h1>
		<div id="formulario" class="container-fluid text-center">
			<form class="cadastro" name="cadastro"  action="../create/recebe_personagem.php" method="get" >
				<fieldset>
					<legend>Cadasto</legend>
					<div class="row">
						
  						<div class="col">
  							<label for="nome">Nome: </label>
  							<input class="form-control" type="text" name="nome" id="nome" >
  						</div>
            
	          			<div class="col"> 
	                  			<label for="id"> ID: </label>
	                  			<input class="form-control" type="num" name="id" id="id"  >
	              		</div> 
	              	</div>
    				<div class="row">	
					   		<div class="col"> 
	                  			<label for="id"> Origem: </label>
	                  			<input class="form-control" type="text" name="origem" id="origem"  >
	              			</div>

	              			<div class="col"> 
	                  			<label for="id"> Profissão: </label>
	                  			<input class="form-control" type="text" name="profissao" id="profissao"  >
	              			</div>
	              	</div>
					
					<br>

					<input type="submit" value="Enviar" id="enviar" class="btn btn-success"  name="cadastrar"> 
					<input type="reset" value="Limpar Campos" class="btn btn-success">
					
					<div id="msgErro" class="alert alert-danger" role="alert">
					 	Existem campos não preenchidos
					</div>
					<div id="msgErroSenha" class="alert alert-danger" role="alert">
					 	Senhas incompatíveis
					</div>
					<div id="msgErroEmail" class="alert alert-danger" role="alert">
					 	Email inválido
					</div>
			</fieldset>
			</form>
		</div>
	</div>
</section>
<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>