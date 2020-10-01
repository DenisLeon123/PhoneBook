public class Student {
    private String name;
    private String lastName;
    private int age;
    private int numberGroup;
    private int countEndTask;
    private int countEndModules;
    private int experience;
    private String purposeOfTraining;

    public Student(String name, String lastName, int age,
                   int numberGroup, int countEndTask,
                   int countEndModules, int experience, String purposeOfTraining) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.numberGroup = numberGroup;
        this.countEndTask = countEndTask;
        this.countEndModules = countEndModules;
        this.experience = experience;
        this.purposeOfTraining = purposeOfTraining;
    }

    public Student(String name, String lastName, int age) {
        this(name, lastName, age,
                0, 0, 0, 0, "Получить углубленные знания Java");
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public void setCountEndTask(int countEndTask) {
        this.countEndTask = countEndTask;
    }

    public void setCountEndModules(int countEndModules) {
        this.countEndModules = countEndModules;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setPurposeOfTraining(String purposeOfTraining) {
        this.purposeOfTraining = purposeOfTraining;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getNumberGroup() {
        return numberGroup;
    }

    public int getCountEndTask() {
        return countEndTask;
    }

    public int getCountEndModules() {
        return countEndModules;
    }

    public int getExperience() {
        return experience;
    }

    public String getPurposeOfTraining() {
        return purposeOfTraining;
    }
}
