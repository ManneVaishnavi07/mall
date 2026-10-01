package com.tnsif.mall.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Mall {
    @Id
    private int id;

    private String mallName;
    private String location;
    private String categories;
    private Long mallAdminId;
    private Long shopsId;
    
 // Default constructor - required by JPA
    public Mall() {
    }

    public Mall(int id, String mallName, String location, String categories, Long mallAdminId, Long shopsId) {
		super();
		this.id = id;
		this.mallName = mallName;
		this.location = location;
		this.categories = categories;
		this.mallAdminId = mallAdminId;
		this.shopsId = shopsId;
	}

	// Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public Long getMallAdminId() {
        return mallAdminId;
    }

    public void setMallAdminId(Long mallAdminId) {
        this.mallAdminId = mallAdminId;
    }

    public Long getShopsId() {
        return shopsId;
    }

    public void setShopsId(Long shopsId) {
        this.shopsId = shopsId;
    }
}