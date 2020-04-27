import java.util.Scanner;
public class Linear_Search
{
    public static void main(String[] args)
    {
        int arr[] = { 10,15,34,56,7,9,2,8,12,1};
        int item;
        int flag = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element:");
        item = sc.nextInt();
        for(int i = 0;i<10;i++)
        {
            if(arr[i] == item)
            {
                flag = i+1;
                break;
            }
            else{
                flag = 0;
            }
        }
        if(flag!=0)
        {
            System.out.println("Item is found in the project at location  "  + flag);
        }
        else{
            System.out.println("Item not found");
            }
    }
}
