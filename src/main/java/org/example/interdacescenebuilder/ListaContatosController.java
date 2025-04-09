package org.example.interdacescenebuilder;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.model.Contato;
import org.example.service.ContatoService;

public class ListaContatosController {

    @FXML
    private TableView<Contato> tabelaContatos;

    @FXML
    private TableColumn<Contato, String> colNome;
    @FXML
    private TableColumn<Contato, String> colSobrenome;
    @FXML
    private TableColumn<Contato, String> colEmail;
    @FXML
    private TableColumn<Contato, String> colTelefone;
    @FXML
    private TableColumn<Contato, String> colAssunto;
    @FXML
    private TableColumn<Contato, String> colMensagem;

    @FXML
    public void initialize() {
        colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        colSobrenome.setCellValueFactory(new PropertyValueFactory<>("sobrenome"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));
        colAssunto.setCellValueFactory(new PropertyValueFactory<>("assunto"));
        colMensagem.setCellValueFactory(new PropertyValueFactory<>("mensagem"));

        // Use diretamente a ObservableList do serviço, garantindo atualização automática.
        tabelaContatos.setItems(ContatoService.getInstance().listarContatos());
    }
}
