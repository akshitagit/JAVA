import java.util.*;
public class Wigglewalk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        for(int i = 1;i<=n;i++){
            int n1=scan.nextInt();int r=scan.nextInt();int c=scan.nextInt();int sr=scan.nextInt();int sc=scan.nextInt();scan.nextLine();String command;
            List<List<Integer>> lists = new ArrayList<>();
            r=sr;c=sc;
            lists.add(List.of(r, c));
            String tot_command=scan.nextLine();
            for(int k=0;k<n1;k++){
                command=Character.toString(tot_command.charAt(k));
                if(command.equals("N")){
                    r=r-1;
                }else if(command.equals("S")){
                    r=r+1;
                }else if(command.equals("W")){
                    c=c-1;
                }else if(command.equals("E")){
                    c=c+1;
                }
                while(true){
                    if(lists.contains(List.of(r, c))){
                        if(command.equals("N")){
                            r=r-1;
                        }else if(command.equals("S")){
                            r=r+1;
                        }else if(command.equals("W")){
                            c=c-1;
                        }else if(command.equals("E")){
                            c=c+1;
                        }
                    }else{break;}
                }
                lists.add(List.of(r, c));
                
            }
            //lists.forEach(System.out::println);
            System.out.println("Case #"+i+": "+r+" "+c);
        }scan.close();
    }
}
/*
I/P:  3
      5 3 6 2 3 
      EEWNS
      4 3 3 1 1
      SESE
      11 5 8 3 4
      NEESSWWNESE

O/P:  Case #1: 3 2
      Case #2: 3 3
      Case #3: 3 7

 */
