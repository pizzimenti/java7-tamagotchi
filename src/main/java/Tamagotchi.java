public class Tamagotchi {
  String mName;
  int mFed;

  public Tamagotchi(String name) {
    mName = name;
    mFed = 3;
  }

  public String isHungry() {
    if (mFed > 2) {
      return "I am not hungry";
    } else if (mFed <= 2 && mFed >0) {
      return "I am hungry";
    } else if (mFed <= 0) {
      return "You've starved me, you bastard!";
    } return "hunger error";
  }

  public void time() {
    mFed--;
  } //end of time
} //end Tamagotchi class
