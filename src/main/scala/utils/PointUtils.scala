package chessTourSolution.utils

class PointUtils {
  /**
   * check for valid moves with board dimensions and already visisted points
   * @param pos
   * @param board
   * @param boardDimension
   * @return
   */
  def checkMove(pos : (Int,Int),board : Array[Array[Int]], boardDimension : Int): Boolean ={
    if(pos._1 >= 0 && pos._2 >=0 && pos._1 <=boardDimension - 1 && pos._2 <=boardDimension -1 && board(pos._1)(pos._2) == 0){
      true
    }else false
  }

  /**
  * returns a list of possible moves from a position
  */
  def validMoveArray(
                      movementArray : Array[(Int,Int)],
                     pos: (Int,Int),board: Array[Array[Int]],
                     boardDimension:Int) : Array[(Int,Int)]  =
    movementArray.map(z => (pos._1 + z._1, pos._2 + z._2)).filter(checkMove(_,board,boardDimension))
}
