import org.junit.*;
import static org.junit.Assert.*;

public class UnitTest {

  @Test
  public void Tamagotchi_instatiatesCorrectly_true() {
    Tamagotchi myPet = new Tamagotchi("Suki");
    assertEquals(true, myPet instanceof Tamagotchi);
  }

  @Test
  public void Tamagotchi_isHungry_false() {
    Tamagotchi myPet = new Tamagotchi("Suki");
    assertEquals("I am not hungry", myPet.isHungry());
  }

/*
@Test
public void giveChange_25cents_1quarter() {
  App testApp = new App();
  assertEquals("{Nickels=0, Dimes=0, Quarters=1, Pennies=0}", testApp.giveChange(25).toString());
}
*/

}
