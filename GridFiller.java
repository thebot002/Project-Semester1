public class GridFiller{
  public static void main(String[] args) {
    Grid g = new Grid();

    char p='p', x='x', f='f', v='v', w='w', y='y', j='i', t='t', z='z', u='u', n='n', l='l';

    char[] charachterSet = {p,x,f,v,w,y,j,t,z,u,n,l};
    Pentominoe[] pSet = PentominoeSetCreater(charachterSet);

    int amountBlocks = charachterSet.length * 5;
    int amountSpaces = g.getWidth()*g.getHeight();

    double beginT = System.nanoTime()*1.0;
    if(amountSpaces<amountBlocks) System.out.println("Grid is too small, sorry...");
    else if(amountSpaces>amountBlocks) System.out.println("Gris is too big, there will be empty spaces...");
    else{
      if(Filler(g,pSet,0)) System.out.println("Done");
      else System.out.println("Error");
    }
    double deltaT = ((System.nanoTime()*1.0)-beginT)/1000000000;
    System.out.println("Elapsed time: " + deltaT);
  }

  public static Pentominoe[] PentominoeSetCreater(char[] list){
    Pentominoe[] myArray = new Pentominoe[list.length];

    for (int i=0; i<list.length; i++){
      Pentominoe p = new Pentominoe(list[i]);
      myArray[i] = p;
    }
    return myArray;
  }

  public static boolean Filler(Grid g, Pentominoe[] pSet, int pentominoe){
    boolean check = false;
    if(g.isFull()){
      g.print();
      return true;
    }
    else {
      Pentominoe p = pSet[pentominoe];
      int i=0;
      do{
        int j=0;
        do {
          if(g.isPossible(p,g.getFirstEmpty())){
            //System.out.println("test");
            Grid newG = new Grid();
            for(int k=0; k<newG.getHeight();k++){
              for(int l=0; l<newG.getWidth();l++){
                newG.setValue(k,l,g.getValue(k,l));
              }
            }
            newG.addPentominoe(p,newG.getFirstEmpty());
            //newG.print();
            //System.out.println(pSet.length);
            Pentominoe[] newPSet = elRemove(pSet,pentominoe);
            //System.out.println(newPSet.length);
            if(Filler(newG,newPSet,0)) return true;
          }
          p.flipH();
          j++;
          //p.print();
        } while (j<2 /*|| p.form!='x'||p.form!='i'*/);
        p.rotateR();
        i++;
      } while (i<4 /*|| p.form!='x' || (p.form=='i'&&i<2)*/);
    }
    pentominoe++;
    if(pentominoe == pSet.length) return false;
    return Filler(g,pSet,pentominoe);
  }

  public static Pentominoe[] elRemove(Pentominoe[] set, int p){
    Pentominoe[] newSet = new Pentominoe[set.length-1];
    for(int i=0;i<p;i++){
      newSet[i] = set[i];
    }
    for(int i=p;i<newSet.length;i++){
      newSet[i] = set[i+1];
    }
    return newSet;
  }
}
