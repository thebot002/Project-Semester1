public class PentominoeTester{
  public static void main(String[] args) {
    //Creating variables for each possible letter to make it easier to add or remove during test
    char p='p', x='x', f='f', v='v', w='w', y='y', j='i', t='t', z='z', u='u', n='n', l='l';

    char[] charachterSet = {p,x,f,v,w,y,j,t,z,u,n,l};

    Pentominoe[] PentominoeSet = PentominoeSetCreater(a);
    for(int i=0; i<PentominoeSet.length;i++){
      PentominoeSet[i].print();
    }
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
