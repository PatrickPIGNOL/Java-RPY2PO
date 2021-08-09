import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class RPY2POWindow extends Stage
{
	private Group aRoot;
	
	private VBox aMainVBox;
	
	private HBox aRenpyLabelHBox;
	private HBox aRenpyFilesHBox;
	private TextField aRenpyFilesField;
	private Label aRenpyFiles;

	private Button aRenpyBrowse;
	
	private HBox aPOFilesLabelHBox;
	private Label aPOFiles;
	
	private HBox aPOHBox;
	private TextField aPOFilesField;
	private Button aPOBrowse;
	
	public RPY2POWindow(StageStyle pStyle) 
	{
		super(pStyle);
		this.setTitle("Renpy to POEdit Codex");
		this.aRoot = new Group();
		this.aMainVBox = new VBox();
		this.aRoot.getChildren().add(this.aMainVBox);

		this.aRenpyLabelHBox = new HBox();
		this.aRenpyFiles = new Label("Renpy Files :");
		HBox.setMargin(this.aRenpyFiles, new Insets(10, 10, 0, 10));
		HBox.setHgrow(this.aRenpyFiles, Priority.ALWAYS);
		this.aRenpyLabelHBox.getChildren().add(this.aRenpyFiles);
		
		this.aRenpyFilesHBox = new HBox(10);
		this.aRenpyFilesField = new TextField();
		this.aRenpyFilesField.setPromptText("Browse to select");
		HBox.setHgrow(this.aRenpyFilesField, Priority.ALWAYS);
		this.aRenpyBrowse = new Button("Browse");
		HBox.setHgrow(this.aRenpyBrowse, Priority.NEVER);
		this.aRenpyFilesHBox.getChildren().addAll(this.aRenpyFilesField, this.aRenpyBrowse);
		
		this.aPOFilesLabelHBox = new HBox();
		this.aPOFiles = new Label();
		HBox.setMargin(this.aPOFiles, new Insets(10, 10, 0, 10));
		
		this.aMainVBox.getChildren().addAll(this.aRenpyLabelHBox, this.aRenpyFilesHBox);
	}
	
}
