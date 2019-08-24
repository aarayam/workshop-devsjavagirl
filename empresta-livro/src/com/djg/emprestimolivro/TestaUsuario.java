package com.djg.emprestimolivro;

import com.djg.emprestimolivro.dominio.Usuario;

public class TestaUsuario {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("Mayara", "06/04/1996", "Lugarnenhum");

        usuario1.imprimeUsuario();
    }
}
