package com.djg.emprestimolivro;

import com.djg.emprestimolivro.dominio.Usuario;

import java.util.Scanner;

public class TestaUsuario {

    public static void main(String[] args) {

//        Usuario usuario1 = new Usuario("Mayara", "06/04/1996", "Lugarnenhum");
//        usuario1.imprimeUsuario();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua data de nascimento: ");
        String dataNascimento = scanner.nextLine();

        System.out.println("Digite seu endereço: ");
        String endereco = scanner.nextLine();

        Usuario usuario = new Usuario("1l", nome, dataNascimento, endereco);

        usuario.imprimeUsuario();
    }


}
