package css108.part4.B;

public class Cat extends Animal implements Pet{
    String name;

    public Cat(String name){
        super(4);
        this.name = name;
    }

    public Cat(){
        this("" );
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void walk(){
        System.out.printf("Cat %s walks\n",name);
    }
    @Override
    public void play(){
        if(name.equals("")) System.out.println("Cat with no name plays");
        else System.out.println("Cat " + name + " plays");
    }

    @Override
    public void eat() {
        System.out.println("Cat " + name + " eats");
    }
}
