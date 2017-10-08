public class Pentominoe {

  private int[][] pentominoe;

  public Pentominoe(){

  }
  public Pentominoe(String form){
    createPentominoe(form);
  }

  public int[][] getPentominoe(){
    return pentominoe;
  }

  public void rotate(int amountRotations){

  }
  public void flip(){

  }
  public int[][] hasFlatSideOn(){

  }

  private static void createPentominoe(String form){
    switch (form) {
      case "P":
      pentominoe = new int[2][3];
      for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
          if(!(i==1 && j==2)) pentominoe[i][j] = 1;
          else pentominoe[i][j] = 0;
        }
      }
      break;
      case "x":
      pentominoe = new int[3][3];
      for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
          if(!((i==0 || i==2)&&(j==0 || j==2))) pentominoe[i][j] = 1;
          else pentominoe[i][j] = 0;
        }
      }
      break;
      case "f":
      pentominoe = new int[3][3];
      for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
          if(!((i==0) && (j==0 || j==2)) || !()) pentominoe[i][j] = 1;
          else pentominoe[i][j] = 0;
        }
      }
      break;
      case "v":
      pentominoe = new int[3][3];
      for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){

        }
      }
      break;
      case "w":
      pentominoe = new int[3][3];
      for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){

        }
      }
      break;
      case "y":
      pentominoe = new int[3][3];
      for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){

        }
      }
      break;
      case "i":
      pentominoe = new int[3][3];
      for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){

        }
      }
      break;
      case "t":
      pentominoe = new int[3][3];
      for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){

        }
      }
      break;
      case "z":
      pentominoe = new int[3][3];
      for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){

        }
      }
      break;
      case "u":
      pentominoe = new int[3][3];
      for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){

        }
      }
      break;
      case "n":
      pentominoe = new int[3][3];
      for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){

        }
      }
      break;
      case "l":
      pentominoe = new int[3][3];
      for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){

        }
      }
      break;
    }
  }
}
