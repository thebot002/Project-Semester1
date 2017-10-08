import java.util.*;

public class Pentominoe {

  private char[][] pentominoe;

  public Pentominoe(){

  }
  public Pentominoe(char form){
    createPentominoe(form);
  }

  public char[][] getPentominoe(){
    return pentominoe;
  }

  private void createPentominoe(char form){
    switch (form) {
      case 'p':
      System.out.println("tester");
      pentominoe = new char[3][2];
      for(int i=0;i<pentominoe.length;i++){
        for(int j=0;j<pentominoe[i].length;j++){
          if(!(i==2 && j==1)) pentominoe[i][j] = 'p';
          else pentominoe[i][j] = '-';
        }
      }
      break;
      case 'x':
      pentominoe = new char[3][3];
      for(int i=0;i<pentominoe.length;i++){
        for(int j=0;j<pentominoe[i].length;j++){
          if(!((i==0 || i==2)&&(j==0 || j==2))) pentominoe[i][j] = 'x';
          else pentominoe[i][j] = '-';
        }
      }
      break;
      case 'f':
      pentominoe = new char[3][3];
      for(int i=0;i<pentominoe.length;i++){
        for(int j=0;j<pentominoe[i].length;j++){
          if(j==1 || (j==0 && i==1) || (j==2 && i==0)) pentominoe[i][j] = 'f';
          else pentominoe[i][j] = '-';
        }
      }
      break;
      case 'v':
      pentominoe = new char[3][3];
      for(int i=0;i<pentominoe.length;i++){
        for(int j=0;j<pentominoe[i].length;j++){
          if(i==2 || j==0) pentominoe[i][j] = 'v';
          else pentominoe[i][j] = '-';
        }
      }
      break;
      case 'w':
      pentominoe = new char[3][3];
      for(int i=0;i<pentominoe.length;i++){
        for(int j=0;j<pentominoe[i].length;j++){
          if((i==0 && j==0) || (i==1 && j<2) || (i==2 && j>0)) pentominoe[i][j] = 'w';
          else pentominoe[i][j] = '-';
        }
      }
      break;
      case 'y':
      pentominoe = new char[4][2];
      for(int i=0;i<pentominoe.length;i++){
        for(int j=0;j<pentominoe[i].length;j++){
          if((i==1 && j==0) || j==1) pentominoe[i][j] = 'y';
          else pentominoe[i][j] = '-';
        }
      }
      break;
      case 'i':
      pentominoe = new char[5][1];
      for(int i=0;i<pentominoe.length;i++){
        for(int j=0;j<pentominoe[i].length;j++){
          pentominoe[i][j] = 'i';
        }
      }
      break;
      case 't':
      pentominoe = new char[3][3];
      for(int i=0;i<pentominoe.length;i++){
        for(int j=0;j<pentominoe[i].length;j++){
          if(i==0 || j==1) pentominoe[i][j] = 't';
          else pentominoe[i][j] = '-';
        }
      }
      break;
      case 'z':
      pentominoe = new char[3][3];
      for(int i=0;i<pentominoe.length;i++){
        for(int j=0;j<pentominoe[i].length;j++){
          if(j==1 || (i==0 && j==0) || (i==2 && j==2)) pentominoe[i][j] = 'z';
          else pentominoe[i][j] = '-';
        }
      }
      break;
      case 'u':
      pentominoe = new char[2][3];
      for(int i=0;i<pentominoe.length;i++){
        for(int j=0;j<pentominoe[i].length;j++){
          if(!(i==0 && j==1)) pentominoe[i][j] = 'u';
          else pentominoe[i][j] = '-';
        }
      }
      break;
      case 'n':
      pentominoe = new char[2][4];
      for(int i=0;i<pentominoe.length;i++){
        for(int j=0;j<pentominoe[i].length;j++){
          if((i==0 && j<2) || (i==1 && j>0)) pentominoe[i][j] = 'n';
          else pentominoe[i][j] = '-';
        }
      }
      break;
      case 'l':
      pentominoe = new char[2][4];
      for(int i=0;i<pentominoe.length;i++){
        for(int j=0;j<pentominoe[i].length;j++){
          if(!(i==0 && j<3)) pentominoe[i][j] = 'l';
          else pentominoe[i][j] = '-';
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

  public char getValue(int i, int j){
    return pentominoe[i][j];
  }
  public int getWidth(){
    return pentominoe[0].length;
  }
  public int getHeight(){
    return pentominoe.length;
  }

  public void rotateR(){ //clockwise
    char[][] temp = new char[pentominoe[0].length][pentominoe.length];
    for(int i=0; i<pentominoe.length;i++){
      for(int j=0;j<pentominoe[0].length;j++){
        temp[j][i] = pentominoe[i][j];
      }
    }
    pentominoe = Arrays.copyOf(temp, temp.length);
    flipH();
  }
  public void rotateL(){ //counter clockwise
    char[][] temp = new char[pentominoe[0].length][pentominoe.length];
    for(int i=0; i<pentominoe.length;i++){
      for(int j=0;j<pentominoe[0].length;j++){
        temp[j][i] = pentominoe[i][j];
      }
    }
    pentominoe = Arrays.copyOf(temp, temp.length);
    flipV();
  }
  public void flipH(){ //horizontal
    if(pentominoe[0].length%2 != 0){
      for(int i=0; i<pentominoe.length; i++){
        for(int j=0;j<(pentominoe[0].length-1)/2;j++){
          char temp = pentominoe[i][j];
          pentominoe[i][j] = pentominoe[i][pentominoe[0].length-1-j];
          pentominoe[i][pentominoe[0].length-1-j] = temp;
        }
      }
    }
    else{
      for(int i=0; i<pentominoe.length; i++){
        for(int j=0;j<pentominoe[0].length/2;j++){
          char temp = pentominoe[i][j];
          pentominoe[i][j] = pentominoe[i][pentominoe[0].length-1-j];
          pentominoe[i][pentominoe[0].length-1-j] = temp;
        }
      }
    }
  }
  public void flipV(){ //Vertical
    if(pentominoe.length%2 != 0){
      for(int i=0; i<(pentominoe.length-1)/2; i++){
        for(int j=0;j<pentominoe[0].length;j++){
          char temp = pentominoe[i][j];
          pentominoe[i][j] = pentominoe[pentominoe.length-1-i][j];
          pentominoe[pentominoe.length-1-i][j] = temp;
        }
      }
    }
    else{
      for(int i=0; i<pentominoe.length/2; i++){
        for(int j=0;j<pentominoe[0].length;j++){
          char temp = pentominoe[i][j];
          pentominoe[i][j] = pentominoe[pentominoe.length-1-i][j];
          pentominoe[pentominoe.length-1-i][j] = temp;
        }
      }
    }
  }
}
