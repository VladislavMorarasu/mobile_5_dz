package org.homework.mobile.app.model_user;

public  class User <T, A>  {

    private T id;
    private A age;
    private String name;
    private String city;

    private User () {
    }
    // конструктор с параметрами
    public User(T id, A age) {
        this.id = id;
        this.age = age;
    }
    // геттеры и сеттеры с параметрами
    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public A getAge() {
        return age;
    }

    public void setAge(A age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Information about user:" +
                " name='" + name + '\'' +
                ", city='" + city + '\'' +
                '.';
    }
    // работа с builder для user
    public static class Builder {
        protected String name;
        protected String city;
        private User newUser;


        public Builder() {
            newUser = new User();
        }

        public Builder withName(String name) {
            newUser.name = name;
            return this;
        }

        public Builder withCity(String city) {
            newUser.city = city;
            return this;
        }
        public User build () {
            return newUser;
        }


    }
}


