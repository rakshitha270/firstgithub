package corejava;
public interface Actor {
void act();
void speak();
default void comedy()
{
	System.out.println("i can make people laugh");
}
}