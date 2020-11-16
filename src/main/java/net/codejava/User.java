package net.codejava;

import java.util.Date;
import java.util.ArrayList;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import org.springframework.format.annotation.DateTimeFormat;

public class User {
	@Size(min = 3, max = 30)
	private String fullName;

	@NotEmpty
	private String sex;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Past
	@NotNull
	private Date dob;

	@NotEmpty
	private List<String> cls = new ArrayList<String>();

	@NotEmpty
	private List<String> division = new ArrayList<String>();

	public User(String string, int i, String string2, String string3, String string4) {
	}

	public User() {
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public List<String> getCls() {
		return cls;
	}

	public void setCls(List<String> cls) {
		this.cls = cls;
	}

	public List<String> getDivision() {
		return division;
	}

	public void setDivision(List<String> division) {
		this.division = division;
	}

	@Override
	public String toString() {
		return "User [fullName=" + fullName + ", sex=" + sex + ", dob=" + dob + ", cls=" + cls + ", division="
				+ division + "]";
	}

}