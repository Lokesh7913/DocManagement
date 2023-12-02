package model;

public class Doctor {
	
	private String fullName;
	private String id;
	private String emailID;
	private String designation;
	private String qualification;
	private String workLocation;
	private long contactNumber;
	
	//getter() & setter() for instance variable name
	public  String getname() {
		return this.fullName;
	}
	public void setname(String fullName) {
		this.fullName = fullName;	
	}
	
	//getter() & setter() for instance variable id
	public String getid() {
		return this.id;
	}
	public void setid(String id) {
		this.id = id;
	}
	
	//getter() & setter() for instance variable emailID
	public String getemailID() {
		return this.emailID;
	}
	public void setemailID(String emailID) {
		this.emailID = emailID;
	}
	
	//getter() & setter() for instance variable designation
	public String getdesignation() {
		return this.designation;
	}
	public void setdesignation(String designation) {
		this.designation = designation;
	}
	
	//getter() & setter() for instance variable qualification
	public String getqualification() {
		return this.qualification;
	}
	public void setqualification(String qualification) {
		this.qualification = qualification;
	}
	
	//getter() & setter() for instance variable workLocation
	public String getworkLocation() {
		return this.workLocation;
	}
	public void setworkLocation(String workLocation) {
		this.workLocation = workLocation;
	}
	
	//getter() & setter() for instance variable contactNumber 
	public long getcontactNuumber() {
		return this.contactNumber;
	}
	public void setcontactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Doctor [fullName=" + fullName + ", id=" + id + ", emailID=" + emailID + ", designation=" + designation
				+ ", qualification=" + qualification + ", workLocation=" + workLocation + ", contactNumber="
				+ contactNumber + "]";
	}

	
	
}
