package chessTourSolution.utils

class BoardUtils {

  def printBoard(board : Array[Array[Int]]) = {
    for(i <- 0 to board.length - 1){
      for(j <- 0 to board.length - 1){
        print(board(i)(j) + "\t")
      }
      println("")
    }
  }

  /**
   * marks all positions with zero
   * @param board
   * @return
   */
  def markAllUnvisited(board : Array[Array[Int]]) : Array[Array[Int]] = {
    for(i <- 0 to board.length - 1){
      for(j <- 0 to board.length - 1 ){
        board(i)(j) = 0 // marks all unvisited with zero
      }
    }
    board
  }

  def initializeBoard (boardDimension : Int, startingPoint : (Int,Int)) : Array[Array[Int]] = {
    var chessBoard =  markAllUnvisited(Array.ofDim(boardDimension,boardDimension))
    chessBoard(startingPoint._1)(startingPoint._2) = 1 //marking the starting point
    chessBoard
  }

}
