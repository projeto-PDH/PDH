

$(document).ready(function() {
   
    
    $("#enviar").click(function() {
         if($("#nome").val() == "" ||  $("#e-mail").val() == ""|| $("#senha").val() == ""|| $("#confSenha").val() == "" || $("#cidade").val() == ""){
            $("#msgErro").css({"display" :"inline"});
            return false;
         }
         if($("#senha").val() != $("#confSenha").val()){
              $("#msgErroSenha").css({"display" :"inline"});
              return false;
        }
        if(!($("#email").val().match(/[@]/))){
            $("#msgErroEmail").css({"display" :"inline"});
            return false;    
        }
        
    });

    $("input").blur(function(){
      if($(this).val() == ""){
        $(this).css({"border":"2px solid red"});
      }else {
        $(this).css({"border" : "white"});
      }
    });

});
