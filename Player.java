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
   public  void getPlayerDetails(){
        System.out.println(name+" "+age+" "+type+" "+statistics);

    }


}

