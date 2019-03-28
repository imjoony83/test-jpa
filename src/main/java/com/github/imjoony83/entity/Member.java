package com.github.imjoony83.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member implements Serializable {
	
	private static final long serialVersionUID = 1947258664541429693L;
	
	@Builder
	public Member(String id, String name, Date regdate) {
		this.id = id;
		this.name = name;
		this.regdate = regdate;
	}
	
	@Id
	@GeneratedValue
	int seq;
	
	@Column(unique=true)
	String id;
	String name;
	
	Date regdate;
}
