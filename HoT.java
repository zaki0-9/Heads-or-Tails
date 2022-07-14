import java.util.Random;
class HoT {
  public static void main(String args[]) {
    System.out.println("Tossing a coin...");
    int i=0;
    int Hcount = 0;
    int Tcount = 0;
    for(i=0;i<3;i++){
      int j = i+1;
    Random rand = new Random();
    int num = rand.nextInt(2);
    if(num == 0){
      System.out.println("Round" + j +": Heads");
      Hcount++;
    }
    else {
      System.out.println("Round" + j +": Tails");
      Tcount++;
    }
    }
    System.out.println("Heads:" + Hcount + "," + "Tails:" + Tcount);
    if(Hcount > Tcount) System.out.println("You won");
    else System.out.println("You lost");
  }
}
