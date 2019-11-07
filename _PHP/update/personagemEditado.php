<?php

  require_once '../class/personagem.class.php';

  $id = $_POST['id'];
  $nome = $_POST['nome'];
  $origem = $_POST['origem'];
  $profissao = $_POST['profissao'];

  $personagem = new Personagem("", "", "", "");

  $personagem->editarPersonagem($id, $nome, $origem, $profissao);

 ?>

<?php
  header('Location: ../read/personagens.php');
 ?>
