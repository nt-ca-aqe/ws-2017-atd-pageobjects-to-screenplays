package screenplays.base;

public interface Performer {

    <T extends Actor> void performAs(T actor);
}
