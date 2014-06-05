/**
 * The Ball class represents the player character in game.
 * 
 * @author maxchiang
 *
 */

public class Ball extends Actor {

	/**
	 * The constructor for Ball.
	 * @param in
	 * @param phys
	 * @param gr
	 */
	public Ball(InputComp in, PhysicsComp phys, GraphicsComp gr) {
		super(in, phys, gr);
	}

	/**
	 * This method enables a rolling ball character to jump in game.
	 * 
	 * @param duration  The duration specifies the power of the jump.
	 */
	public void jump(int duration) {
		// do something
	}

	
	/**
	 * This method enables a rolling ball character to increase speed
	 * for a short period of time.
	 */
	public void activeRoll() {
		// roll actively
	}
}