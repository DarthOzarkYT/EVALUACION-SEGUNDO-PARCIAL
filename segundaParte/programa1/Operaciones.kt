package programa1

class Operaciones(var num1: Int = 0, var num2: Int = 0) {
    fun cargar(){
        print("Ingrese primer valor: ")
        num1 = readLine()!!.toInt()
        print("Ingrese segundo valor: ")
        num2 = readLine()!!.toInt()
        sumar()
        restar()
    }

    fun sumar(){
        val suma = num1 + num2
        println("La suma de $num1 y $num2 es: $suma")
    }

    fun restar(){
        val resta = num1 - num2
        println("La resta de $num1 y $num2 es: $resta")
    }
}