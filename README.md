###A Piece’s Tour
The objective is to write a program that finds at least one
tour for a chess piece on a 10-by-10 chessboard. A tour is
a path for a piece to visit all tiles on the board, following a
set of rules for movement. Assume the piece can start in
any tile.

The four rules of movement for the piece are:

a) The piece can move 3 spaces either North, East, South,
or West.

b) The piece can move 2 spaces diagonally: Northeast,
Southeast, Southwest, or Northwest.

c) Each space can only be visited once.

The general idea is to start with an initial position and move to possible next positions based on some criteria recursively until a tour solution is obtained.

Since there are multiple possible tour variations, the program prints the tour and exits out of recursion with an exception 

The solution uses Warnsdoff's Rule for solving the tour efficiently. This rule uses the move with the lowest accessibility index of the next possible moves. Accessibility index refers to the number of possible moves from a particular position.

For more details refer http://warnsdorff.com/. 



This project uses scala and sbt

To compile -> sbt compile

To run -> sbt run

To test -> sbt test