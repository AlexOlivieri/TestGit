package basicworkflow;

public class MainClass {

	public static void main(String[] args) {

		TestGit myFirstTestGit = new TestGitUpdate("Owner Changed Parameters");

		System.out.println(myFirstTestGit.returnTheString());
	}
}
