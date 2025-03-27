package org.example.interdacescenebuilder;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML private TextArea lbNome;
    @FXML private TextArea lbSobrenome;
    @FXML private TextArea lbEmail;
    @FXML private TextArea lbTelefone;
    @FXML private TextField lb_mensagem;
    @FXML private Button btn_enviar;


    @FXML
    protected void ButtonClick() {
        String nome = lbNome.getText();
        String sobrenome = lbSobrenome.getText();
        String email = lbEmail.getText();
        String telefone = lbTelefone.getText();
        String mensagem = lb_mensagem.getText();


        if (nome.isEmpty() || email.isEmpty()) {
            exibirAlerta("ERRO!!", "Nome e E-mail sao obrigatórios!");
            return;
        }

    }


    private void exibirAlerta (String titulo, String mensagem){
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensagem);
        alerta.showAndWait();
    }

}