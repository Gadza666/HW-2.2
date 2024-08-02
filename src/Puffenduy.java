import java.util.Objects;

public class Puffenduy extends hogwarts {
    private int hardworking;
    private int loyal;
    private int honest;

    public Puffenduy(String name, int transgression, int magicPower, int hardworking, int loyal, int honest) {
        super(name, transgression, magicPower);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public void comparePuffenduyStudent(Puffenduy student) {
        if (comparePower(student)) {
            System.out.println(String.format("%s лучший ПуффендуЙ, чем %s", this, student));
        } else {
            System.out.println(String.format("%s лучший ПуффендуЙ, чем %s", student, this));
        }
    }

    private boolean comparePower(Puffenduy student) {
        return hardworking + loyal + honest > student.hardworking + student.loyal + student.honest;
    }

    void printStats() {
        System.out.println(StringFullName());
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Puffenduy puffenduy = (Puffenduy) o;
        return hardworking == puffenduy.hardworking && loyal == puffenduy.loyal && honest == puffenduy.honest;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hardworking, loyal, honest);
    }


    public String StringFullName() {
        return "Puffenduy{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
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

