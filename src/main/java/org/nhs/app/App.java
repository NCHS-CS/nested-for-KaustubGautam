/*public class App{
    //Practice 1
    public static void main(String args[]){
        int z=1;
        for (int x=1; x<=5;x++){
            for (int y=1; y<=z;y++){
                System.out.print(x);
            }
            System.out.println();
            z+=1;

        }
        }
    }*/
    /*public class App{
    for (int x=1; x<=5;x++){
        for (int y=1; y<=4;y++){
            System.out.print(x);
        }
        System.out.println();
    }
    }
}*/

/*public class App{
    //Practice 2
    public static void main(String args[]){
        int z=1;
        for (int x=1; x<=5;x++){
            for(int dot=5-z; dot>=1; dot--){
                System.out.print(".");
            
            }
            for (int y=1; y<=z;y++){
                System.out.print(x);
            }
            z+=1;
            
          
            System.out.println();
        }
        }
    }*/
//Practice problem three
public class App{
    public static void main(String args[]){
        for(int line = 1; line <=5;line++){
           for(int dot1=5-line; dot1>0;dot1--)
           System.out.print(".");    
           System.out.print(line);
        
        for(int dot2=0; dot2<line-1;dot2++)
           System.out.print(".");
           System.out.println();}
     
    }
}