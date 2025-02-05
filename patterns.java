'''
4 basic rules for patterns
1- Outer loop determines the number of lines (i) row 
2- Inner loop focus on the columns, connect them somehow to the rows
3- Print the '*'
4- observe symmetry
****
****
****
****'''
class patterns {
    public static void main(String[] args) {
        int n=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
'''
*
**
***
****'''
class patterns {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
'''
****
***
**
*'''
  class patterns {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
'''
1
12
123
1234'''
  class patterns {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
'''
1
22
333
4444
'''
  class patterns {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
'''
1234
123
12
1'''
class patterns {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
'''
12345
1234
123
12
1'''
  class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
'''
     *     
    ***    
   *****   
  *******  
 ********* '''
class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(' ');
            }
            for(int j=1;j<2*i;j++){
                System.out.print('*');
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
'''
 ********** 
  ********  
   ******   
    ****    
     **   '''
class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(' ');
            }
            for(int j=1;j<=2*(n-i+1);j++){
                System.out.print('*');
            }
            for(int j=1;j<=i;j++){
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
'''
     *     
    ***    
   *****   
  *******  
 ********* 
 ********* 
  *******  
   *****   
    ***    
     *   '''
class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(' ');
            }
            for(int j=1;j<2*(i);j++){
                System.out.print('*');
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print(' ');
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(' ');
            }
            for(int j=1;j<2*(n-i+1);j++){
                System.out.print('*');
            }
            for(int j=1;j<=i;j++){
                System.out.print(' ');
            }
            System.out.println();
        }
        
    }
}
'''
1        1
12      12
123    123
1234  1234
1234512345'''
  class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<2*(n-i+1)-1;j++){
                System.out.print(' ');
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
'''
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 '''
class Main {
    public static void main(String[] args) {
        int n=5;
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count=count+1;
            }
            System.out.println();
        }
    }
}
'''
1
01
101
0101
10101'''
class Main {
    public static void main(String[] args) {
        int n=5;
        int start=1;
        for(int i=0;i<n;i++){
            if(i%2==0) start=1;
            else start=0;
            for(int j=0;j<=i;j++){
                System.out.print(start +"");
                start=1-start;
            }
            System.out.println();
        }
    }
}
'''
A 
A B 
A B C 
A B C D 
A B C D E '''
class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(char ch='A'; ch<='A'+i;ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
'''
A B C D E 
A B C D 
A B C 
A B 
A 
'''
class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(char ch='A'; ch<'A'+(n-i);ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
'''
A 
B B 
C C C 
D D D D 
E E E E E '''
class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            char ch= (char)('A'+i);
            for(int j=0;j<=i;j++){
                System.out.print(ch +" ");
            }
            System.out.println();
        }
    }
}
'''
      A      
     ABA     
    ABCBA    
   ABCDCBA   
  ABCDEDCBA  '''
class Main {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i+1;j++){
                System.out.print(' ');
            }
            char ch = 'A';
          int breakpoint = (2*i+1)/2;
          for(int j=1;j<=2*i+1;j++){
              
              System.out.print(ch);
              if(j <= breakpoint) ch++;
              else ch--;
          }
            for(int j=0;j<n-i+1;j++){
                System.out.print(' ');
            }
            
            System.out.println();
        }
    }
}

