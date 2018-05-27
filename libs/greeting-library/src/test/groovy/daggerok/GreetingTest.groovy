package daggerok

import spock.lang.Specification

class GreetingTest extends Specification {

  def 'Should create greeting from normal imput'() {
    expect: 'Greeting will be capitalized'
    def greeting = Greetings.create('maksimko', 'happy', 'bingo')
    greeting == 'Hello, Maksimko Happy Bingo!'
  }

  def 'Should create greeting from empty input'() {
    expect: 'Anonymize greeting'
    def emptyGreeting = Greetings.create()
    emptyGreeting == 'Hello, Anonymous!'
  }
}
