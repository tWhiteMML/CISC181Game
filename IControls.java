package g.cisc181.game;

/*
Ryan Petery and Tommy White
5/14/18
This interface allows the Game class to work separately from control implementation. By providing
generic control methods, the game logic can run without considering how input will occur.
 */

public interface IControls {

    String getInput();

    void setInput(String newInput);

    String move();

    boolean fire();
}
