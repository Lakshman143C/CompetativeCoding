package org.main;

public class PatternsStriver {
    public static void main(String[] args) {
        pattern21(5);
    }

    public static void pattern21(int n){
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(i==0 || i==n-1 || j==0 || j==n-1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern20(int n){
        for(int i=n;i>0;i--){
            for(int j=n;j>=i;j--)
                System.out.print("*");

            for(int j=0;j<(i-1)*2;j++)
                System.out.print(" ");

            for(int j=n;j>=i;j--)
                System.out.print("*");

            System.out.println();
        }
        for(int i=1;i<n;i++){
            for(int j=n;j>i;j--)
                System.out.print("*");
            for(int j=0;j<i*2;j++)
                System.out.print(" ");
            for(int j=n;j>i;j--)
                System.out.print("*");
            System.out.println();
        }

    }

    public static void pattern19(int n){
        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--)
                System.out.print("*");
            for(int j=0;j<i*2;j++)
                System.out.print(" ");
            for(int j=n;j>i;j--)
                System.out.print("*");
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=n;j>=i;j--)
                System.out.print("*");

            for(int j=0;j<(i-1)*2;j++)
                System.out.print(" ");

            for(int j=n;j>=i;j--)
                System.out.print("*");

            System.out.println();
        }
    }

    public static void pattern18(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j<n;j++)
                System.out.print((char) (65+j));
            System.out.println();
        }
    }

    public static void pattern17(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++)
                System.out.print(" ");
            for(int j=0;j<=i-1;j++)
                System.out.print((char) (65+j));

            for(int j=i;j>=0;j--)
                System.out.print((char) (65+j));
            System.out.println();
        }
    }

    public static void pattern16(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(65+i));
            }
            System.out.println();
        }
    }

    public static void pattern15(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print((char)(65+j));
            }
            System.out.println();
        }
    }

    public static void pattern14(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print((char)(65+j));
            }
            System.out.println();
        }
    }

    public static void pattern12(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++)
                System.out.print(j);
            for(int j=0;j<n*2-i*2;j++)
                System.out.print(" ");
            for(int j=i;j>=1;j--)
                System.out.print(j);
            System.out.println();
        }
    }

    public static void pattern13(int n){
        int count=1;
        for (int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(count+++" ");
            }
            System.out.println();
        }
    }

    public static void pattern11(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((j+i)%2==0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }
    public static void pattern10(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=n;i>1;i--) {
            for(int j=1;j<=i-1;j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public void pattern9(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i*2;k++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=0;j<n-i;j++)
                System.out.print(" ");
            for(int k=0;k<i*2-1;k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
