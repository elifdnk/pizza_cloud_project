package com.cydeo.repository;

import com.cydeo.model.Pizza;
import com.cydeo.model.PizzaOrder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class PizzaRepository {

    private static List<Pizza> pizzaList = new ArrayList<>();
   private static List<PizzaOrder>  pizzaOrderList = new ArrayList<>();

    public Pizza createPizza(Pizza pizzaToSave) {
        pizzaList.add(pizzaToSave);
        return pizzaToSave;
    }

    public List<Pizza> readAll() {
        return pizzaList;
    }

    public PizzaOrder savePizzaOrder(PizzaOrder pizzaOrder){

        pizzaOrderList.add(pizzaOrder);
        return pizzaOrder;
    }



}
