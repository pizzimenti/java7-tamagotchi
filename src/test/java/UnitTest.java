import org.junit.*;
import static org.junit.Assert.*;

public class UnitTest {

  @Test
  public void Tamagotchi_instatiatesCorrectly_true() {
    Tamagotchi myPet = new Tamagotchi("Suki");
    assertEquals(true, myPet instanceof Tamagotchi);
  }

  @Test
  public void Tamagotchi_isNotHungry_notHungryString() {
    Tamagotchi myPet = new Tamagotchi("Suki");
    assertEquals("I am not hungry", myPet.isHungry());
  }

  @Test
  public void Tamagotchi_isHungry_hungryString() {
    Tamagotchi myPet = new Tamagotchi("Suki");
    myPet.time();
    assertEquals("I am hungry", myPet.isHungry());
  }

  @Test
  public void Tamagotchi_isDead_deathString() {
    Tamagotchi myPet = new Tamagotchi("Suki");
    myPet.time();
    myPet.time();
    myPet.time();
    assertEquals("You've starved me, you bastard!", myPet.isHungry());
  }
/*
@Test
public void giveChange_25cents_1quarter() {
  App testApp = new App();
  assertEquals("{Nickels=0, Dimes=0, Quarters=1, Pennies=0}", testApp.giveChange(25).toString());
}
*/

}
