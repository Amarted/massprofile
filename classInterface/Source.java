package classInterface;

import java.util.List;
import core.Profile;

/**
 * Interface to work with data source
 * @author Amarted@DemnArctis
 */
public interface Source {
	/**
	 * Find profile by id
	 * @param id Profile id
	 * @return Profile with specified id
	 */
	public Profile findProfile( int id );
	/**
	 * Get list of all profiles
	 * @return List of all profiles
	 */
	public List< Profile > findAllProfiles();
	/**
	 * Saves profile data
	 * @param profile The profile to saving
	 * @return Operation success
	 */
	public boolean saveProfile( Profile profile );
}
