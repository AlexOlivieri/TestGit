package basicworkflow;

public class TestGit {
	
	private String gitFromScratch;
	
	public TestGit() {
	}
	
	public TestGit(String parameter) {
		this.gitFromScratch = parameter;
	}
	
	public String returnTheString() {
		return this.gitFromScratch;
	}
}
