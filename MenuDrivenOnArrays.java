/*import java.util.*;

class FindEl
{
    public String findEl(int arr[],int val)
    {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==val)
            {   
                c+=1;
            }
        }
        if(c!=0)
            return "Element Present";
        else
            return "not foung";
    }
    
}  

class FindLargest
{
    public int findLargest(int arr[])
    {
        
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;   
    }
}

//Sorting class
class SortArray
{
    public String sort(int arr[])
    {
        System.out.println("Original Array: "+arr);
        for(int i: arr)
        {
            System.out.print(i+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.println("Sorted Array: ");
        String str="";
        for(int i:arr)
        {
            str=str+i+" ";
        }
        return str;
        

    }
}

class RemoveDupliate
{
    static int removeDuplicates(int arr[])
    {
        int n=arr.length;
        if (n == 0 || n == 1)
            return n;
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++)
            if (arr[i] != arr[i + 1])
                temp[j++] = arr[i];
        temp[j++] = arr[n - 1];
        for (int i = 0; i < j; i++)
            arr[i] = temp[i];
 
        return j;
    }
    public static void main(String[] args)
    {
        int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5, 5 };
        int nt = arr.length;
 
        nt = removeDuplicates(arr);
 
        // Print updated array
        for (int i = 0; i < nt; i++)
            System.out.print(arr[i] + " ");
    }
 
    
}


public class MenuDrivenOnArrays
{
    public static void main(String args[])
    {
        FindLargest a=new FindLargest();
        int arr[]={65,21,45,87,65,32,98,45,1,5,8,6,4,7,2};
        System.out.println(a.findLargest(arr));
        
        FindEl n=new FindEl();
        System.out.println(n.findEl(arr, 5));
        
        SortArray s=new SortArray();
        System.out.println(s.sort(arr));

        RemoveDupliate rd=new RemoveDupliate();
        rd.removeDuplicates(arr);
        int a = arr.length;
 
        a = removeDuplicates(arr);
 
        // Print updated array
        for (int i = 0; i < a; i++)
            System.out.print(arr[i] + " ");
    }

}*/