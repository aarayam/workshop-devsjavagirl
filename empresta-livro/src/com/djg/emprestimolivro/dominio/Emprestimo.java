package com.djg.emprestimolivro.dominio;

import java.time.LocalDate;

public class Emprestimo {

    private String codigoSolicitacao;
    private Usuario usuarioSolicitante;
    private  Livro livroSolicitado;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(String codigoSolicitacao, Usuario usuarioSolicitante, Livro livroSolicitado, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        super();
        this.codigoSolicitacao = codigoSolicitacao;
        this.usuarioSolicitante = usuarioSolicitante;
        this.livroSolicitado = livroSolicitado;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public String getCodigoSolicitacao() {
        return codigoSolicitacao;
    }

    public void setCodigoSolicitacao(String codigoSolicitacao) {
        this.codigoSolicitacao = codigoSolicitacao;
    }

    public Usuario getUsuarioSolicitante() {
        return usuarioSolicitante;
    }

    public void setUsuarioSolicitante(Usuario usuarioSolicitante) {
        this.usuarioSolicitante = usuarioSolicitante;
    }

    public Livro getLivroSolicitado() {
        return livroSolicitado;
    }

    public void setLivroSolicitado(Livro livroSolicitado) {
        this.livroSolicitado = livroSolicitado;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void imprimeEmprestimo() {
        System.out.println("Código de solicitação: " + codigoSolicitacao);
        System.out.println("Usuario: " + usuarioSolicitante);
        System.out.println("Livro: " + livroSolicitado);
        System.out.println("Data de empréstimo: " + dataEmprestimo);
        System.out.println("Data de devolução: " + dataDevolucao);
    }
}
