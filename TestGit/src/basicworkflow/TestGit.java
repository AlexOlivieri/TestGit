package basicworkflow;

public class TestGit {
	
	private String gitFromStart;
	
	public TestGit() {
	}
	
	public TestGit(String parameter) {
		this.gitFromStart = parameter;
	}
	
	public String returnTheString() {
		return this.gitFromStart;
	}
}
