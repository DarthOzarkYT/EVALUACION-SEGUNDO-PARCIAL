package programa2

class Dado(var numDado: Int = 1) {
    fun tirar(){
        numDado = ((Math.random() * 6) + 1).toInt()
    }

    fun imprimir(){
        separador()
        println("Valor del dado: $numDado")
        separador()
    }

    fun separador(){
        println("******************************")
    }
}