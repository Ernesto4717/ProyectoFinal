package com.softtek.academy.end.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

@Entity
@Table(name = "user")
@NamedNativeQueries({	
	@NamedNativeQuery(
			name="findOneUser",
				query="SELECT u.username as username, "
						+ "u.password as password,"
						+ "u.name as name, "
						+ "u.active as active " 
						+ " FROM user u "
				+ " WHERE u.username = :username",
				resultSetMapping = "UserMapping"),
	
	@NamedNativeQuery(
			name="findUserByName",
				query="SELECT u.username as username, "
						+ "u.password as password,"
						+ "u.name as name, "
						+ "u.active as active " 
						+ " FROM user u "
				+ " WHERE u.username = :username",
				resultSetMapping = "UserMapping"),
	
	@NamedNativeQuery(
			name="update",
				query="UPDATE user u , "
						+ "SET "
						+ "u.password = :password,"
						+ "u.name= :name,"
						+ "u.active= :active,"
				
				+ " WHERE u.username= :oldusername",
				resultSetMapping = "updateResult")
	})
@SqlResultSetMappings({
	@SqlResultSetMapping(name="UsersMapping",
			classes= {
					@ConstructorResult(
							targetClass = User.class,
							columns = {
								@ColumnResult(name = "username", type = String.class),
								@ColumnResult(name = "password", type = String.class),
								@ColumnResult(name = "name", type = String.class),
								@ColumnResult(name = "active", type = String.class)
							})
			}),
	@SqlResultSetMapping(name="UserMapping",
	classes= {
			@ConstructorResult(
					targetClass = User.class,
					columns = {
						@ColumnResult(name = "username", type = String.class),
						@ColumnResult(name = "password", type = String.class),
						@ColumnResult(name = "name", type = String.class),
						@ColumnResult(name = "active", type = String.class)
					})
	}),
	@SqlResultSetMapping(name="updateResult", columns = { @ColumnResult(name = "count")})
})

public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "username")
	private String username;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "active")
	private String status;
	
	@Column(name = "password")
	private String password;	
	
	public User() {
		super();
	}

	public User(final String username, final String password, final String name, final String status) {
		super();
		this.username = username;
		this.name = name;
		this.status = status;
		this.password = password;	
	}

	public String getUsername() {
		return username;
	}
	
	
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setUsername(String userName) {
		this.username = userName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "User [userName=" + username + ", name=" + name + ", status=" + status + "]";
	}
	
}
