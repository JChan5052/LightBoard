public class LightBoard
{

private boolean[][] lights;

public LightBoard(int numRows, int numCols){
boolean[][] ret=new boolean[numRows][numCols];
for (int rows=0;rows<ret.length;rows++){
    for (int cols=0;cols<ret[0].length;cols++){
     if ((int)(Math.random()*10)+1>=6){
      ret[rows][cols]=true;
     }
    }
}
lights=ret;
}

public boolean evaluateLight(int row, int col){
 int check=0;
if (lights[row-1][col-1]){
for (int i=0;i<lights.length;i++){
if (lights[i][col-1]) check++;
}
return (!(check%2==0));
}
for (int i=0;i<lights.length;i++){
    if (lights[i][col-1]) check++;
}
  return ((check%3==0));


}

public String toString(){
    String ret="";
    for (int rows=0;rows<lights.length;rows++){
        for (int cols=0;cols<lights[0].length;cols++){
          ret+=lights[rows][cols]+" ";
        }
        ret+="\n";
    }
return ret;
}
}