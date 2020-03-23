public class Document {

	public Document(String name) {
		System.out.println("Document named " + name + " is created");
	}
	
	public void load() {
		System.out.println("document " + name + " is loaded into view");
	}
	
	public void save() {
		System.out.println("document " + name + " is being saved...");
	}
	
	public void spellCheck() {
		System.out.println("document " + name + " is being checked for spelling errors");
	}

	public void print() {
		System.out.println("document " + name + " is printing...");
	}
	
}
		
