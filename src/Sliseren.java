import java.util.Objects;

public class Sliseren extends hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int trustForPower;

    public Sliseren(String name, int transgression, int magicPower, int cunning, int determination, int ambition, int resourcefulness, int trustForPower) {
        super(name, transgression, magicPower);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.trustForPower = trustForPower;
    }

    public void compareSliserenStudent(Sliseren student) {
        if (comparePower(student)) {
            System.out.println(String.format("%s лучший Слизериновец, чем %s", this, student));
        } else {
            System.out.println(String.format("%s лучший Слизериновец, чем %s", student, this));
        }
    }

    private boolean comparePower(Sliseren student) {
        return cunning + determination + ambition + resourcefulness + trustForPower > student.cunning + student.determination + student.ambition + student.resourcefulness + student.trustForPower;
    }

    void printStats() {
        System.out.println(StringFullName());
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getTrustForPower() {
        return trustForPower;
    }

    public void setTrustForPower(int trustForPower) {
        this.trustForPower = trustForPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Sliseren sliseren = (Sliseren) o;
        return cunning == sliseren.cunning && determination == sliseren.determination && ambition == sliseren.ambition && resourcefulness == sliseren.resourcefulness && trustForPower == sliseren.trustForPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunning, determination, ambition, resourcefulness, trustForPower);
    }

    public String StringFullName() {
        return "Sliseren{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", trustForPower=" + trustForPower +
                ", name='" + name + '\'' +
                ", transgression=" + transgression +
                ", magicPower=" + magicPower +
                '}';
    }

    @Override
    public String toString() {
        return name;
    }
}
