class Triangulo(color: String) : Figura(color) {


    var lado1: Double = 0.0
    var lado2: Double = 0.0
    var lado3: Double = 0.0

    // Constructor primario
    constructor(color: String, lado1: Double, lado2: Double, lado3: Double) : this(color) {
        this.lado1 = lado1
        this.lado2 = lado2
        this.lado3 = lado3
    }

    constructor() : this("Negro", 0.0, 0.0, 0.0)

    override fun area(): Double {
        val semiperimetro = perimetro() / 2
        return sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3))
    }

    override fun perimetro(): Double {
        return lado1 + lado2 + lado3
    }
}