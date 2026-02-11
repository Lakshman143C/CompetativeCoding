package org.java.designpatterns.creational.builder;

public class User {
    private String name;
    private int age;
    private String email;
    private String phone;
    private String address;

    public User(builder builder) {
        this.name=builder.name;
        this.age=builder.age;
        this.email=builder.email;
        this.phone=builder.phone;
        this.address=builder.address;
    }

    public static class builder{
        private String name;
        private int age;
        private String email;
        private String phone;
        private String address;

        public builder name(String name){
            this.name=name;
            return this;
        }

        public builder age(int age){
            this.age=age;
            return this;
        }

        public builder email(String email){
            this.email=email;
            return this;
        }

        public builder phone(String phone){
            this.phone=phone;
            return this;
        }

        public builder address(String address){
            this.address=address;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    public static void main(String[] args) {
        User user=new builder()
                .name("laxman")
                .age(24)
                .email("sample@email")
                .phone("0923480333")
                .address("street1/city/pin2343/In")
                .build();

        System.out.println(user);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
