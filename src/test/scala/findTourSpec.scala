package chessTourSolution

import chessTourSolution.utils.{BoardUtils, PointUtils}


class findTourSpec extends BaseSpec {

  val boardUtils = new BoardUtils
  val pointUtils = new PointUtils
  val movementArray : Array[(Int, Int)] = Array((0,3), (2,2), (3,0), (2,-2), (0,-3) , (-2,-2), (-3,0), (-2,2))
  "find tour" should "find solution and break" in {
    the [Exception] thrownBy findTour(boardUtils.initializeBoard(10,(5,5)),(5,5),1,10,movementArray) should have message "tour found"
  }

  "find tour" should "throw invalid dimension Exception" in {
    the [Exception]  thrownBy findTour(boardUtils.initializeBoard(10,(5,5)),(5,5),1,0,movementArray) should have message "board dimension invalid"
  }

}
