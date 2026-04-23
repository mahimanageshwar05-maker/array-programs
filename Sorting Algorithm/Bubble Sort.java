public class Bubble_Sort
{
    public static int[] bubbleSort(int arr[])
    {
        for(int i=0; i<arr.length-1; i++)
        {
            boolean flag = false;
            for(int j=1; j<arr.length-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!flag)
            {
                break;
            }
        }
        return arr;
    }


    public static void main(String[] args)
    {
        int arr[] = {5, 4, 1, 2, 3, 6, 0};
        bubbleSort(arr);
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}
