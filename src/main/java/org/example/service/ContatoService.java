package org.example.service;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.model.Contato;
import java.util.List;

public class ContatoService {
    // Mantenha a lista como ObservableList para notificações automáticas de alteração.
    private ObservableList<Contato> contatos = FXCollections.observableArrayList();

    // Singleton
    private static ContatoService instance = new ContatoService();
    public static ContatoService getInstance() {
        return instance;
    }

    public boolean validarContato(Contato contato) {
        return contato.isValid();
    }

    public void armazenarContato(Contato contato) {
        contatos.add(contato);
    }

    // Retorna a lista observável para que a interface se atualize automaticamente.
    public ObservableList<Contato> listarContatos() {
        return contatos;
    }
}
