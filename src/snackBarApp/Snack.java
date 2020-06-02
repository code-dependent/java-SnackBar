package snackBarApp;

public class Snack{
    private static int maxId = 0;

    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int machineId;

    //Constuctor Method
    public Snack(String name, int quantity, double cost, int machineId){
    	maxId++;
    	id = maxId;
    	this.name = name;
    	this.quantity = quantity;
    	this.cost = cost;
    	this.machineId = machineId;
    }

    //getter mathods & Setter Methods
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getCost(){
        return cost;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    public int getMachineId(){
        return machineId;
    }
    public void setMachineId(int machineId){
        this.machineId = machineId;
    }
    public int getQuantity(){
        return quantity;
    }

    //Other Methods
    public void purchase(int amount){
        this.quantity = this.quantity - amount;
    }
    public double total(int quantity){
        return this.cost * quantity;
    }
    




}