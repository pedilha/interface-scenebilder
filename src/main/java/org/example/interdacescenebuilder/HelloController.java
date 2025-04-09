package org.example.interdacescenebuilder;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import org.example.model.Contato;
import org.example.service.ContatoService;

import java.io.IOException;

public class HelloController {
    @FXML private TextField lbNome;
    @FXML private TextField lbEmail;
    @FXML private TextField lbTelefone;
    @FXML private TextField lbSobrenome;
    @FXML private TextField lb_mensagem;
    @FXML private Button btn_enviar;
    @FXML private ChoiceBox<String> assunto;

    private ContatoService contatoService = new ContatoService();

    @FXML
    protected void ButtonClick() {
        String nome = lbNome.getText();
        String sobrenome = lbSobrenome.getText();
        String email = lbEmail.getText();
        String telefone = lbTelefone.getText();
        String mensagem = lb_mensagem.getText();

        String assuntoSelecionado = assunto.getSelectionModel().getSelectedItem();

        Contato contato = new Contato(nome, sobrenome, email, telefone, assuntoSelecionado, mensagem);

        if (!contatoService.validarContato(contato)) {
            exibirAlerta("ERRO!!", "Nome e E-mail são obrigatórios!");
            return;
        } else {
            contatoService.armazenarContato(contato);
            exibirAlerta("SUCESSO!!", "Seu envio foi concluído com sucesso!");
            lbNome.clear();
            lbSobrenome.clear();
            lbEmail.clear();
            lbTelefone.clear();
            lb_mensagem.clear();
            assunto.getSelectionModel().clearSelection();
        }
    }

    private void exibirAlerta(String titulo, String mensagem) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensagem);
        alerta.showAndWait();
    }
    @FXML
    public void abrirListaContatos() {
        try {
            // Carrega o FXML da nova janela (lista_contatos.fxml)
            FXMLLoader loader = new FXMLLoader(getClass().getResource("lista_contatos.fxml"));
            Parent root = loader.load();

            // Cria uma nova Stage para exibir a lista de contatos
            Stage stage = new Stage();
            stage.setTitle("Lista de Contatos");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Opcional: exibir uma mensagem de erro para o usuário
        }
    }
}
