import java.util.*;
public class LeetTwoSum {
    Scanner s = new Scanner(System.in);
    int result[] = new int[100];

    public int[] twoSum(int[] nums,int target)
    {
        for(int i=0;i<=4;i++)
        nums[i]=s.nextInt();
        
        target=s.nextInt();
        
        for(int i=0;i<=nums.length;i++)
        {
            for(int j=i+1;j<=nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    //result= nums{i}, nums{j};
                }
            }

        }


        
        return result;

    }
}
