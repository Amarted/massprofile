package core;

public class Skill {
	private String name;
	private Double yearExperience;
	private String info;
	
	// Getter and setters
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 * @throws Exception 
	 */
	public void setName( String name ) throws Exception {
		if ( name.isEmpty() ) {
			throw new Exception("Name is required");
		}
		this.name = name;
	}
	/**
	 * @return the yearExperience
	 */
	public Double getYearExperience() {
		return yearExperience;
	}
	/**
	 * @param yearExperience the yearExperience to set
	 */
	public void setYearExperience( Double yearExperience ) {
		this.yearExperience = yearExperience;
	}
	/**
	 * @return the info
	 */
	public String getInfo() {
		return info;
	}
	/**
	 * @param info the info to set
	 */
	public void setInfo( String info ) {
		this.info = info;
	}
	
	
}
