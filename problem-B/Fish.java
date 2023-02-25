package css108.part4.B;

public class Fish extends Animal implements Pet {
    String name;

    public Fish(){
        super(0);
        name = "";
    }

    @Override
    public void walk() {
        System.out.println("Fish can't walk");
    }

    @Override
    public void play(){
        System.out.println("Fish plays");
    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat(){
        if(name.equals("")) System.out.println("Fish with no name eats");
        else System.out.printf("Fish %s eats\n", name);
    }
}
