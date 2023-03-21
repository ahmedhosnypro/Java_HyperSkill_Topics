class Employee {

    // write fields
    String name;
    String email;
    int experience;

    // write constructor
    Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }
    // write getters

    public int getExperience() {
        return experience;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}

class Developer extends Employee {

    // write fields
    String mainLanguage;
    String[] skills;

    // write constructor
    Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }
    // write getters

    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return skills;
    }
}

class DataAnalyst extends Employee {

    // write fields
    boolean phd;
    String[] methods;

    // write constructor
    DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.methods = methods;
        this.phd = phd;
    }
    // write getters

    public boolean isPhd() {
        return phd;
    }

    public String[] getMethods() {
        return methods;
    }
}