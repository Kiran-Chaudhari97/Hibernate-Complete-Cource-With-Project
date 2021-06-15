package Demo.com.Hib_Demo2;

import javax.persistence.Embeddable;

@Embeddable

/*
 * The @Embedded annotation is used to specify the Address entity should be
 * stored in the STUDENT table as a component. @Embeddable annotation is used to
 * specify the Address class will be used as a component. The Address class
 * cannot have a primary key of its own, it uses the enclosing class primary
 * key.
 */

public class DataName {

	private String fname;
	private String lname;
	private String mname;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	@Override
	public String toString() {
		return "DataName [fname=" + fname + ", lname=" + lname + ", mname=" + mname + "]";
	}
	
	
}
