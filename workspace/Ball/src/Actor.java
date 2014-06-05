public abstract class Actor {
	
	double dx, dy, x, y;

	// an actor has an input, physics and graphics component
	private InputComp inComp;
	private PhysicsComp physComp;
	private GraphicsComp grComp;

	Actor (InputComp in = null, PhysicsComp phys, GraphicsComp gr) {
		inComp = in;
		physComp = phys;
		grComp = gr;
	}

	public void update() {
		// input != null when actor is Ball
		if (in != null) {
			// check for input
			// change state according to input
		}
		phys.update(this); // have phys component update position
	}

	public void paint(Graphics gr) {
		// utilize graphics component to paint
		grComp.paint(gr);
	}

}