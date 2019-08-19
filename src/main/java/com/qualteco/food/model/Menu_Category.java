package com.qualteco.food.model;

import com.qualteco.food.constant.Category;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

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

    @OneToOne(mappedBy = "menu_category")
    private Food_Menu food_menu;

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
}
