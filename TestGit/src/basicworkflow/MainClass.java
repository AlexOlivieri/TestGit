package basicworkflow;

public class MainClass {

	public static void main(String[] args) {
		TestGit myFirstTestGit = new TestGitUpdate("My Parameter");
		System.out.println(myFirstTestGit.returnTheString());
	}
}
