package utils.chessTourSolution

import org.scalatest.Assertions._
import chessTourSolution.BaseSpec
import chessTourSolution.utils.{BoardUtils, PointUtils}

class UtilSpec extends BaseSpec {

  val boardUtils = new BoardUtils
  val pointUtils = new PointUtils

  "Board utils" should "initialize chessboard" in {
    val board = boardUtils.initializeBoard(4,(0,0))
    assert(board.length == 4)
    assert(board(0)(0) == 1)
  }

  "point utils" should "prevent invalid move" in {
    val board = boardUtils.initializeBoard(4,(0,0))
    val check = pointUtils.checkMove((-1,-1),board, 4)
    assert(check == false)
  }

  "point utils" should "allow invalid move" in {
    val board = boardUtils.initializeBoard(4,(0,0))
    val check = pointUtils.checkMove((1,1),board, 4)
    assert(check == true)
  }


}
