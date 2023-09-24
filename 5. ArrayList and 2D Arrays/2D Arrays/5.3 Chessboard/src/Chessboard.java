public class Chessboard
{
   public static void main(String[] args)
   {
      char[][] chessboard = new char[8][8];
      for (int i = 0; i < 8; i++) {
         for (int j = 0; j < 8; j++) {
            // Alternate between black and white squares starting with a white square
            if ((i + j) % 2 == 0) {
               chessboard[i][j] = '\u25A1'; // White square
            } else {
               chessboard[i][j] = '\u25A0'; // Black square
            }
         }
      }

      // Print the chessboard
      for (int i = 0; i < 8; i++) {
         for (int j = 0; j < 8; j++) {
            System.out.print(chessboard[i][j]);
         }
         System.out.println(); // Move to the next row
      }
   }
}
