package application;
	
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			/*Set up our Pane we will have right and left*/
			BorderPane mainPane = new BorderPane();
			mainPane.setPrefHeight(500.0);
			mainPane.setPrefWidth(900.0);
			//This border pane will go in the left side of mainPane
			BorderPane leftPane = new BorderPane();
			
			//Home label
			Image homeImg = new Image(getClass().getResourceAsStream("home.png"));
			ImageView homeImgV = new ImageView(homeImg);
			homeImgV.setFitHeight(50.0);
			homeImgV.setFitWidth(50.0);
			Label homeLabel = new Label("HOME");
			homeLabel.setPrefWidth(200);
			homeLabel.setId("home");
			homeLabel.setGraphic(homeImgV);
			
			//Using labels as button we first set up the car label
			Image carImg = new Image(getClass().getResourceAsStream("sedan.png"));
			ImageView carImgV = new ImageView(carImg);
			carImgV.setFitHeight(50.0);
			carImgV.setFitWidth(50.0);
			Label carLabel = new Label("CAR");
			carLabel.setPrefWidth(200);
			carLabel.setId("car");
			carLabel.setGraphic(carImgV);
			carLabel.setOnMousePressed(new EventHandler<MouseEvent>() {
				CarTab car = new CarTab();
				@Override
				public void handle(MouseEvent event) {
		           mainPane.setCenter(car.getPane());
		        }
			});
		
			
			//truck label
			Image truckImg = new Image(getClass().getResourceAsStream("truck.png"));
			ImageView truckImgV = new ImageView(truckImg);
			truckImgV.setFitHeight(50.0);
			truckImgV.setFitWidth(50.0);
			Label truckLabel = new Label("TRUCK");
			truckLabel.setPrefWidth(200);
			truckLabel.setId("truck");
			truckLabel.setGraphic(truckImgV);
			truckLabel.setOnMousePressed(new EventHandler<MouseEvent>() {
				TruckTab truck = new TruckTab();
				@Override
				public void handle(MouseEvent event) {
		           mainPane.setCenter(truck.getPane());
		        }
			});
			
			//heavy equipment label
			Image heavyImg = new Image(getClass().getResourceAsStream("heavy.png"));
			ImageView heavyImgV = new ImageView(heavyImg);
			heavyImgV.setFitHeight(50.0);
			heavyImgV.setFitWidth(50.0);
			Label heavyLabel = new Label("HEAVY EQUIPMENT");
			heavyLabel.setPrefWidth(200);
			heavyLabel.setId("heavy");
			heavyLabel.setGraphic(heavyImgV);
			heavyLabel.setOnMousePressed(new EventHandler<MouseEvent>() {
				HeavyTab heavy = new HeavyTab();
				@Override
				public void handle(MouseEvent event) {
		           mainPane.setCenter(heavy.getPane());
		        }
			});
			
			//trailer label
			Image trailerImg = new Image(getClass().getResourceAsStream("trail.png"));
			ImageView trailerImgV = new ImageView(trailerImg);
			trailerImgV.setFitHeight(50.0);
			trailerImgV.setFitWidth(50.0);
			Label trailerLabel = new Label("TRAILER");
			trailerLabel.setPrefWidth(200);
			trailerLabel.setId("trailer");
			trailerLabel.setGraphic(trailerImgV);
			trailerLabel.setOnMousePressed(new EventHandler<MouseEvent>() {
				TrailerTab trailer = new TrailerTab();
				@Override
				public void handle(MouseEvent event) {
		           mainPane.setCenter(trailer.getPane());
		        }
			});
			
			//Race Bike Label
			Image raceImg = new Image(getClass().getResourceAsStream("ninja.png"));
			ImageView raceImgV = new ImageView(raceImg);
			raceImgV.setFitHeight(50.0);
			raceImgV.setFitWidth(50.0);
			Label raceLabel = new Label("RACE BIKE");
			raceLabel.setPrefWidth(200);
			raceLabel.setId("race");
			raceLabel.setGraphic(raceImgV);
			raceLabel.setOnMousePressed(new EventHandler<MouseEvent>() {
				RaceTab race = new RaceTab();
				@Override
				public void handle(MouseEvent event) {
		           mainPane.setCenter(race.getPane());
		        }
			});
			
			//Tricycle label
			Image triImg = new Image(getClass().getResourceAsStream("tri.png"));
			ImageView tricImgV = new ImageView(triImg);
			tricImgV.setFitHeight(50.0);
			tricImgV.setFitWidth(50.0);
			Label tricycleLabel = new Label("TRICYCLE");
			tricycleLabel.setPrefWidth(200);
			tricycleLabel.setId("tri");
			tricycleLabel.setGraphic(tricImgV);
			tricycleLabel.setOnMousePressed(new EventHandler<MouseEvent>() {
				TriTab tri = new TriTab();
				@Override
				public void handle(MouseEvent event) {
		           mainPane.setCenter(tri.getPane());
		        }
			});
			
			//Pedal Label
			Image pedalImg = new Image(getClass().getResourceAsStream("bike.png"));
			ImageView pedalImgV = new ImageView(pedalImg);
			pedalImgV.setFitHeight(50.0);
			pedalImgV.setFitWidth(50.0);
			Label pedalLabel = new Label("PEDAL BIKE");
			pedalLabel.setPrefWidth(200);
			pedalLabel.setId("pedal");
			pedalLabel.setGraphic(pedalImgV);
			pedalLabel.setOnMousePressed(new EventHandler<MouseEvent>() {
				PedalTab pedal = new PedalTab();
				@Override
				public void handle(MouseEvent event) {
		           mainPane.setCenter(pedal.getPane());
		        }
			});
			
			//Other Label
			Image otherImg = new Image(getClass().getResourceAsStream("other.png"));
			ImageView otherImgV = new ImageView(otherImg);
			otherImgV.setFitHeight(50.0);
			otherImgV.setFitWidth(50.0);
			Label otherLabel = new Label("OTHER");
			otherLabel.setPrefWidth(200);
			otherLabel.setId("other");
			otherLabel.setGraphic(otherImgV);
			
			//Separator and divider
			Separator separate = new Separator();
			separate.setOrientation(Orientation.HORIZONTAL);
			Separator separate2 = new Separator();
			separate2.setOrientation(Orientation.HORIZONTAL);
			Separator separate3 = new Separator();
			separate3.setOrientation(Orientation.HORIZONTAL);
			Separator sep = new Separator(); // Divider
			sep.setOrientation(Orientation.VERTICAL);
			sep.setId("sep");
		
		
			
			//This vBox lists our labels above in vertical form
			VBox vBox = new VBox();
			
			vBox.setSpacing(10.0);// set spacing between elements of vbox
			/*Get the observable list of the vbox and then all all our labels*/
			ObservableList  list = vBox.getChildren();
			list.addAll(homeLabel, carLabel, truckLabel, separate,  heavyLabel, trailerLabel, separate2, raceLabel, tricycleLabel, pedalLabel, separate3, otherLabel);
			
			//We place our vbox in the center of the leftPane BorderPane  and the Divider in the right side
			leftPane.setRight(sep);
			leftPane.setCenter(vBox);
			// Now set the leftPane in the left side of the mainPane BorderPane
			mainPane.setLeft(leftPane);
		
			
			BorderPane.setMargin(vBox, new Insets(20, 20, 20, 20));//Add some spacing to the margin and the vbox
			//set the pane as our scene
			Scene scene = new Scene(mainPane);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Our Awesome Parking Lot");
			primaryStage.setScene(scene);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
