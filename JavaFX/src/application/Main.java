package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			//Colocando o t�tulo da Interface
			
			
			//Criando o Painel do Grid
			GridPane grid = new GridPane();
			//Setando a dist�ncia horizontal
			grid.setHgap(5.0);
			//Setando a dist�ncia vertical
			grid.setVgap(7.0);
			
			//Input e Label Nome
			grid.add(new Label("Nome: "), 0, 0);
			TextField txtNome = new TextField();
			grid.add((txtNome), 1, 0);
			
			//Input e Label Sexo
			grid.add(new Label("Sexo: "), 0, 1);
			RadioButton btnMasc = new RadioButton("Masculino");
			RadioButton btnFem = new RadioButton("Feminino");
			//Deixando o sexo Masculino j� selecionado
			btnMasc.setSelected(true);
			
			//Colando os bot�es no mesmo grupo para que quando um for selecionado o outro n�o possa ser selecionado junto
			ToggleGroup group = new ToggleGroup();
			btnFem.setToggleGroup(group);
			btnMasc.setToggleGroup(group);
			//Adicionando os bot�es no grid
			
			
			//Adicionando o grid na tela
			root.setCenter(grid);
			
			primaryStage.setMaximized(true);
			primaryStage.setScene(scene);
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
