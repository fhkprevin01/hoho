class laptop{
    private String size;
    private String colour;
    private String ram;
    private String weight;
    private String brand;

    public laptop(){
        System.out.println("object");
    }

    public void setlaptop(String size, String colour, String ram, String weight, String brand){
        this.size = size;
        this.colour = colour;
        this.ram = ram;
        this.weight = weight;
        this.brand = brand; 
    }
    public void getlaptop(){
        System.out.println(size);
        System.out.println(colour);
        System.out.println(ram);
        System.out.println(weight);
        System.out.println(brand);
    }
}