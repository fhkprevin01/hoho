class student{
    private String name;
    private String uniform;
    private String shoes;
    private String height;
    private String pan;
    
    public student(){
        System.out.println("object");
    }

    public void setstudent(String name,String uniform,String shoes,String pahat,String pan ){
        this.name = name;
        this.uniform = uniform;
        this.shoes = shoes;
        this.height = height;
        this.pan = pan;
    }
    public void getstudent(){
        System.out.println(name);
        System.out.println(uniform);
        System.out.println(shoes);
        System.out.println(height);
        System.out.println(pan);
    }
}