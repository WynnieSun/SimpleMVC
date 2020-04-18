
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import models.MainModel;
import views.MainController;

public class Main extends Application 
{

	@Override
	public void start(Stage stage) throws Exception
	{
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("views/MainView.fxml"));
		
		BorderPane view = loader.load();
		
		MainController cont = loader.getController();
		MainModel model = new MainModel();
		cont.setModel(model);
		
		Scene scene = new Scene(view);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String [] args)
	{
		launch(args);
	}

}
