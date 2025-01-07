import java.util.ArrayList;

public class AdList {
    ArrayList<ArrayList<Integer>> adjlist = new ArrayList<>();

   

    AdList(int v)
    {
        for(int i =0;i<v;i++)
       {
        adjlist.add(new ArrayList<Integer>());
       } 
    }

    public void addedges(int u, int v)
    {
        adjlist.get(u).add(v);
        adjlist.get(v).add(u);
    }

    public void printAdlist()
    {
        for(int i=0;i<adjlist.size();i++)
        {
            System.out.println("adlist of vertex : "+i);
            for(int j=0;j<adjlist.get(i).size();j++)
            {
                System.out.println(" "+adjlist.get(i).get(j));
            }
        }
    }

    public static void main(String[] args) {
        AdList ad = new AdList(5);
        ad.addedges(0,1);
        ad.addedges(2,3);   


        ad.printAdlist();
    }
}
