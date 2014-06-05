/**
 * Actor is the abstract base class for all update-able game objects.
 * 
 * @author maxchiang
 *
 */
public abstract class Actor {
	double dx, dy, x, y;

	private InputComp inComp;
	private PhysicsComp physComp;
	private GraphicsComp grComp;

	/**
	 * Class constructor.
	 * 
	 * @param in  Specifies the InputComp for the Actor
	 * @param phys  Specifies the PhysicsComp for the Actor
	 * @param gr  Specifies the GraphicsComp for the Actor
	 */
	public Actor(InputComp in, PhysicsComp phys, GraphicsComp gr) {
		inComp = in;
		physComp = phys;
		grComp = gr;
	}

	/**
	 * The method used to update the Actor's position in game.
	 */
	public void update() {
		// input != null when actor is Ball
		if (inComp != null) {
			// check for input
			// change state according to input
		}
		physComp.update(this); // have phys component update position
	}

	/**
	 * The method used to paint the Actor to the screen.
	 * @param gr
	 */
	public void paint(Graphics gr) {
		// utilize graphics component to paint
		grComp.paint(gr);
	}

}