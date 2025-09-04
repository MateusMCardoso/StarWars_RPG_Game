public class Main {
    public static void main(String[] args) {

        DarthWinter darthWinter = new DarthWinter.DarthWinterBuilder("Darth Winter")
                .lifeScore(2500)
                .attack(100)
                .defense(50)
                .atkFrozenBlade(350)
                .atkZeroForce(450)
                .build();

        Stormtrooper stormtrooper = new Stormtrooper.StormtrooperBuilder("Stormtrooper")
                .attack(75)
                .defense(0)
                .atkBlasterShoot(100)
                .build();

        Jedi jedi = new Jedi.JediBuilder("Luke Skywalker")
                .lifeScore(500)
                .attack(75)
                .defense(50)
                .atkForceImplosion(250)
                .atkThePowerOfTheVoid(450)
                .credits(100)
                .build();
    }
}