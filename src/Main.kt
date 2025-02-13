
fun main() {
    // Crear instancias de las figuras
    val circulo = Circulo("Rojo", 5.0) // Círculo de radio 5.0 y color Rojo
    val rectangulo = Rectangulo("Azul", 4.0, 6.0) // Rectángulo de ancho 4.0, alto 6.0 y color Azul
    val triangulo = Triangulo("Verde", 3.0, 4.0, 5.0) // Triángulo de lados 3.0, 4.0, 5.0 y color Verde

    // Mostrar información del Círculo
    println("Círculo:")
    println("  - Color: ${circulo.color}")
    println("  - Área: ${circulo.area()}")
    println("  - Perímetro: ${circulo.perimetro()}")
    println()

    // Mostrar información del Rectángulo
    println("Rectángulo:")
    println("  - Color: ${rectangulo.color}")
    println("  - Área: ${rectangulo.area()}")
    println("  - Perímetro: ${rectangulo.perimetro()}")
    println()

    // Mostrar información del Triángulo
    println("Triángulo:")
    println("  - Color: ${triangulo.color}")
    println("  - Área: ${triangulo.area()}")
    println("  - Perímetro: ${triangulo.perimetro()}")
}