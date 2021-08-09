import javafx.application.Application;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ApplicationGUI extends Application
{
	private Stage aWindow;

	@Override
	public void start(Stage pWindow) throws Exception 
	{
		this.aWindow = new RPY2POWindow(pWindow.getStyle());
	}
}
