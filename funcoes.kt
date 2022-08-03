 //Função que imprime um texto
 fun novaFuncao(){
     println("Oi, tudo bem?")
 }
 
 //Função que recebe uma String
 private fun novaFuncao2(nome: String){
     println("oi, $nome")
 }
 
fun main() {
    //Chama a função
    novaFuncao()
 
	//Chama a função passando uma string
 	novaFuncao2("Flávio")
}