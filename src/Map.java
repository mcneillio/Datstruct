public class Map{
    private final int[][] map = {{0,0,3,0,4},{0,0,1,0,1},{2,0,1,0,1},{1,1,1,1,1},{0,0,-1,0,0}};
    public Map(){
        return;
    }

    public int getDungeonRoom(int x, int y){
        return map[x][y];
    }

}