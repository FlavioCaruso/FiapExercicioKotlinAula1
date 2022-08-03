fun main() {
  //Declarando uma lista de animais imutável
  val animais = listOf("Cachorro", "Gato", "Papagaio")
  println(animais)
  
  //Trazendo o terceiro item da lista
  println(animais[2])
  
  //Criando uma lista mutável
  val nomes = mutableListOf("João", "Flavio", "Cláudia")
  println(nomes)
  
  //Adicionando um item na lista
  nomes.add("Carlos")
  
  println(nomes)
  
}