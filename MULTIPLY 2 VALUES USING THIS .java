public class Food {

    int items,rate;
    Food(int items,int rate){
        this.items=items;
        this.rate=rate;

    }
    void displaydetails(){
        System.out.println(items * rate);
    }
}


