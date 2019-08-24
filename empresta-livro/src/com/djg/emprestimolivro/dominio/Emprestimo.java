package com.djg.emprestimolivro.dominio;

public class Emprestimo {

    private String codigoSolicitacao;
    private String usuarioSolicitante;
    private  String livroSolicitado;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(String codigoSolicitacao, String usuarioSolicitante, String livroSolicitado, String dataEmprestimo, String dataDevolucao) {
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

    public String getUsuarioSolicitante() {
        return usuarioSolicitante;
    }

    public void setUsuarioSolicitante(String usuarioSolicitante) {
        this.usuarioSolicitante = usuarioSolicitante;
    }

    public String getLivroSolicitado() {
        return livroSolicitado;
    }

    public void setLivroSolicitado(String livroSolicitado) {
        this.livroSolicitado = livroSolicitado;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
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
