package programa3

class Vector(var vec: IntArray = IntArray(10)) {
    init{
        cargar()
    }

    fun cargar(){
        for (i in vec.indices){
            vec[i] = ((Math.random() * 101)).toInt()
        }
    }

    fun imprimir(){
        println("Listado completo del arreglo")
        for(i in vec.indices){
            print("${vec[i]} ")
        }
        println()
    }
    fun  muestraMayor(){
        var mayor = vec[0]
        for(i in vec.indices){
            if(vec[i]>mayor){
                mayor = vec[i]
            }
        }
        println("El elemento mayor del arreglo es $mayor")
    }

    fun muestraMenor(){
        var menor = vec[0]
        for(i in vec.indices){
            if(vec[i]<menor){
                menor = vec[i]
            }
        }
        println("El elemento mayor del arreglo es $menor")
    }
}