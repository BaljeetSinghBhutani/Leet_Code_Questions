package Contest_Question;

public class determine_the_winning_of_bowling_game {
    public static int isWinner(int[] player1, int[] player2) {
       int p1sc = 0;
       int p2sc = 0;

       int i = 0;
      while (i<player1.length)
      {
          p1sc+=player1[i];
          if(i-1 >=0 && player1[i-1]==10)
          {
              int count = i;
              p1sc-=player1[i];

             while(count<i+2 &&  count<player1.length){
                 p1sc+=(2 * player1[count]);
                 count++;
             }

             i =  count-1;

          }

          i++;
      }
        System.out.println(p1sc);

  int i1 = 0;
      while (i1<player2.length)
      {
          p2sc+=player2[i1];
          if(i1-1 >=0 && player2[i1-1]==10)
          {
              int count = i1;
              p2sc-=player2[i1];

             while(count<i1+2 &&  count<player2.length){
                 p2sc+=(2 * player2[count]);
                 count++;
             }

             i1 =  count-1;
          }

          i1++;
      }

        System.out.println(p2sc);
if(p1sc>p2sc)
{
    return 1;
}
else if (p1sc<p2sc)
{
    return 2;
}

    return 0;


    }
    public static void main(String[] args) {
        int player1[] = {10, 2, 2, 3};
        int player2 [] = {3, 8, 4, 5};


int ans = isWinner(player1, player2);
        System.out.println(ans);

    }
}
