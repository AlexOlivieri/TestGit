package basicworkflow;

public class MainClass {

	public static void main(String[] args) {
		TestGit myFirstTestGit = new TestGitUpdate("User Changed Parameters");
		System.out.println(myFirstTestGit.returnTheString());
	}
}
