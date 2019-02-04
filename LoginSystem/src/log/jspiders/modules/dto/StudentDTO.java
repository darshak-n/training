package log.jspiders.modules.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="studentable")
public class StudentDTO {
    @Id
    @GenericGenerator(name="myid", strategy="increment")
    @GeneratedValue(generator="myid")
	@Column(name="id")
	private int id;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="phone")
    private String phone;
    @Column(name="password")
    private String password;
    
    
    public StudentDTO()
    {
    	System.out.println(this.getClass().getSimpleName()+" object created");
        System.out.println("purely for testing purposes");
        System.out.println("for the second commit on the new branch");
    }
    
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "StudentInformation [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", password=" + password + "]";
	}
    
}
