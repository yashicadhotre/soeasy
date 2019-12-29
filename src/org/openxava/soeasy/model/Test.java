package org.openxava.soeasy.model;

import javax.persistence.*;
import org.openxava.annotations.*;

@Entity
public class Test {
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Id @Column(length=11) @Required
    private int Id;
 
    @Column(length=40) @Required
    private String name;
 
   
 
}