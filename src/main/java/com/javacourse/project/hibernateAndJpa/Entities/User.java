package com.javacourse.project.hibernateAndJpa.Entities;

import jakarta.persistence.*;


@Entity
@Table(name="users")
public class User {

		@Id
		@Column(name="id")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		
		public User() {
		}
		
		@Column(name="email")
		private String email;
		
		@Column(name="username")
		private String username;

		public User(int id, String email, String username) {
			super();
			this.id = id;
			this.email = email;
			this.username = username;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
}
