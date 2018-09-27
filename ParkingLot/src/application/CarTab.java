package application;


import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class CarTab {
	private final GridPane rootPane;
	
	public CarTab() {
		rootPane = new GridPane();
		
		Text name = new Text("Type");
		rootPane.add(name, 0, 0);
		
	}
	
	
	
	public Pane getPane() {
		return rootPane;
	}

}
