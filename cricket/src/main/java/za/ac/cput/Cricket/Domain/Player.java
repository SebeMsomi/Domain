package za.ac.cput.Cricket.Domain;

import javafx.util.Builder;

import java.util.Set;

public class Player {
    private String name;
    private int age;

    private Set<Cricket> crickets;

    private Player(){}

    private Player(Builder builder)
    {

        this.name = builder.name;
        this.age = builder.age;
    }

   public String getName(){
        return name;
   }
   public int getAge()
   {
       return age;
   }

   public static class Builder{
        private String name;
        private int age;
        private Set<Cricket> crickets;

        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder age(int age)
        {
            this.age = age;
            return this;
        }

   }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", crickets=" + crickets +
                '}';
    }
}
