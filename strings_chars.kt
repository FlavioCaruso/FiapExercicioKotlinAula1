fun main() {
    //Declarando variavel String imutável
    val meuNome = "Flavio"
    
    //Buscando a primeira letra da variavel
    println(meuNome[0])
   
    //Buscando a quarta letra da variavel
    println(meuNome[3])
    
    //Verificando se a variavel esta vazia
    println(meuNome.isEmpty())
    
    //Retornando a quantidade de caracteres possui na variavel
	println(meuNome.length)
    
    //Buscando da primeira até a terceira letra da variavel
	println(meuNome.substring(0,3))
    
    //Passando a variavel no texto
    println("meu nome é: $meuNome")
}