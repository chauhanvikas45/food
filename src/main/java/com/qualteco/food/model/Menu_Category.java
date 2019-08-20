package com.qualteco.food.model;

import com.qualteco.food.constant.Category;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import java.util.Set;

import javax.persistence.*;

@TypeDef(
        name = "category_enum",
        typeClass = Category.class
)
@Entity
public class Menu_Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @Enumerated(EnumType.ORDINAL)
    @Type(type = "category_enum")
    private Category categoryName;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "menu_category")
    private Set<Food_Menu> food_menu;

    public Menu_Category() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(Category categoryName) {
        this.categoryName = categoryName;
    }

	public Set<Food_Menu> getFood_menu() {
		return food_menu;
	}

	public void setFood_menu(Set<Food_Menu> food_menu) {
		this.food_menu = food_menu;
	}
    
    
}
