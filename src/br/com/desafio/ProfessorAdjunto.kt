package br.com.desafio

open class ProfessorAdjunto(
        nome: String,
        sobrenome: String,
        tempoCasa: Int,
        val quantHorasMonitoria: Int,
        codigoProfessor: Int): Professor (nome, sobrenome, tempoCasa, codigoProfessor){}
