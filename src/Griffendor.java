import java.util.Objects;

public class Griffendor extends hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Griffendor(String name, int transgression, int magicPower, int nobility, int honor, int courage) {
        super(name, transgression, magicPower);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public void compareGriffendorStudent(Griffendor student) {
        if (comparePower(student)) {
            System.out.println(String.format("%s лучший Гриффиндорец, чем %s",this, student));
        } else {
            System.out.println(String.format("%s лучший Гриффиндорец, чем %s",student,this));
        }
    }

    private boolean comparePower(Griffendor student) {
        return nobility + honor + courage > student.nobility + student.honor + student.courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Griffendor that = (Griffendor) o;
        return nobility == that.nobility && honor == that.honor && courage == that.courage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, courage);
    }

    public String StringFullName() {
        return "Griffendor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
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
