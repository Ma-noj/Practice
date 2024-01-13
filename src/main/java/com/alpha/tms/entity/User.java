package com.alpha.tms.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.alpha.tms.enums.Role;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "userInfo")
@Getter
@Setter
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String userName;
	private String userEmail;
	private String userPassword;
	private Role role;
	@OneToMany
	private List<Task> tasks;
}
