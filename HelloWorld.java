public class HelloWorld{

    public final static int MINNUM = 1 ;
    public final static int MAXNUM = 9 ;
    
    public static void mulTableShow(){
        /*
         * show the multiplication table form MINNUM to MAXNUM
         */
        int i = 0 ;
        int j = 0 ;
        for(i = MINNUM ;i<=MAXNUM;i++){
            for(j=MINNUM;j<=i;j++){
                System.out.print(i+" * "+j+" = "+i*j+"  ");
            }
            System.out.println();
        }
    }
    
    int[][] array = new int[20][20];
    public int circleSetValue(int indexNum,int line,int n){
        /*
         * set value for a circle
         */
        int i = 0;
        int index = line - 1 ;
        for(i=0;i<n;i++){
            array[index][i+index]     = indexNum + i;
            array[i+index][n-1+index] = indexNum + n-1 +i;
            array[n-1+index][i+index] = indexNum + 3*(n-1) -i;
            array[i+index][index]     = indexNum + 4*(n-1) -i;
        }
        
        /*
         initial array[index][index]
         */
        array[index][index] = indexNum ;
        
        return (indexNum + 4*(n-1));
        
    }
    public void matrixShow(int n){
        
        if( n<0 )
            return;
        
        int indexNum = 1 ;
        int line     = 1 ;
        int scope    = n ;
        
        while(n>0){
            indexNum = circleSetValue(indexNum,line,n);
            line++;
            n-=2;
        }
        
        /*printf the array*/
        int i = 0 ;
        int j = 0 ;
        for(i = 0;i <scope;i++){
            for(j=0;j<scope;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        
    
    }
    public static void main(String args[]){
        
        HelloWorld test = new HelloWorld();
        
        //test.mulTableShow();
        test.matrixShow(7);
        
    }
    
    

}

