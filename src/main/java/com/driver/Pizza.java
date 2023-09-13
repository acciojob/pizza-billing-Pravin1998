package com.driver;

public class Pizza {

    private int price=0;
    private boolean isVeg;
    private String bill="";

    private boolean isCheeseAddedOnce = false;
    private boolean isToppingsAddedOnce = false;
    private boolean isTakeAwayAdded = false;

    private int vegPizzaBasePrice = 300;
    private int NonVegPizzaBasePrice = 400;
    private int extraCheesePrice =  80;
    private int extraToppingsVegPrice = 70;
    private int extraToppingsNonVegPrice = 120;
    private int TakeAwayPrice = 20;
    public Pizza(boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here

        if(isVeg == true){
            price += vegPizzaBasePrice;
            bill = bill + "Base Price Of The Pizza: " +vegPizzaBasePrice + "\n";
        }else{
            price +=NonVegPizzaBasePrice;
            bill = bill + "Base Price Of The Pizza: "+NonVegPizzaBasePrice +"\n";
        }


    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAddedOnce == false){
            price = price + extraCheesePrice;

             isCheeseAddedOnce = true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
    if(isToppingsAddedOnce == false){
        if(isVeg == true){
            this.price += extraToppingsVegPrice;
        }else{
            this.price += extraToppingsNonVegPrice;
        }
        isToppingsAddedOnce = true;
    }
    }

    public void addTakeaway(){
            // your code goes here
    isTakeAwayAdded =  true;
    this.price += TakeAwayPrice;

    }

    public String getBill(){
            if(isCheeseAddedOnce == true){
                this.bill = this.bill + "Extra Cheese Added: "+extraCheesePrice +"\n";
            }
            if(isToppingsAddedOnce) {
                if (isVeg == true) {
                    this.bill = this.bill + "Extra Toppings Added: " + extraToppingsVegPrice + "\n";
                } else {
                    this.bill = this.bill + "Extra Toppings Added: " + extraToppingsNonVegPrice + "\n";
                }
            }


            if(isTakeAwayAdded){
                this.bill = this.bill + "Paperbag Added: " +TakeAwayPrice+"\n";
            }
            this.bill = this.bill + "Total Price: " + this.price+"\n";
        // your code goes here
        return this.bill;
    }
}
