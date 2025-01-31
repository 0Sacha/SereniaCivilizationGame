public class Human extends LivingEntity {

    // Attributes

    protected String name;
    protected String profession;
    protected String skills;
    protected String achievement;
    protected int strong;
    protected int brain;
    protected int age;


    //Constructor

    public Human(String name, String profession, String skills, String achievement, int strong, int brain, int age) {
        this.name = "Humain";
        this.profession = "Civil";
        this.skills = "Aucun";
        this.achievement = "Aucun";
        this.strong = 0;
        this.brain = 0;
        this.age = 20;
    }

    //public HumanSpe(String name, String profession, String skills, String achievement, int strong, int brain, int age) {
    //    this.name = "Humain";
    //    this.profession = "Civil";
    //    this.skills = "Aucun";
    //    this.achievement = "Aucun";
    //    this.strong = strong;
    //    this.brain = brain;
    //    this.age = 20;
    //}


    //Methods prochaine version
//    public void work(String achievement) {
//
//    }

    //Getters & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public int getStrong() {
        return strong;
    }

    public void setStrong(int strong) {
        strong = strong;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
