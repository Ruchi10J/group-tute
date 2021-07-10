public class Player {
     String name;
     int age;
     String type;
     int statistics;


    public Player(String name, int age, String type, int statistics) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.statistics = statistics;

    }
    public void playerDetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(statistics);
        System.out.println(type);
    }


}

