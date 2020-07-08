package com.springboot.web.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity(name="feedback")
public class Todo {
	
	@Id  
    private int id;
    private String user;
    private String email, address;
    
    @Column(name = "feedback")
    @Size(min=10, message="Enter at least 10 Characters...")
    private String feed;

    private Date date;
    private boolean satisfied;

    public Todo() {
    		super();
    }
    
    public Todo(int id, String user, String feed, Date date,
            boolean satisfied, String email, String address) {
        super();
        this.id = id;
        this.user = user;
        this.feed = feed;
        this.date = date;
        this.satisfied = satisfied;
        this.email = email;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getFeed() {
        return feed;
    }

    public void setFeed(String feed) {
        this.feed= feed;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isSatisfied() {
        return satisfied;
    }

    public void setIssatisfied(boolean satisfied) {
        this.satisfied = satisfied;
    }
    
    

    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Todo other = (Todo) obj;
        if (id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format(
                "Todo [id=%s, user=%s, feed=%s, date=%s, satisfied=%s]", id,
                user, feed, date, satisfied);
    }

}