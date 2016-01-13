/**
 * Creating profiles for peoples.
 * Main app class. 
 */
import appInterface.AppInterface;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

/**
 * @author Amarted@DemnArctis
 */
public class MassProfile extends Application {

	private AppInterface AppInterface;

	@Override
	public void start(Stage window) throws Exception {
		// TODO Finish him
		AppInterface = new AppInterface( window );
		
		AppInterface.addHandler("newProfile", ActionEvent.ACTION, showProfileForm);
		window.setTitle( "Mass Profile" );
		window.show();		
	}
	
	public static void main(String[] args) {
    	launch(args);
	}
	
	protected EventHandler<ActionEvent> showProfileForm = new EventHandler<ActionEvent>() {
		public void handle(ActionEvent event) {
			System.out.println("test");
			if ( ! AppInterface.profileForm.isVisible() ) {
				AppInterface.profileForm.setVisible( true );		
			}
	    }
	};
	
}
