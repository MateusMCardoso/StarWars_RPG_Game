public class DarthWinter extends Personagem {
    private double atkFrozenBlade;
    private double atkZeroForce;

    private DarthWinter(DarthWinterBuilder builder) {
        super(builder.name, builder.lifeScore, builder.attack, builder.defense);
        this.atkFrozenBlade = builder.atkFrozenBlade;
        this.atkZeroForce = builder.atkZeroForce;
    }

    public double getAtkFrozenBlade() {
        return atkFrozenBlade;
    }

    public void setAtkFrozenBlade(double atkFrozenBlade) {
        this.atkFrozenBlade = atkFrozenBlade;
    }

    public double getAtkZeroForce() {
        return atkZeroForce;
    }

    public void setAtkZeroForce(double atkZeroForce) {
        this.atkZeroForce = atkZeroForce;
    }

    public static class DarthWinterBuilder {
        private String name;
        private double lifeScore;
        private double attack;
        private double defense;
        private double atkFrozenBlade;
        private double atkZeroForce;

        public DarthWinterBuilder(String name) {
            this.name = name;
        }

        public DarthWinterBuilder lifeScore(double lifeScore) {
            this.lifeScore = lifeScore;
            return this;
        }

        public DarthWinterBuilder attack(double attack) {
            this.attack = attack;
            return this;
        }

        public DarthWinterBuilder defense(double defense) {
            this.defense = defense;
            return this;
        }

        public DarthWinterBuilder atkFrozenBlade(double atkFrozenBlade) {
            this.atkFrozenBlade = atkFrozenBlade;
            return this;
        }

        public DarthWinterBuilder atkZeroForce(double atkZeroForce) {
            this.atkZeroForce = atkZeroForce;
            return this;
        }

        public DarthWinter build() {
            return new DarthWinter(this);
        }
    }
}
