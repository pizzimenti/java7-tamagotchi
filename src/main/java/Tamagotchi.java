public class Tamagotchi {
  String mName;
  int mFed;

  public Tamagotchi(String name) {
    mName = name;
    mFed = 3;
  }

  public String isHungry() {
    if (mFed == 3) {
      return "I am not hungry";
    }
    return "error";
  }

} //end Tamagotchi class
