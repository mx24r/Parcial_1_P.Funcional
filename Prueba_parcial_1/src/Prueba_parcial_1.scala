  object Prueba_parcial_1 {
    def main(args: Array[String]): Unit = {

<<<<<<< Updated upstream
      // Ejercicio 1
      def myMethod(datos : List[Double]): Double = {
        val promedio = (datos : List[Double]) => datos.sum / datos.size
        def diferencia(k : Double) : Double = k - promedio(datos)
        val sumaCuadrados: Double = datos.map {
          def diferencia(k : Double) : Double = k - promedio(datos)
          def sumaCuadrados(diferencia: Double) : Double = diferencia * diferencia
          sumaCuadrados
        }.sum
        Math.sqrt(sumaCuadrados / datos.size)
      }
      println(myMethod(List(1.0,2.0,3.0)))
=======
      // Ejercicio 1 corregido
      def myMethod(datos: List[Double]): Double = {
        val promedio = datos.sum / datos.size
        def diferencia(k: Double): Double = k - promedio
        def cuadrado(x: Double): Double = x * x
        val sumaCuadrados: Double = datos.map(d => cuadrado(diferencia(d))).sum
        Math.sqrt(sumaCuadrados / datos.size)
      }
      println(myMethod(List(1.0, 2.0, 3.0)))
>>>>>>> Stashed changes

      // Ejercicio 2
      def transformarCalificaciones(calificaciones: List[Double], politica: String): List[Double] = {
        politica match {
          // Politica redondeo: Si el decimal es mayor a 0.5, se redondea al inmediato superior, para lo cual
          // primero se suma 0.5 a la calificación original, luego se redondea hacia abajo con math.floor
          case "redondear" => calificaciones.map {
            c =>
              val decimal = c - math.floor(c)
              decimal match {
                case decimal if decimal >= 0.5  => math.floor(c) + 1    // redondeo hacia arriba
                case _             => c        // no redondea si el decimal no es mayor o igual a 0.5
              }
            }

          // Politica bonificación: Se suman de 2 puntos a la calificación orifinal si el estudiante
          // realizó una actividad extra-curricular
          case "bonificacion" =>
            calificaciones.map(c => c + 2.0) // Bonificación de 2 puntos si realizó una actividad extra-curricular

          // Politica disminuir: Disminuir 0.5 puntos si la calificación es mayor o igual a 9.5 puntos
          case "disminuir" =>
            calificaciones.map(c => if (c >= 9.5) c - 0.5 else c)

          // Política Desconocida: Si la política no es reconocida, se devuelve la lista original
          case _ =>
            println(s"Política desconocida: $politica")
            calificaciones
        }
      }
      println(transformarCalificaciones(List(9.5, 10, 6.3, 8, 6), "redondear"))

<<<<<<< Updated upstream




    // Ejercicio 3
=======
      // Ejercicio 3 corregido
>>>>>>> Stashed changes
      def generadorSaludoAnonimo: String => String => String = {
        def f1(fraseBase: String): String => String = {
          def f2(nombre: String): String =
            s"$fraseBase, $nombre!"
          f2 // retorno correcto y bien indentado
        }
        f1 // retorno correcto y bien indentado
      }
      println(generadorSaludoAnonimo("Hola")("Mateo"))
    }

