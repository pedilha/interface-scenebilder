package org.example.model;

public class Contato {
    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;
    private String assunto;
    private String mensagem;

    public Contato(String nome, String sobrenome, String email, String telefone, String assunto, String mensagem) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
        this.assunto = assunto;
        this.mensagem = mensagem;
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getSobrenome() { return sobrenome; }
    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getAssunto() { return assunto; }
    public void setAssunto(String assunto) { this.assunto = assunto; }

    public String getMensagem() { return mensagem; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }

    // Opcional: método para validação básica (ex.: formato de e-mail)
    public boolean isValid() {
        if (this.nome == null || this.nome.isEmpty() || this.email == null || this.email.isEmpty()) {
            return false;
        }
        // Adicione outras validações (ex.: regex para e-mail ou número de telefone)
        return true;
    }
}
