package chessTourSolution

import com.typesafe.scalalogging.{LazyLogging, Logger}
import utils.{BoardUtils, PointUtils}

object findTour extends LazyLogging{
  val log = Logger("chessTour")

  /**
   * Main tour object using recursion and a criteria to find the solution
   * Uses Warnsdorff's rule
   * 1. Start from position and mark it visited.
   * 2. Find all possible moves based on movement constraints
   * 3. Move to the position with least number of subsequent possible moves
   * 4. Repeat the process until all positions are visited
   *
   * @param board - chess board
   * @param currentPos - current postion visited
   * @param currentMoveNumber - latest move number
   * @return
   */



  def apply(board : Array[Array[Int]], currentPos : Tuple2[Int,Int], currentMoveNumber :Int,boardDimension : Int,movementArray : Array[(Int,Int)]) : Boolean = {

    val boardUtils = new BoardUtils
    val pointUtils = new PointUtils
    if(boardDimension < 3 ){
      throw new Exception("board dimension invalid")
    }
    if (currentMoveNumber == (boardDimension * boardDimension)){
      log.info("Found Tour")
      boardUtils.printBoard(board)
      throw new Exception("tour found")
    } else {
      val moveSortedByLeastForwardOptions = pointUtils.validMoveArray(movementArray,currentPos,board,boardDimension)
        .sortBy(pointUtils.validMoveArray(movementArray,_,board,boardDimension).length) // using Warnsdorff rule

      for((x,y) <- moveSortedByLeastForwardOptions){
        board(x)(y) = currentMoveNumber + 1
        if(findTour(board,(x,y),currentMoveNumber + 1,boardDimension,movementArray)){
          true
        }
        board(x)(y) = 0
      }
    }
    false

  }
}
