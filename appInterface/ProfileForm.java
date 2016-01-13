package appInterface;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.beans.PropertyVetoException;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

public class ProfileForm extends JInternalFrame {
	
	ProfileForm() {

		super( "Новый профиль", true, true, true, true );
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(25, 25, 25, 25));
		
		// TODO rewrite using javafx
		setSize( new Dimension( 640, 480 ) );
		setLocation( new Point( 80, 10 ) );
		setLayout( new FlowLayout()	);
		setDefaultCloseOperation(HIDE_ON_CLOSE);
		// TODO Finish him
		add(new JLabel("Имя"));
		add(new JTextField(20));
		add(new JLabel("Фамилия"));
		add(new JTextField(20));
	}
	
	public void clear() {
		// TODO Finish him. Clear all inputs. And reset all states.
	}

}
