package ovh.pignol.JavaFX;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ApplicationGUI extends Application
{
	private Stage aWindow;

	@Override
	public void start(Stage pWindow) throws Exception 
	{
		this.aWindow = pWindow;
		this.aWindow.setTitle("JavaFX - Test");
		
		this.aWindow.show();
	}
}
