package appInterface;

import java.util.HashMap;
import java.util.Map;
import javax.swing.UnsupportedLookAndFeelException;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBase;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class AppInterface {
	protected Pane rootPane;
	protected ObservableList<Node> content;
	public ProfileForm profileForm;
	
	protected Map<String, Button> buttons;
	protected Map<String, MenuItem> menuItems;	

	public AppInterface( Stage window )  {
		profileForm = new ProfileForm();
		rootPane = createContentPane();
		content = rootPane.getChildren();		
		Scene scene = new Scene( rootPane, 800, 600 );		
		window.setScene( scene );

		// Create components maps
		buttons = new HashMap<String, Button>();
		menuItems = new HashMap<String, MenuItem>();
		
		// Create menu
		MenuBar mainMenu = createMainMenu();
		content.add(mainMenu);	 
		
		createMainButtons();
		
		// TODO Rewrite from using swing to using javafx
		// Initialize main components and set main settings
		/*setLookAndFeel();
		setSize( new Dimension( 800, 600 ) );
		setLocation( new Point( 100, 100 ) );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		// Create content pane
		content = createContainerPane();
		setContentPane( content );
		// Create components maps
		buttons = new HashMap<String, Button>();
		menuItems = new HashMap<String, MenuItem>();
		
		// Create menu
		MenuBar mainMenu = createMainMenu();
		setMenuBar( mainMenu );
		// Create main forms, buttons and other elements
		profileForm = new ProfileForm();	
		content.add(profileForm);
		createMainButtons();*/	
	}
	
	/**
	 * Create content pane
	 * @return Content pane
	 */
	protected Pane createContentPane() {
		Pane content = new FlowPane();
		return content;
	}	
	
	/**
	 * Create the main menu in app
	 * @return Main menu bar with menu items
	 */
	protected MenuBar createMainMenu() {
		
		MenuItem newProfile = new MenuItem( "Новый профиль" );
		menuItems.put( "newProfile", newProfile );		
		MenuItem getProfiles = new MenuItem( "Показать все" );
		menuItems.put( "getProfiles", getProfiles );

		Menu profile = new Menu( "Профили" );
		profile.getItems().addAll( getProfiles, newProfile );
		
		MenuBar mainMenuBar = new MenuBar();
		mainMenuBar.getMenus().add( profile );
		
		return mainMenuBar;
	}
	
	/**
	 * Create main button elements and put them to buttons map
	 */
	protected void createMainButtons() {
		Button newProfile = new Button( "Добавить человека" );
		buttons.put( "newProfile", newProfile );
		content.add( newProfile );
		
	}	
	
	/**
	 * Set look and feel
	 */
	protected static void setLookAndFeel() {		
		try {
			javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Assign the command and action listener to specified button name in buttons map.
	 * @param <T>
	 * @param buttonName Name of the button in buttons map.
	 * @param actionName Name of action command that assigned to the button
	 * @param listener Action listener which will be used for handle button action command
	 */
	public <T extends Event> void addButtonHandler ( String buttonName,  EventType<T> eventType, EventHandler<T> handler) {
		Button button = buttons.get( buttonName );
		if ( button != null ) addHandler( button, eventType, handler );
		
	}
	
	/**
	 * Assign the command and action listener to specified menu item name in menu items map.
	 * 
	 * @param menuName Name of the menu item in menu items map.
	 * @param actionName Name of action command that assigned to the menu item
	 * @param listener Action listener which will be used for handle menu item action command
	 */
	public <T extends Event> void addMenuItemHandler ( String menuItemName,  EventType<T> eventType, EventHandler<T> handler) {
		// TODO
		/*MenuItem menu = menuItems.get( menuItemName );
		if ( menu != null ) addAction( menu, eventType, handler );*/
	}
	
	/**
	 * Assign the command and action listener to specified component name in all of the component maps.
	 * 
	 * @param componentName Name of the component.
	 * @param actionName Name of action command that assigned to the component
	 * @param listener Action listener which will be used for handle component's action command
	 */
	public <T extends Event> void addHandler ( String componentName,  EventType<T> eventType, EventHandler<T> handler ) {
		addMenuItemHandler( componentName, eventType, handler );
		addButtonHandler( componentName, eventType, handler );
	}
	
	/**
	 * Add command and action listener to specified component in all component maps.
	 * @param component
	 * @param actionName Name of action command that assigned to the component
	 * @param listener Action listener which will be used for handle component's action command
	 */
	protected <T extends Event> void addHandler( ButtonBase control, EventType<T> eventType,  EventHandler<T> handler ) {
		control.addEventHandler(eventType, handler);
	}

}
