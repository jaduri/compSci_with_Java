public class Test{
  public static void main(String[] args){
    //create object to run test
    HanoiTower ht = new HanoiTower();
    ht.solve(ht.disks, ht.poleA, ht.poleB, ht.poleC);
  }
}
