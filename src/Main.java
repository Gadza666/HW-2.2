public class Main {
    public static void main(String[] args) {
        Griffendor harryPotter = new Griffendor("Harry Potter", 32, 54, 64, 88,34);
        Griffendor hermioneGranger = new Griffendor("Hermione Granger", 55, 6, 65, 88, 99);
        Griffendor ronWeasley = new Griffendor("Ron Weasley", 56, 87, 66, 55, 4);

        Sliseren dracoMalfoy = new Sliseren("Draco Malfoy", 9, 0, 9, 8, 8, 9, 14);
        Sliseren grahamMontague = new Sliseren("Graham Montague", 55,78,87,43,32,4,22);
        Sliseren gregoryGoyle = new Sliseren("Gregory Goyle", 55,6,7,8,9,1,44);

        Puffenduy zacharySmith = new Puffenduy("Zachary Smith", 44, 66, 77, 88, 99);
        Puffenduy cdricDiggory = new Puffenduy("Cedric Diggory", 22, 77, 86, 4, 33);
        Puffenduy justinFinchFletchley = new Puffenduy("Justin Finch-Fletchley", 23, 23, 65, 76, 88);

        Kogtevran zhouChang = new Kogtevran("Zhou Chang", 55, 56, 78, 9, 87);
        Kogtevran padmaPatil = new Kogtevran("Padma Patil", 32, 11, 12, 32, 45);
        Kogtevran marcusBelby = new Kogtevran("Marcus Belby", 11, 23, 43, 21, 32);

        harryPotter.compareGriffendorStudent(ronWeasley);
        zacharySmith.comparePuffenduyStudent(cdricDiggory);
        zhouChang.compareKogtevranStudent(padmaPatil);
        dracoMalfoy.compareSliserenStudent(grahamMontague);
        gregoryGoyle.compareHogwartsStudent(marcusBelby);


    }


}
//Harry Potter, Hermione Granger and Ron Weasley
//Draco Malfoy, Graham Montague, Gregory Goyle
//Zachary Smith, Cedric Diggory, Justin Finch-Fletchley
//Zhou Chang, Padma Patil and Marcus Belby