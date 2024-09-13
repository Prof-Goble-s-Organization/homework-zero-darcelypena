package hw0;

/**
 * A DarBomb object stores and manipulates information on the DarBomb space alien race. 
 * It extends the SpaceAlien class and implements the ZapsWithSlime interface.
 * 
 * @author Darcely Peña
 * @author Dickinson College
 * @version September 10, 2024
 */

public class DarBomb extends SpaceAlien implements ZapsWithSlime {

	// superpower of the DarBomb 
    private String superpower; 
    
    public DarBomb(String homePlanet, double distanceFromEarth, String superpower) {
        super(homePlanet, distanceFromEarth);
        this.superpower = superpower;
    }
 
    public String getSuperpower(){
        return superpower;
    }

    @Override
    public void doGreeting() {

        String homePlanet = super.getHomePlanet();

        double distanceFromEarth = super.getDistFromEarth();

        System.out.println("Greetings form planet " + homePlanet + ", "
                + distanceFromEarth + " light years away");
    }
    
    @Override
    public String doSlimeZap(int numHumans){
        String zapSoundEffect = "BLAP BLOOP";
        for (int i = 0; i < numHumans; i++) {
            System.out.println(zapSoundEffect);
        }
        return zapSoundEffect;
    }

    @Override
    public String slimeWholeEarth(){
        String starSoundEffect = "BOOOMMMM";
        System.out.println(starSoundEffect);
        return starSoundEffect;
    }
    public static void main(String[] args) {
        DarBomb db1 = new DarBomb("Nebula", 500, "Lazer Eyes");
        db1.doGreeting();
        db1.doSlimeZap(5);
        db1.slimeWholeEarth();
    }
}
