
class Rectangulo(color: String, private val ancho: Double, private val alto: Double) : Figura(color) {
    override fun area(): Double {
        return ancho * alto
    }

    override fun perimetro(): Double {
        return 2 * (ancho + alto)
    }
}