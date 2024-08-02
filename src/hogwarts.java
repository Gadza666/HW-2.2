import java.util.Objects;

public class hogwarts {
    protected String name;
    protected int transgression;
    protected int magicPower;

    public hogwarts(String name, int transgression, int magicPower) {
        this.name = name;
        this.transgression = transgression;
        this.magicPower = magicPower;
    }

    public void compareHogwartsStudent(hogwarts student) {
        if (comparePower(student)) {
            System.out.println(String.format("%s обладает бОльшей мощностью магии, чем %s", this, student));
        } else {
            System.out.println(String.format("%s обладает бОльшей мощностью магии, чем %s", student, this));
        }
    }

    private boolean comparePower(hogwarts student) {
        return transgression + magicPower > student.transgression + student.magicPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public hogwarts(int transgression, int magicPower) {
        this.transgression = transgression;
        this.magicPower = magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        hogwarts hogwarts = (hogwarts) o;
        return transgression == hogwarts.transgression && magicPower == hogwarts.magicPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(transgression, magicPower);
    }
}
