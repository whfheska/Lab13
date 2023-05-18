public class Tester {
    private String name="noname";
    private String surname="noname";
    private int expYears=3;
    private String englishLevel="B1";
    private int salary=12;

    public Tester(String name, String surname, int expYears) {
        this.surname = surname;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester(String name) {
        this("Akmed","A3", 123);
        this.name = name;
    }

    public Tester(int expYears) {
        this("Ameer");
        this.expYears=expYears;
    }
    public static void soutNamr(){
        System.out.println();
    }

    public void outPut(int id){
        System.out.println(id+": "+name+" "+surname+" "+expYears+" "+englishLevel+" "+salary);
    }
    public void outPut(){
        System.out.println(name+" "+surname+" "+expYears+" "+englishLevel+" "+salary);
    }

    public void outPut(String title){
        System.out.println(title);
        System.out.println(name+" "+surname+" "+expYears+" "+englishLevel+" "+salary);
    }
}
