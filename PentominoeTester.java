public class PentominoeTester{
  public static void main(String[] args) {
    //Creating variables for each possible letter to make it easier to add or remove during test
    char p='p', x='x', f='f', v='v', w='w', y='y', j='i', t='t', z='z', u='u', n='n', l='l';

    char[] charachterSet = {p,x,f,v,w,y,j,t,z,u,n,l};

    Pentominoe[] PentominoeSet = PentominoeSetCreater(charachterSet);
    /*for(int i=0; i<PentominoeSet.length;i++){
      PentominoeSet[i].print();
    }*/
    Grid g = new Grid();
    g.addPentominoe(PentominoeSet[0],g.getFirstEmpty());
    g.print();
    int[] pos = g.getFirstEmpty();
    if(g.isPossible(PentominoeSet[2],g.getFirstEmpty())){
      g.addPentominoe(PentominoeSet[3],g.getFirstEmpty());
      g.print();
    }
    else System.out.println("error");
    /*char h = 1;
    System.out.println(h);
    PentominoeSet[0].rotateR();
    PentominoeSet[0].print();*/
  }
  public static Pentominoe[] PentominoeSetCreater(char[] list){
    Pentominoe[] myArray = new Pentominoe[list.length];

    for (int i=0; i<list.length; i++){
      Pentominoe p = new Pentominoe(list[i]);
      myArray[i] = p;
    }
    return myArray;
  }
}
