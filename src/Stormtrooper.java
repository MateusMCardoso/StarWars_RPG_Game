public class Stormtrooper extends Personagem {
    private double atkBlasterShoot;

    private Stormtrooper(StormtrooperBuilder builder) {
        super(builder.name, builder.lifeScore, builder.attack, builder.defense);
        this.atkBlasterShoot = builder.atkBlasterShoot;
    }

    public double getAtkBlasterShoot() {
        return atkBlasterShoot;
    }

    public void setAtkBlasterShoot(double atkBlasterShoot) {
        this.atkBlasterShoot = atkBlasterShoot;
    }

    public static class StormtrooperBuilder {
        private String name;
        private double lifeScore;
        private double attack;
        private double defense;
        private double atkBlasterShoot;

        public StormtrooperBuilder(String name){
            this.name = name;
        }

        public StormtrooperBuilder lifeScore(double lifeScore){
            this.lifeScore = lifeScore;
            return this;
        }

        public StormtrooperBuilder attack(double attack){
            this.attack = attack;
            return this;
        }

        public StormtrooperBuilder defense(double defense){
            this.defense = defense;
            return this;
        }

        public StormtrooperBuilder atkBlasterShoot(double atkBlasterShoot){
            this.atkBlasterShoot = atkBlasterShoot;
            return this;
        }
        public Stormtrooper build() {
            return new Stormtrooper(this);
        }
    }
}
