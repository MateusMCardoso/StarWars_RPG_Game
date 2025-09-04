public class Personagem {

    private String name;

    private double lifeScore;

    private double attack;
    private double defense;

    public Personagem(String name, double lifeScore, double attack, double defense) {
        this.name = name;
        this.lifeScore = lifeScore;
        this.attack = attack;
        this.defense = defense;
    }

    public double getLifeScore() {
        return lifeScore;
    }

    public void setLifeScore(double lifeScore) {
        this.lifeScore = lifeScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

}
