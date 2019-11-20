package be.ac.umons;

import java.util.ArrayList;
import java.math.BigDecimal;
public class Pizza implements PizzaComponent {

    private String name;
    private BigDecimal price = BigDecimal.valueOf(0);
    private ArrayList<Ingredient> listIngredients;

    public Pizza(String name){
        this.name= name;
    }

    public String getName(){

        return this.name;
    }
    public BigDecimal getPrice(){

        return this.price;
    }

    public void setName(String n){

        this.name= n;
    }

    public void setPrice(BigDecimal p){

        this.price= p;
    }
    public ArrayList<Ingredient> getListIngredient(){

        return this.listIngredients;
    }
    public void addIngredient(Ingredient i){

        this.listIngredients.add(i);
    }
    public String toString(){

       return  (this.price.toString() + this.name);
    }



}
