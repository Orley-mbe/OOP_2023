public class Human {
    private static int global_id;
    private int id;
    private String name;
    private int Gender;
    private Date Birthday;
    private Human mother;
    private Human father;
    List<Human> children;

    public Human(String name, Date Birthday, int Gender) {
        this.name = name;
        this.Birthday = Birthday;
        this.Gender = Gender;
        id = global_id++;
    }

    public Date Birthday() {
        return Birthday;
    }

    public String getName() {
        return name;
    }

    public int getGender() {
        if(Human.gender = = 0){
        return "male";}
        else {return 'female';}
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", year_of_birth: " + year_of_birth + ", gender:"+ Gender;
    }
}
