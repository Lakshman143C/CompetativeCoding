package org.java.designpatterns.creational.builder;

public class Student {

    private int id;
    private String name;
    private int age;

    private Student(Builder builder){
        this.id=builder.id;
        this.name=builder.name;
        this.age=builder.age;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private int id;
        private String name;
        private int age;

        public Builder id(int id){
            this.id=id;
            return this;
        }

        public Builder name(String name){
            this.name=name;
            return this;
        }

        public Builder age(int age){
            this.age=age;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

    @Override
    public String toString(){
        return "Student [id="+id+", name="+name+", age="+age+"]";
    }

}
