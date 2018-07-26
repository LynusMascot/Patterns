//Author: Rohit Goswami & Ritik Varshney
// email:  lynus.mascot@gmail.com

/* 
input : a[5]= {3,2,4,5,1}

output: 1:          *
        2:       *  *
        3: *     *  *
        4: *  *  *  *
        5: *  *  *  *  *
*/
public class Main{
    public static void main(String args[]) {
int[] a = new int[]{3,2,4,5,1};
    char[][] ab = new char[10][10];
    int i,k,j,l;
      for(j=0;j<5;j++)
        {
        for(l=5-a[j];l<5;l++)
          {ab[l][j]='*';}
          
    }
    for( i = 0; i<5; i++)
    {
        for( j = 0; j<5; j++)
        {
            System.out.print(ab[i][j]);
            System.out.print('\t');
        }
            System.out.println();
}
}
    }
