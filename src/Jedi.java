public class Jedi extends Personagem {

    private double atkForceImplosion;
    private double atkThePowerOfTheVoid;

    private double credits;

    private Jedi(JediBuilder builder) {
        super(builder.name, builder.lifeScore, builder.attack, builder.defense);
        this.atkForceImplosion = builder.atkForceImplosion;
        this.atkThePowerOfTheVoid = builder.atkThePowerOfTheVoid;
        this.credits = builder.credits;
    }

    public double getAtkForceImplosion() {
        return atkForceImplosion;
    }

    public void setAtkForceImplosion(double atkForceImplosion) {
        this.atkForceImplosion = atkForceImplosion;
    }

    public double getAtkThePowerOfTheVoid() {
        return atkThePowerOfTheVoid;
    }

    public void setAtkThePowerOfTheVoid(double atkThePowerOfTheVoid) {
        this.atkThePowerOfTheVoid = atkThePowerOfTheVoid;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public static class JediBuilder {
        private String name;
        private double lifeScore;
        private double attack;
        private double defense;
        private double atkForceImplosion;
        private double atkThePowerOfTheVoid;
        private double credits;

        public JediBuilder(String name){
            this.name = name;
        }

        public JediBuilder lifeScore(double lifeScore) {
            this.lifeScore = lifeScore;
            return this;
        }

        public JediBuilder attack(double attack) {
            this.attack = attack;
            return this;
        }

        public JediBuilder defense(double defense) {
            this.defense = defense;
            return this;
        }

        public JediBuilder atkForceImplosion(double atkForceImplosion) {
            this.atkForceImplosion = atkForceImplosion;
            return this;
        }

        public JediBuilder atkThePowerOfTheVoid(double atkThePowerOfTheVoid) {
            this.atkThePowerOfTheVoid = atkThePowerOfTheVoid;
            return this;
        }

        public JediBuilder credits(double credits) {
            this.credits = credits;
            return this;
        }

        public Jedi build() {
            return new Jedi(this);
        }
    }
}


