package com.exemplo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Soma de Valores - JavaFX");

        // Rótulos e caixas de texto para entrada
        Label lblTitulo = new Label("Calculadora de Soma");
        lblTitulo.setStyle("-fx-font-size: 18px; -fx-font-weight: bold; -fx-text-fill: #1a365d;");

        Label lblValor1 = new Label("Primeiro valor:");
        TextField txtValor1 = new TextField();
        txtValor1.setPromptText("Digite o primeiro número");

        Label lblValor2 = new Label("Segundo valor:");
        TextField txtValor2 = new TextField();
        txtValor2.setPromptText("Digite o segundo número");

        // Botão de comando para somar
        Button btnSomar = new Button("Somar Valores");
        btnSomar.setStyle("-fx-background-color: #2b6cb0; -fx-text-fill: white; -fx-font-weight: bold; -fx-padding: 8 16; -fx-background-radius: 5;");
        btnSomar.setOnMouseEntered(e -> btnSomar.setStyle("-fx-background-color: #2c5282; -fx-text-fill: white; -fx-font-weight: bold; -fx-padding: 8 16; -fx-background-radius: 5; -fx-cursor: hand;"));
        btnSomar.setOnMouseExited(e -> btnSomar.setStyle("-fx-background-color: #2b6cb0; -fx-text-fill: white; -fx-font-weight: bold; -fx-padding: 8 16; -fx-background-radius: 5;"));

        // Ação do botão
        btnSomar.setOnAction(event -> {
            String str1 = txtValor1.getText().trim();
            String str2 = txtValor2.getText().trim();

            if (str1.isEmpty() || str2.isEmpty()) {
                mostrarAlerta(Alert.AlertType.WARNING, "Campos Obrigatórios", "Atenção", "Por favor, preencha ambos os campos com números.");
                return;
            }

            try {
                // Aceita vírgula ou ponto como separador decimal
                double num1 = Double.parseDouble(str1.replace(",", "."));
                double num2 = Double.parseDouble(str2.replace(",", "."));
                double resultado = num1 + num2;

                // Formatação do resultado (se for inteiro exibe sem casas decimais)
                String resultadoFormatado = (resultado == (long) resultado) 
                        ? String.valueOf((long) resultado) 
                        : String.format(java.util.Locale.US, "%.2f", resultado);

                mostrarAlerta(Alert.AlertType.INFORMATION, "Resultado", "Cálculo Realizado", 
                        "A soma de " + str1 + " + " + str2 + " é:\n\n" + resultadoFormatado);

            } catch (NumberFormatException e) {
                mostrarAlerta(Alert.AlertType.ERROR, "Erro de Entrada", "Valor Inválido", 
                        "Por favor, insira valores numéricos válidos.");
            }
        });

        // Formulário com Grid
        GridPane formGrid = new GridPane();
        formGrid.setHgap(10);
        formGrid.setVgap(12);
        formGrid.setAlignment(Pos.CENTER);

        formGrid.add(lblValor1, 0, 0);
        formGrid.add(txtValor1, 1, 0);
        formGrid.add(lblValor2, 0, 1);
        formGrid.add(txtValor2, 1, 1);

        // Layout Principal
        VBox root = new VBox(15);
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(25));
        root.setStyle("-fx-background-color: #f7fafc;");
        root.getChildren().addAll(lblTitulo, formGrid, btnSomar);

        Scene scene = new Scene(root, 380, 240);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    // Método auxiliar para exibir caixas de mensagem (Alerts)
    private void mostrarAlerta(Alert.AlertType tipo, String titulo, String cabecalho, String mensagem) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(cabecalho);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
