<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link href="https://fonts.googleapis.com/css?family=Caveat" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="../css/style2ponto0.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <link href="https://fonts.googleapis.com/css?family=Dancing+Script" rel="stylesheet">
 
    <title>Passos da História</title>
  </head>
  <body>
    <?php 
      include_once "menu.php";
    ?>
    <section class="Conteudo">

     
   
      <div class="jumbotron">
      <h1  id="cav" class="display-4">Comidas</h1>
      <br>
      <p class="lead">As comidas serão itens coletáveis. Elas poderão ser utilizadas para recuperar pontos de vida do jogador (HP).</p> 


        <hr class="my-4">
        <br>

      <div class="row">

        <div class="col-sm-4">
            <div class="card" style="width: 16rem;">
              <img id="pao" class="card-img-top" src="../img/Pão.png" alt="Card image cap">
             
              <div class="card-body">
                <h5 class="cardtitle">Pão</h5>
                  <hr class="my-2">
                 <p>Cura: 15/100 (HP)</p>
                <div class="progress">
                
                <div class="progress-bar progress-bar-striped progress-bar-animated  bg-success" role="progressbar" aria-valuenow="15" aria-valuemin="0" aria-valuemax="100" style="width: 15%"></div>
                
              
                </div>
            </div>
          </div>
      </div>

      <div class="col-sm-4">
            <div class="card" style="width: 16rem;">
              <img id="william" class="card-img-top" src="../img/Frango.png" alt="Card image cap">
             
              <div class="card-body">
                <h5 class="cardtitle">Frango</h5>
                  <hr class="my-2">
                <p>Cura: 25/100 (HP)</p>
                <div class="progress">
                
                <div class="progress-bar progress-bar-striped progress-bar-animated  bg-success" role="progressbar" aria-valuenow="25" aria-valuemin="0" aria-valuemax="100" style="width: 25%"></div>
             
              
                </div>
                
            </div>
          </div>
      </div>
  
       <div class="col-sm-4"> 
        <div class="card" style="width: 16rem;">
          <img id="carne" class="card-img-top" src="../img/Carne.png" alt="Card image cap">
    
          <div class="card-body">
            <h5 class="cardtitle">Carne</h5>
                     <hr class="my-2">
                     <p>Cura: 35/100 (HP)</p>
                <div class="progress">
                
                <div class="progress-bar progress-bar-striped progress-bar-animated  bg-success" role="progressbar" aria-valuenow="35" aria-valuemin="0" aria-valuemax="100" placeholder style="width: 35%"></div>
                
                
              
                </div>

          </div>
        </div>
      </div>

    </div>


    


    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>