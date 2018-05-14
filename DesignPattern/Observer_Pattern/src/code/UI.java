package code;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UI extends Application {
	MyModel model = new MyModel();

	private final ListView<Person> personsListView;

	public UI() {
		personsListView = new ListView<>(model.persons);
	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Hello World!");

		VBox vbox = new VBox();
		Text text = new Text("Welcome!");
		TextArea firstName = new TextArea();
		firstName.setMaxHeight(20);
		TextArea lastName = new TextArea();
		lastName.setMaxHeight(20);
		Button btn = new Button();
		btn.setText("klick");
		btn.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				model.addToPersons(new Person(firstName.getText(), lastName
						.getText()));
			}
		});

		GridPane gridPane = new GridPane();
		ColumnConstraints column1 = new ColumnConstraints(150, 150,
				Double.MAX_VALUE);
		ColumnConstraints column2 = new ColumnConstraints(150, 150,
				Double.MAX_VALUE);
		gridPane.getColumnConstraints().addAll(column1, column2);
		gridPane.add(personsListView, 1, 1, 1, 1);

		vbox.getChildren().addAll(text, firstName, lastName, btn, gridPane);

		StackPane root = new StackPane();

		root.getChildren().addAll(vbox);
		primaryStage.setScene(new Scene(root, 300, 300));
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}

}
