package basicworkflow;

public class MainClass {

	public static void main(String[] args) {
		TestGit myFirstTestGit = new TestGitUpdate("My New Parameter");
		System.out.println(myFirstTestGit.returnTheString());
	}
}
