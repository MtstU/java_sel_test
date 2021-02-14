package JavaRush;

public class Artifact {
    int count;
    String culture;
    int age;

    public Artifact() {
        count = 212121;
        count++;
    }

    public Artifact(String culture) {
        this.culture = culture;
        count = 212121;
        count++;
    }

    public Artifact(String culture, int age) {
        this.culture = culture;
        this.age = age;
        count = 212121;
        count++;
    }


    public static void main(String[] args) {
        Artifact dontKnow = new Artifact();
        Artifact knowCulture = new Artifact("Actek");
        Artifact knowCultureAge = new Artifact("Ethrusk", 12);

        System.out.println("номер артифакта: " + dontKnow.count);
        System.out.println("культура второго артефакта: " + knowCulture.culture);
        System.out.println("век и культура третьего артефакта: " + knowCultureAge.age + " " + knowCultureAge.culture);
    }
}

