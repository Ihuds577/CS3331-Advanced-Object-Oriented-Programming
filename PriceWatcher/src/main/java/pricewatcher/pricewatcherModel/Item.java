package pricewatcher.pricewatcherModel;

import java.util.Date;
public class Item{
    public String title;
    public double currentPrice, startPrice;
    public Date dateAdded;
    public String url;

    /*
    public void Item(String title, double startPrice){
        this.title = title;
        this.startPrice = startPrice;
        this.dateAdded = new Date();
    }
    */

    public Item(String title, double startPrice, String url){
        this.title = title;
        this.startPrice = startPrice;
        this.url = url;
        this.dateAdded = new Date();
        this.currentPrice = startPrice;
    }

    public String getTitle(){
        return this.title;
    }

    public double getcurrentPrice(){
        return this.currentPrice;
    }

    public double getstartPrice(){
        return this.startPrice;
    }

    public String getURL(){
        return this.url;
    }

    public Date getDateAdded(){
        return this.dateAdded;
    }

    public void updatePrice(double newPrice){
        this.currentPrice = newPrice;
    }

}