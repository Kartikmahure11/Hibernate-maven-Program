package kartik.in.Hiber_Day005.model;

 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="kb68")

public class Student {
	@Id
	@Column(name="id") 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int sid;
	@Column(name="name") 
	private String sname;
	@Column(name="address")
	private String saddres;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddres() {
		return saddres;
	}
	public void setSaddres(String saddres) {
		this.saddres = saddres;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", saddres=" + saddres + "]";
	}
	public Student(int sid, String sname, String saddres) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddres = saddres;
	}
	public Student(String sname, String saddres) {
		super();

		this.sname = sname;
		this.saddres = saddres;
	}
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
