class Circulo(private val radio: Double, color: String): Figura(color) {
    override fun area(): Double {
        return radio * radio * Math.PI
    }

    override fun perimetro(): Double {
        return 2 * Math.PI * radio
    }
}