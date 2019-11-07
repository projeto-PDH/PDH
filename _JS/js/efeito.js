
function f1(){
	const text = baffle('.data');
	text.set({
	  characters : 'zpxzVpasdfh86136░█▒ ░░░█▓ >░░ ▓/▒█▓ █ █>█▒sayg▒ ░░░█▓ >yf',
	  speed: 150
	});
	text.start();
	text.reveal(40000);

	const text1 = baffle('.quote');
	text1.set({
	  characters : 'qwertyuiopasdfgh8613611888',
	  speed: 140
	});
	text1.start();
	text1.reveal(5500);
	
}
setTimeout(function(){ document.getElementById("iniciar").style.display = "block"; }, 4000); 

	
	