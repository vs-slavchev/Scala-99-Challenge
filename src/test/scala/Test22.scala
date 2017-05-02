import org.scalatest.FunSuite

class Test22 extends FunSuite {

  test("range includes first and last numbers") {
    assert(List(4, 5, 6, 7, 8, 9) == P22.range(4, 9))
  }

  test("range can span negative numbers") {
    assert(List(-2, -1, 0, 1, 2, 3) == P22.range(-2, 3))
  }

  test("range should be a single number") {
    assert(List(1) == P22.range(1, 1))
  }

}
