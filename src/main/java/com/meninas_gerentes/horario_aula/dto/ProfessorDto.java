package com.meninas_gerentes.horario_aula.dto;

import com.meninas_gerentes.horario_aula.modelo.Professor;

public class ProfessorDto {
    private String nome;
    private int idade;


    public ProfessorDto() {
    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Professor novoProfessor() {
     return new Professor(this.nome, this.idade);
    }
}
