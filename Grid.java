public class Grid{
  private char[][] grid;
  private int width = 12;
  private int height = 5;

  //constructors
  public Grid(){
    GridCreater();
  }
  public Grid(int width, int height){
    this.width = width;
    this.height = height;
    GridCreater();
  }

  private void GridCreater(){
    grid = new char[height][width];
    for(int i=0; i<height; i++){
      for(int j=0; j<width; j++){
        grid[i][j] = '-';
      }
    }
  }
  // 0th element = i position
  // 1st element = j position
  public int[] getFirstEmpty(){
    int[] position = new int[2];
    for(int i=0; i<height; i++){
      for(int j=0; j<width; j++){
        if(grid[i][j] == '-'){
          position[0] = i;
          position[1] = j;
          return position;
        }
      }
    }
    position[0] = -1;
    position[1] = -1;
    return position;
  }
  public boolean isFull(){
    boolean check = true;
    int i = 0;
    int j = 0;
    while(i<height){
      while(j<width){
        if(grid[i][j] == '-') return false;
        i++;
        j++;
      }
    }
    return check;
  }
  public boolean isPossible(Pentominoe p, int[] pos){
    boolean check = false;
    int x = pos[1]; //j
    int y = pos[0]; //i
    int k = 0;
    while(p.getValue(0,k) == '-'){
      y--;
      k++;
    }
    if(y<0 || width < (y + p.getWidth()) || height < (x + p.getHeight())) return false; //check if shape goes out of bounds
    for(int i=0; i<p.getHeight();i++){
      for(int j=0; j<p.getWidth();j++){
        if(p.getValue(i,j) != '-' && grid[i][j] == '-') check = true;
        else return false;
      }
    }
    return check;
  }
  public void print(){
    for(int i=0; i<height; i++){
      for(int j=0; j<width; j++){
        System.out.print("["+grid[i][j]+"]");
      }
      System.out.println("");
    }
  }
  public void addPentominoe(Pentominoe p, int[] pos){
    int x = pos[1]; //j
    int y = pos[0]; //i
    int k = 0;
    while(p.getValue(0,k) == '-'){
      y--;
      k++;
    }
    for(int i=0; i<p.getHeight(); i++){
      for(int j=0; j<p.getWidth(); j++){
        if(p.getValue(i,j) != '-') grid[y+i][x+j] = p.getValue(i,j);
      }
    }
  }
  public void removePentominoe(Pentominoe p){
    char x = '-';
    int posX = 0;
    do{
      x = p.getValue(0,posX);
      posX++;
    }while(x == '-');
    int blockCounter = 0;
    for(int i=0; i<p.getHeight(); i++){
      for(int j=0; j<p.getWidth(); j++){
        if(grid[i][j] == x){
          grid[i][j] = '-';
          blockCounter++;
        }
        if(blockCounter == 5) return;
      }
    }
  }
}
