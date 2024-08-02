import java.util.Objects;

public class Kogtevran extends hogwarts {
    private int smart;
    private int wise;
    private int witty;

    public Kogtevran(String name, int transgression, int magicPower, int smart, int wise, int witty) {
        super(name, transgression, magicPower);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
    }

    public void compareKogtevranStudent(Kogtevran student) {
        if (comparePower(student)) {
            System.out.println(String.format("%s лучший Когтевран, чем %s", this, student));
        } else {
            System.out.println(String.format("%s лучший Когтевран, чем %s", student, this));
        }
    }

    private boolean comparePower(Kogtevran student) {
        return smart + wise + witty > student.smart + student.wise + student.witty;
    }

    void printStats() {
        System.out.println(StringFullName());
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Kogtevran kogtevran = (Kogtevran) o;
        return smart == kogtevran.smart && wise == kogtevran.wise && witty == kogtevran.witty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), smart, wise, witty);
    }

    public String StringFullName() {
        return "Kogtevran{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
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
