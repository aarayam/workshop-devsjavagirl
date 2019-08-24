package com.djg.emprestimolivro;

import com.djg.emprestimolivro.dominio.Livro;
import com.djg.emprestimolivro.dominio.Usuario;

import java.util.Scanner;

public class TesteLivro {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o nome do livro: ");
        String tituloLivro = scanner.nextLine();

        System.out.println("Digite o autor do livro: ");
        String autorLivro = scanner.nextLine();



        Livro livro = new Livro("1l", tituloLivro, autorLivro);

        livro.imprimeLivro();
    }


}
