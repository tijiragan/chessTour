package chessTourSolution

import com.typesafe.scalalogging.{LazyLogging, Logger}
import utils.{BoardUtils, PointUtils}

import scala.runtime.LazyLong

object tourMain extends  App with LazyLogging {
  val movementArray : Array[(Int, Int)] = Array((0,3), (2,2), (3,0), (2,-2), (0,-3) , (-2,-2), (-3,0), (-2,2)) // N NE E SE S SW W NW
  val boardUtils = new BoardUtils
  val pointUtils = new PointUtils

  val log = Logger("chessTourMain")

  log.info("starting application")

  /**
   * finds and prints possible tours
   * @param boardDimension
   * @param startingPoint
   */
  def findTourAndPrint(boardDimension : Int, startingPoint : (Int,Int)) : Unit = {

    val chessBoard = boardUtils.initializeBoard(boardDimension,startingPoint)

    if(findTour(chessBoard,(startingPoint._1,startingPoint._2),1,boardDimension,movementArray)){
      boardUtils.printBoard(chessBoard)
    } else {
      throw new Exception("No Tours Found")
    }
  }

  val boardDimension = 10 // Dimension
  val startingPoint : (Int, Int) = (5,5) // starting position middle of chess board for sample as per board array index

  if(startingPoint._1 < 0 | startingPoint._2 < 0) throw new Exception("enter a valid starting point")

  findTourAndPrint(boardDimension :Int,startingPoint : (Int,Int))

}



