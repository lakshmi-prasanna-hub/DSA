import java.util.*;
public class sort {
    public static int[] frequency(int[] nums){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int num:nums)
            list.add(num);
        Collections.sort(list,(a,b)->
              {
                if(!map.get(a).equals(map.get(b)))
                    return map.get(a)-map.get(b);
                return b-a;
              });
            for(int i=0;i<list.size();i++)
                nums[i]=list.get(i);
            return nums;  
    }
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
            nums[i]=sc.nextInt();
        frequency(nums);
        System.out.println("Elements after sorting");
        for(int i=0;i<n;i++)
            System.out.println(nums[i]+" ");
     }
}
