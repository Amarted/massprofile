package core;

import classInterface.Source;
import java.util.ArrayList;
import java.util.List;
/**
 * Implements data source using simple files and singleton patter.
 * @author Anarted@DemnArctis
 *
 */
public class FileSource implements Source {
	
	// Implement singleton
	
	private static Source instance = new FileSource();	
	/** 
	 * Deny creating source instances 
	 **/
	private FileSource() {}
	/** 
	 * Use this method to get singleton source instanse 
	 **/
	public static Source getInstance() {
		return instance;
	}
	
	
	/**
	 * {@inheritDoc}
	 */
	public Profile findProfile( int id) {
		Profile profile = new Profile();
		// TODO Get profile
		return profile;
	}
	/**
	 * {@inheritDoc}
	 */
	public List< Profile > findAllProfiles() {
		List< Profile > list = new ArrayList< Profile >();
		// TODO Finish him. Read all files 
		return list;
	}
	/**
	 * {@inheritDoc}
	 */
	public boolean saveProfile( Profile profile ) {
		boolean success = false;
		// TODO finish him. Save serialized object in file in profiles folder
		return success;
	}
}
