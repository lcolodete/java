
/**
 * Singleton thread-safe with Double-Checked Locking
 */
public class VisitorTicketTracker {

	private VisitorTicketTracker() {
	}
	
	private static volatile VisitorTicketTracker instance;
	
	public static VisitorTicketTracker getInstance() {
		if (instance == null) {
			synchronized(VisitorTicketTracker.class) {
				if (instance == null) {
					instance = new VisitorTicketTracker();
				}
			}
		}
		return instance;
	}
}
