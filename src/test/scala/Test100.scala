import org.scalatest.FunSuite

class Test100 extends FunSuite {

  test("open close should be balanced") {
    assert(P100.isBalanced("()"))
  }

  test("empty string should be balanced") {
    assert(P100.isBalanced(""))
  }

  test("closing before opening should not be balanced") {
    assert( ! P100.isBalanced(")("))
  }

  test("closing more than opening should not be balanced") {
    assert( ! P100.isBalanced("())))"))
  }

  test("opening more than closing should not be balanced") {
    assert( ! P100.isBalanced("(((()"))
  }

  test("closing 2 should not be balanced") {
    assert( ! P100.isBalanced("))"))
  }

  test("opening 2 should not be balanced") {
    assert( ! P100.isBalanced("(("))
  }

  test("only opening should not be balanced") {
    assert( ! P100.isBalanced("("))
  }

  test("only closing should not be balanced") {
    assert( ! P100.isBalanced(")"))
  }
}
