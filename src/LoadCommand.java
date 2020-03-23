
public class LoadCommand implements Command {
	
	private Document doc;
	
	public LoadCommand(Document doc){
		this.doc = doc;
	}
	
	public void execute() {
		System.out.println("Document " + doc.name() + " is loading into view.");
	}
}
