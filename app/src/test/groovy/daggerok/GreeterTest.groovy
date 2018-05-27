package daggerok

import spock.lang.Specification

class GreeterTest extends Specification {

  def 'Main application output should properly process greeting'() {
    setup: 'Pipe stdout to capture buffer'
    def buffer = new ByteArrayOutputStream()
    System.out = new PrintStream(buffer)

    when: 'Input parameters was passed to main application entry point'
    Greeter.main('ololo', 'trololo')

    then: 'Expected greeting was produced'
    buffer.toString() == 'Hello, Ololo Trololo!\n'//.denormalize()
  }
}
