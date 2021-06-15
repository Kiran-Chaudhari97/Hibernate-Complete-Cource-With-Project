package Demo.com.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="My_table") //Table name which Table you have save the data this table name
public class Data {
	@Id
       private int aid;
       private String aname;
      // @Column(name="My_Color")
       private String acolour;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAcolour() {
		return acolour;
	}
	public void setAcolour(String acolour) {
		this.acolour = acolour;
	}
	@Override
	public String toString() {
		return "Data [aid=" + aid + ", aname=" + aname + ", acolour=" + acolour + "]";
	}     
	
	
}
