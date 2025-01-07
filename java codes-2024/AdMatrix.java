public class AdMatrix {
    public static void main(String[] args) {
        int graph[][]={{0,1,0,0,1},{1,0,1,0,1},{0,1,0,1,0},{0,0,1,0,1},{1,1,0,1,0}};
        for(int i =0;i<graph.length;i++)
        {
            for(int j=0;j<graph.length;j++)
            {

            System.out.println(" adjacent matrix is  "+i+" , "+j+" : "+graph[i][j]);
            }

        }
    }
}
