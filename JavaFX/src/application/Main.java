package application;
	
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			//Criando o Painel do Grid
			GridPane grid = new GridPane();
			//Setando a distância horizontal
			grid.setHgap(5.0);
			//Setando a distância vertical
			grid.setVgap(7.0);
			
			//Input e Label Nome
			grid.add(new Label("Nome: "), 0, 0);
			TextField txtNome = new TextField();
			grid.add((txtNome), 1, 0);
			
			//Input e Label Sexo
			grid.add(new Label("Sexo: "), 0, 1);
			RadioButton btnMasc = new RadioButton("Masculino");
			RadioButton btnFem = new RadioButton("Feminino");
			
			//Colocando Select and Option
			ChoiceBox<String> chcEstados =  new ChoiceBox<>();
			ObservableList<String> estados = FXCollections.observableArrayList("São Paulo", "Rio de Janeiro", "Minas Gerais");
			chcEstados.setItems(estados);
			 
			grid.add((chcEstados), 0, 2);
			
			//Deixando o sexo Masculino já selecionado
			btnMasc.setSelected(true);
			grid.setStyle("-fx-background-color: BEIGE;-fx-font: normal bold 20px 'Times';"); 
			
			//Colando os botões no mesmo grupo para que quando um for selecionado o outro não possa ser selecionado junto
			ToggleGroup group = new ToggleGroup();
			btnFem.setToggleGroup(group);
			btnMasc.setToggleGroup(group);
			
			//Juntando os botões em uma mesma caixa
			HBox radioBox = new HBox(5.0, btnMasc, btnFem);
			
			grid.add((radioBox), 1, 1);
			
			Label lblTeste = new Label();
			grid.add((lblTeste), 0, 3);
			
			//Criando os botões
			Button btnTeste = new Button("Enviar");
			btnTeste.setOnAction(event -> lblTeste.setText(txtNome.getText()));
			grid.add((btnTeste), 1, 2);
			
			
			//Alinhando a Grid
			grid.setAlignment(Pos.CENTER); 
			
			//Adicionando o grid no root
			root.setCenter(grid);
			
			//Colocando a tela maximizada
			primaryStage.setMaximized(true);
			primaryStage.setScene(scene);
			
			//Colocando o título da Interface
			primaryStage.setTitle("Primeira Interface");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
