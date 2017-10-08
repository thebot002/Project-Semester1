public class Pentominoe {

  private int[][] pentominoe;

  public Pentominoe(){

  }
  public Pentominoe(char form){
    createPentominoe(form);
  }

  public int[][] getPentominoe(){
    return pentominoe;
  }

  public void rotate(int amountRotations){

  }
  public void flip(){

  }
  /*public int[][] hasFlatSideOn(){

  }*/

  private void createPentominoe(char form){
    switch (form) {
      case 'p':
      System.out.println("tester");
      pentominoe = new int[3][2];
      for(int i=0;i<pentominoe.length;i++){
        for(int j=0;j<pentominoe[i].length;j++){
          if(!(i==2 && j==1)) pentominoe[i][j] = 1;
          else pentominoe[i][j] = 0;
        }
      }
      break;
      case 'x':
      pentominoe = new int[3][3];
      for(int i=0;i<pentominoe.length;i++){
        for(int j=0;j<pentominoe[i].length;j++){
          if(!((i==0 || i==2)&&(j==0 || j==2))) pentominoe[i][j] = 1;
          else pentominoe[i][j] = 0;
        }
      }
      break;
      case 'f':
      pentominoe = new int[3][3];
      for(int i=0;i<pentominoe.length;i++){
        for(int j=0;j<pentominoe[i].length;j++){
          if(j==1 || (j==0 && i==1) || (j==2 && i==0)) pentominoe[i][j] = 1;
          else pentominoe[i][j] = 0;
        }
      }
      break;
      case 'v':
      pentominoe = new int[3][3];
      for(int i=0;i<pentominoe.length;i++){
        for(int j=0;j<pentominoe[i].length;j++){
          if(i==2 || j==0) pentominoe[i][j] = 1;
          else pentominoe[i][j] = 0;
        }
      }
      break;
      case 'w':
      pentominoe = new int[3][3];
      for(int i=0;i<pentominoe.length;i++){
        for(int j=0;j<pentominoe[i].length;j++){
          if((i==0 && j==0) || (i==1 && j<2) || (i==2 && j>0)) pentominoe[i][j] = 1;
          else pentominoe[i][j] = 0;
        }
      }
      break;
      case 'y':
      pentominoe = new int[4][2];
      for(int i=0;i<pentominoe.length;i++){
        for(int j=0;j<pentominoe[i].length;j++){
          if((i==1 && j==0) || j==1) pentominoe[i][j] = 1;
          else pentominoe[i][j] = 0;
        }
      }
      break;
      case 'i':
      pentominoe = new int[5][1];
      for(int i=0;i<pentominoe.length;i++){
        for(int j=0;j<pentominoe[i].length;j++){
          pentominoe[i][j] = 1;
        }
      }
      break;
      case 't':
      pentominoe = new int[3][3];
      for(int i=0;i<pentominoe.length;i++){
        for(int j=0;j<pentominoe[i].length;j++){
          if(i==0 || j==1) pentominoe[i][j] = 1;
          else pentominoe[i][j] = 0;
        }
      }
      break;
      case 'z':
      pentominoe = new int[3][3];
      for(int i=0;i<pentominoe.length;i++){
        for(int j=0;j<pentominoe[i].length;j++){
          if(j==1 || (i==0 && j==0) || (i==2 && j==2)) pentominoe[i][j] = 1;
          else pentominoe[i][j] = 0;
        }
      }
      break;
      case 'u':
      pentominoe = new int[2][3];
      for(int i=0;i<pentominoe.length;i++){
        for(int j=0;j<pentominoe[i].length;j++){
          if(!(i==0 && j==1)) pentominoe[i][j] = 1;
          else pentominoe[i][j] = 0;
        }
      }
      break;
      case 'n':
      pentominoe = new int[2][4];
      for(int i=0;i<pentominoe.length;i++){
        for(int j=0;j<pentominoe[i].length;j++){
          if((i==0 && j<2) || (i==1 && j>0)) pentominoe[i][j] = 1;
          else pentominoe[i][j] = 0;
        }
      }
      break;
      case 'l':
      pentominoe = new int[2][4];
      for(int i=0;i<pentominoe.length;i++){
        for(int j=0;j<pentominoe[i].length;j++){
          if(!(i==0 && j<3)) pentominoe[i][j] = 1;
          else pentominoe[i][j] = 0;
        }
      }
      break;
    }
  }

  public void print(){
    for(int i=0;i<pentominoe.length;i++){
      for(int j=0;j<pentominoe[i].length;j++){
        System.out.print(pentominoe[i][j]);
      }
      System.out.println("");
    }
  }
}
