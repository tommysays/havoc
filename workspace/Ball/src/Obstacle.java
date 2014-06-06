/**
 * Obstacle describes an attribute of a section that may impede player movement.
 * Ex. Wall, Ceiling, Ememy, Trap, etc.
 * 
 * @author Max
 *
 */

public class Obstacle extends Actor {

	/**
	 * Constructor for Obstacle.
	 * @param in
	 * @param phys
	 * @param gr
	 */
	public Obstacle(InputComp in, PhysicsComp phys, GraphicsComp gr) {
		super(in, phys, gr);
	}
	
}