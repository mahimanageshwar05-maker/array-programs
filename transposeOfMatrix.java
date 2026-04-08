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
        //print array
        for(int i=0; i<b.length; i++)
        {
            for(int j=0; j<b[0].length; j++)
            {
                System.out.print(b[i][j] +" ");
            }
            System.out.println();
        }
    }
