package com.example.calculadoradenotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /* 05/03/2021 TODO OK: 18 - Criando uma variável para o button calcular  */
        val btCalcular = calcular
        /* 05/03/2021 TODO:  19 - Criando variável do botão resultado */

        /* 05/03/2021 TODO:  20 - Evento de click para o botão calcular */
        btCalcular.setOnClickListener {
            /* 05/03/2021 TODO:  21 - Transformando todos os dados recebidos em int e calculando as médias*/
            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1 + nota2) / 2
            val faltas = Integer.parseInt(faltas.text.toString())

            /* 05/03/2021 TODO:  22 - se o aluno nota <= 6 ou faltas > 10 = reprovado / criar estrutura de condição e retornar resultado de texto*/
            if (media >=6 && faltas <=10) {
                resultado.setText("Aluno aprovado!" + "\n" + "Nota final: " + media + "\n" + "Faltas: " + faltas)
                /* 05/03/2021 TODO:  23 - alterando a cor do texto de acordo com o resultado */
                resultado.setTextColor(Color.GREEN)
            }else {
                resultado.setText("Aluno reprovado!" + "\n" + "Nota final: " + media + "\n" + "Faltas: " + faltas)
                resultado.setTextColor(Color.RED)
            }
        }
    }
}