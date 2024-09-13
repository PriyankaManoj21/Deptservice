package com.test.deptservice;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dept")
public class Dept {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "dept")
	private String dept;
	@Column(name = "headOfdept")
	private String headOfdept;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHeadOfdept() {
		return headOfdept;
	}

	public void setHeadOfdept(String headOfdept) {
		this.headOfdept = headOfdept;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Dept [id=" + id + ", dept=" + dept + ", headOfdept=" + headOfdept + "]";
	}

}
