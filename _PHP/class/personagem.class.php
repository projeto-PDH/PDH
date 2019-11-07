<?php  

require_once "../connection/Conexao.class.php";
Class Personagem{


	private $id;
	private $nome;
  private $origem;
  private $profissao;
	

  public function getId(){
    return $this->id;
  }

  public function setId($id){
    $this->id = $id;
  }

  public function getNome(){
    return $this->nome;
  }

  public function setNome($nome){
    $this->nome = $nome;
  }

  public function getOrigem(){
    return $this->origem;
  } 
  public function setOrigem($origem){
    $this->origem = $origem;
  }

  public function getProfissao(){
  	return $this->profissao;
  }
  public function setProfissao(){
  	$this->profissao= $profissao;
  }
  

	public function __construct($id="", $nome="", $origem="", $profissao=""){
		$this->id = $id;
		$this->nome = $nome;
		$this->origem = $origem;
		$this->profissao = $profissao;
		
	}

	public function inserirPersonagem(){

	    $conexao = new Conexao();
	    $cn = $conexao->getInstance();

	    $stmt = $cn->prepare('INSERT INTO personagem VALUES (:id,:nome,:origem,:profissao)');
	    $stmt->bindParam(':id', $this->id);
	    $stmt->bindParam(':nome', $this->nome);
	    $stmt->bindParam(':origem', $this->origem);
	    $stmt->bindParam(':profissao', $this->profissao);
	    $result = $stmt->execute();

	    if(!$result){
	      echo "Erro";
	      exit;
	    }

	    echo $stmt->rowCount(). " personagem inserido com sucesso";
  }

  public function consultarPersonagens($nome) {
    $conexao = new Conexao();
    $cn = $conexao->getInstance();

    $stmt = $cn->prepare('SELECT * FROM personagem WHERE nome LIKE :nome');
   	$stmt->bindValue(':nome', "%$nome%");
    $stmt->execute();
    $result = $stmt->fetchAll(PDO::FETCH_ASSOC);

    if ($result==null) {
      echo "Erro";
      exit;
    }

    return $result;

  }

  public function excluirPorId($id){
    $conexao = new Conexao();
    $cn = $conexao->getInstance();

    $stmt = $cn->prepare('DELETE FROM personagem WHERE id = :id');
    $stmt->bindParam(':id', $id);
    $stmt->execute();

    $result = $stmt->fetchAll(PDO::FETCH_ASSOC);

  }


  public function editarPersonagem($id, $nome, $origem, $profissao){
    $conexao = new Conexao();
    $cn = $conexao->getInstance();

    $stmt = $cn->prepare('UPDATE personagem SET nome = :nome, origem = :origem, profissao = :profissao WHERE id = :id');
    $stmt->bindParam(':id', $id);
    $stmt->bindParam(':nome', $nome);
    $stmt->bindParam(':origem', $origem);
    $stmt->bindParam(':profissao', $profissao);
    $stmt->execute();

    $result = $stmt->fetchAll(PDO::FETCH_ASSOC);

  }
	
	}

?>
