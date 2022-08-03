fun main() {
  //Declarando uma lista de animais imutável
  val animais = listOf("Cachorro", "Gato", "Papagaio")
  
  //Para cada item da lista imprime o valor
  for (animal in animais){
      println(animal)
  }
  
  //imprime o valor de um a 5
  for (i in 1..5){
      println(i)
  }
  
  //imprive o valor de um até 5
  for(i in 1 until 5){
      print(i)
  }
  
}