import java.util.Scanner;
public class Main {

        public static void main(String[] args) {

//  Problem 1
             /* Scanner scanner = new Scanner(System.in);
                int peopleCount = 0;

                peopleCount = scanner.nextInt();scanner.nextLine();
                String winner ="", bidder;
                int winnerBid = 0;
                int bid = 0;
                for(int i=1; i<=peopleCount; i++){
                    bidder = scanner.nextLine();
                    bid = scanner.nextInt();scanner.nextLine();

                    if(i==1 || winnerBid<bid){
                        winner = bidder;
                        winnerBid = bid;
                    }
                }

                System.out.println(winner);*/


                //Problem 2


                int num;
                Scanner s = new Scanner(System.in);
                num = s.nextInt();
                String prev = "";
                while (num != 99999) {
                        int x = (num / 1000) % 10 + (num / 10000);
                        if (x == 0) {
                                System.out.println(prev + num % 1000);
                        } else if (x % 2 == 0) {
                                prev = "right ";
                                System.out.println("right " + num % 1000);
                        } else {
                                prev = "left ";
                                System.out.println("left " + num % 1000);
                        }
                        s = new Scanner(System.in);
                        num = s.nextInt();


                }
        }
}


