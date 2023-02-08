package com.sparta;

public class TShirt {
    Size size;
    Colour colour;

    public TShirt(Colour colour, Size size) {
        this.colour = colour;
        this.size = size;
    }

    @Override
    public String toString() {
        return "TShirt " +
                "size is" + size +
                " and colour is " + colour;
    }

    public static void main(String[] args) {
        //What size and colour would you like?
        TShirt tshirt = new TShirt(Colour.GREEN,Size.LARGE);
        System.out.println(tshirt.toString());
    }
}


