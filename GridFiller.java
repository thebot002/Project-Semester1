public class GridFiller {
  public static void main(String[] args) {
    Grid g = new Grid();

    char p='p', x='x', f='f', v='v', w='w', y='y', j='i', t='t', z='z', u='u', n='n', l='l';

    char[] charachterSet = {p,x,f,v,w,y,j,t,z,u,n,l};
    Pentominoe[] pSet = new PentominoeSetCreater(charachterSet);
  }

  public static Pentominoe[] PentominoeSetCreater(char[] list){
    Pentominoe[] myArray = new Pentominoe[list.length];

    for (int i=0; i<list.length; i++){
      Pentominoe p = new Pentominoe(list[i]);
      myArray[i] = p;
    }
    return myArray;
  }

  public static void Filler(Grid g, Pentominoe[] pSet){
    int pentNb = 0;
    do{
      int[] emptyPos = g.getFirstEmpty();
      for()
      pentNb++;
    }while(Arrays.equals(g.getFirstEmpty(),{-1,-1});
    g.print();
  }
}
