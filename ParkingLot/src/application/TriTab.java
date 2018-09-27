package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class TriTab {

	private final GridPane rootPane;
	final ToggleGroup washTog = new ToggleGroup();
	final ToggleGroup chargeTog = new ToggleGroup();	
	public TriTab() {
		rootPane = new GridPane();
		rootPane.setAlignment(Pos.CENTER);
		
		
		Text type = new Text("Vehicle Type:");
		TextField carField = new TextField();
		carField.setText("THREE WHEELER");
		carField.setDisable(true);
		
		Text owener = new Text("Customer Name");
		TextField custField = new TextField();
		
		Text lsNum = new Text("License Number");
		TextField numField = new TextField();
		
		
		
		Text charge = new Text("Needs Charging?");
		HBox chargeBox = new HBox();
		RadioButton yes = new RadioButton();
		yes.setText("YES");
		yes.setToggleGroup(chargeTog);
		RadioButton no = new RadioButton();
		no.setText("NO");
		no.setToggleGroup(chargeTog);
		
		ObservableList<Node> list = chargeBox.getChildren();
		list.addAll(yes, no);
		
		Text wash = new Text("Need Washing?");
		HBox washBox = new HBox();
		RadioButton yesWash = new RadioButton();
		yesWash.setText("YES");
		yesWash.setToggleGroup(washTog);
		RadioButton noWash = new RadioButton();
		noWash.setText("NO");
		noWash.setToggleGroup(washTog);
		
		ObservableList<Node> washList = washBox.getChildren();
		washList.addAll(yesWash, noWash);
		
		ObservableList<String> concierge = FXCollections.observableArrayList(
				"WANTS",
				"Does Not Want"
				);
		
		ComboBox combo = new ComboBox(concierge);
		
	
		Text height = new Text("Height");
		TextField heightField = new TextField();
		
		Text helpPark = new Text("Concierge");
		
		Text weight = new Text("Weight");
		TextField weightField = new TextField();
		
		Text arrivalDate = new Text("Arrival Date");
		TextField arrivalDateField = new TextField();
		
		Text depDate = new Text("Departure Date");
		TextField depDateField = new TextField();
		
		Button save = new Button();
		save.setText("SAVE");
		
		rootPane.setPadding(new Insets(10, 10, 10, 10));
		rootPane.setHgap(30.0);
		rootPane.setVgap(30.0);
		
		
		
		rootPane.add(type, 0, 0);
		rootPane.add(carField, 1, 0);
		rootPane.add(owener, 2, 0);
		rootPane.add(custField, 3, 0);
		rootPane.add(lsNum, 0, 1);
		rootPane.add(numField, 1, 1);
		rootPane.add(height, 2, 1);
		rootPane.add(heightField, 3, 1);
		rootPane.add(weight, 0, 2);
		rootPane.add(weightField, 1, 2);
		rootPane.add(helpPark, 2, 2);
		rootPane.add(combo, 3, 2);
		rootPane.add(charge, 0, 3);
		rootPane.add(chargeBox, 1, 3);
		rootPane.add(wash, 2, 3);
		rootPane.add(washBox, 3, 3);
		rootPane.add(arrivalDate, 0, 4);
		rootPane.add(arrivalDateField, 1, 4);
		rootPane.add(depDate, 2, 4);
		rootPane.add(depDateField, 3, 4);
		rootPane.add(save, 2, 3, 6, 7);
		
	}
	
	
	
	public Pane getPane() {
		return rootPane;
	}
}
