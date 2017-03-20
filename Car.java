
public class Car {
    private String make,model;
    private int year;

    public void setMake(String m){ make = m;}
    public void setModel(String md){  model= md;}
    public void setYear(int y){ year = y;}
    public String getMake(){ return make;}
    public String getModel(){ return model;}
    public int getYear(){ return year; }

    public void Car(String make,String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void ToString(){
        System.out.print(make);
        System.out.print(model);
        System.out.print(year);
    }
}
