    public static int[][] transposeOfMatrix(int a[][])
    {
        int row = a.length; //2
        int col = a[0].length; //3

        int b[][] = new int[col][row];
        for(int i=0; i<b.length; i++)
        {
            for(int j=0; j<b[0].length; j++ )
            {
                b[i][j] = a[j][i];
            }
        }
        return b;
    }

    public static void main(String args[])
    {
          int a[][] = {{1,2,3}, {4,5,6}};
          int ans[][] = transposeOfMatrix(a);  
          for(int i=0; i<ans.length; i++)
          {
              for(int j=0; j<ans[0].length; j++)
              {
                 System.out.print(ans[i][j] +" ");
              }
            System.out.println();
        }       
    }
