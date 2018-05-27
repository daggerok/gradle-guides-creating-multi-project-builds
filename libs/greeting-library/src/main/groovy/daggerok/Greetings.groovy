package daggerok

class Greetings {
  static String create(String ...args) {
    def name = args.collect { it.toLowerCase().capitalize() }.join(' ')
    def fullName = name.trim().isEmpty() ? 'Anonymous' : name
    "Hello, $fullName!"
  }
}
