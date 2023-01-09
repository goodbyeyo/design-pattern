package study.designpattern.creational_patterns.prototype.before;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("Sang-Wook");
        repository.setName("optional-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("optional api method Difference in orElse(), orElseGet()");

        String url = githubIssue.getUrl();
        System.out.println("url = " + url);
    }
}
