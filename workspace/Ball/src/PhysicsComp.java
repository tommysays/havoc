/**
 * PhysicsComp is an abstract base class that handles updates to an actor's 
 * position in game.
 * 
 * @author Max
 *
 */

public abstract class PhysicsComp {
	/**
	 * Updates the actor's position.
	 * 
	 * @param actor The actor to update.
	 */
	public abstract void update(Actor actor);
}