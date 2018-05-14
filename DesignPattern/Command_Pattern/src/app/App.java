package app;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.ArrayModel;

import commands.EinfuegenCommand;

public class App extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		final ArrayModel myArrayModel = new ArrayModel();

		primaryStage.setTitle("Hello World!");
		TextField index = new TextField();
		index.setText("Stelle");
		TextField eingabe = new TextField();
		eingabe.setText("Zahl");

		HBox textFields = new HBox();
		textFields.getChildren().addAll(index, eingabe);

		Button add = new Button();
		add.setMinWidth(50);
		add.setText("einfügen");
		add.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				CommandManager.getInstance().execAndPush(
						new EinfuegenCommand(myArrayModel, Integer
								.valueOf(index.getText()), Integer
								.valueOf(eingabe.getText())));

			}

		});

		Button undo = new Button();
		undo.setMinWidth(50);
		undo.setText("undo");
		undo.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				try {
					CommandManager.getInstance().undo();
				} catch (UndoRedoException e) {
					System.out.println("lalilu");
				}

			}
		});

		Button redo = new Button();
		redo.setMinWidth(50);
		redo.setText("redo");
		redo.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				try {
					CommandManager.getInstance().redo();
				} catch (UndoRedoException e) {
					System.out.println("lalilu");
				}
			}
		});

		HBox buttonMenu = new HBox();
		buttonMenu.getChildren().addAll(add, undo, redo);

		VBox root = new VBox();
		root.getChildren().addAll(textFields, buttonMenu);

		primaryStage.setScene(new Scene(root, 500, 500));
		primaryStage.show();
	}

}
