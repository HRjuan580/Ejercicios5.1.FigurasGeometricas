class Rectangulo(color: String): Figura(color) {
    override fun area(): Double {

    }

    override fun perimetro(): Double{
        return 2 * ancho + 2 * alto
    }
}