import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe 
{
  static Scanner input = new Scanner(System.in);
  
  public static void main(String[] args) 
  {
    System.out.println("------------------------------------------------------------");
    System.out.println("Let's play tic tac toe");
    char[][] board = 
    {
      {'_','_','_'},
      {'_','_','_'},
      {'_','_','_'}
    };
    printBoard(board);

    for(int i = 0; i < 9; i++)
    {
  
      if(i % 2 == 0)
      {
        System.out.println("Turn: X");
        int[] spot = askUser(board);
        board[spot[0]][spot[1]] = 'X';
      }
      else
      {
        System.out.println("Turn: O");
        int[] spot = askUser(board);
        board[spot[0]][spot[1]] = 'O';
      }
      printBoard(board);
      int count = checkWin(board);
      if(count == 3)
      {
        System.out.println("X wins!!");
        break;
      }
      else if(count == -3)
      {
        System.out.println("O wins!!");
        break;
      }
    }
    
  }
 
  public static int[] askUser(char[][] board)
  {
    System.out.print(" - pick the row and column:");
    int row = input.nextInt();
    int element = input.nextInt();

    while(board[row][element] == 'X' || board[row][element] == 'O')
    {
      System.out.print("Spot taken, try again: ");
      row = input.nextInt();
      element = input.nextInt();
    }

    return new int[] {row, element};
    
  }
  public static void printBoard(char[][] board)
  {
    System.out.println("\n");
    for(int i = 0; i < board.length; i++)
    {
      for(int j = 0; j < board[i].length; j++)
      {
        System.out.print("\t" + board[i][j] + " ");
      }
      System.out.println("\n");
    }
  }
  /**
 * Function name - checkWin <-------
 * @param board (char[][])
 * @return count (int)
 *
 * Inside the function:
 *   1. Make a count variable that starts at 0.
 *   2. Check every row for a straight X/O  (Task 7)
 *   3. Check every column for a straight X/O  (Task 8)
 *   4. Check the left diagonal for a straight X/O  (Task 9).
 *   5. Check the right diagonal for a straight X/O  (Task 10).
 */
  public static int checkWin(char[][] board)
  {

    int count = 0;
    for(int i = 0; i < board.length; i++)
    {
      for(int j = 0; j < board[i].length; j++)
      {
        if(board[i][j] == 'X')
        {
          count++;
        }
        else if (board[i][j] == 'O')
        {
          count--;
        }
      }
      if(count == 3 || count == -3)
      {
        return count;
      }
      else
      {
        count = 0;
      }
    }
    for(int i = 0; i < 3; i++)
    {
      for(int j = 0; j < board.length; j++)
      {
        if(board[i][j] == 'X')
        {
          count++;
        }
        else if(board[i][j] == 'O')
        {
          count--;
        }
      }
      if(count == 3 || count == -3)
      {
        return count;
      }
      else
      {
        count = 0;
      }
    }

    for(int i = 0; i < 3; i++)
    {
      if(board[i][i] == 'X')
      {
        count++;
      }
      else if (board[i][i] == 'O')
      {
        count--;
      }
    }
    if(count == 3 || count == -3)
    {
      return count;
    }
    else
    {
      count = 0;
    }
    for(int i = 0; i < 3; i++)
    {
      int rowIndex = 2 - i;
      if(board[rowIndex][i] == 'X')
      {
        count++;
      }
      else if(board[rowIndex][i] == 'O')
      {
        count--;
      }
    }
    
    return count;
  }
}