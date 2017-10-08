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
  public void print(){
    for(int i=0; i<height; i++){
      for(int j=0; j<width; j++){
        System.out.print("["+grid[i][j]+"]");
      }
      System.out.println("");
    }
  }
  public void addPentominoe(Pentominoe p, int[] position){
    for(int i=0; i<p.getHeight(); i++){
      for(int j=0; j<p.getWidth(); j++){
        grid[position[0]+i][position[1]+j] = p.getValue(i,j);
      }
    }
  }
}
