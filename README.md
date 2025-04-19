# Final_project

Snakes and Ladder game for two players.

Players write their name and then throw a dice to try
to be the first to the end mark.

## Building

- `src/main/java`:
  - `SlangaController.java`: Handles interaction between the user interface
   and the game logic.
  - `SlangaApplication.java`:Launches the JavaFX application and loads the main
   FXML layout.
  - `Leikmadur.java`: Implementation of a player.
  - `Leikur.java`: Implementation of the game function.
  - `SlongurStigar.java`: Implementation of the snake function and the ladder function.
  - `Teningur.java`: Implementation of a six sided dice.

- `src/test/java`:
  - `LeikmadurTest.java`: A skeleton for a class containing JUnit4 test cases for
  the `Leikmadur` class, containing seven sample test cases.
  - `LeikurTest.java`: A skeleton for a class containing JUnit4 test cases for
   the `Leikur` class, containing five sample test cases.
  - `SlongurStigarTest.java`: A skeleton for a class containing JUnit4 test cases for
   the `SlongurStigar` class, containing three sample test cases.
  - `TeningurTest.java`: A skeleton for a class containing JUnit4 test cases for
   the `Teningur` class, containing one sample test case.


Maven:

- `mvn compile` compiles all implementation classes.
- `mvn test` runs all test cases (i.e. all classes with a name that either starts
with `Test` or ends with `Test`, `Tests`, or `TestCase` -- in our case, this will
match `IntStackTest`).

## License

[MIT License] (LICENSE)
