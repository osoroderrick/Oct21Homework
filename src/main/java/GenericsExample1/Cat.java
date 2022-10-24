package GenericsExample1;

public class Cat extends Animal{
    private String litterPreference;

    public Cat(String name){
        this.name = name;
    }

    public Cat(){

    }

    public String getLitterPreference() {
        return litterPreference;
    }

    public void setLitterPreference(String litterPreference) {
        this.litterPreference = litterPreference;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
