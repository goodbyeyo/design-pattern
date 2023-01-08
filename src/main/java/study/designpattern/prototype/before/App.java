package study.designpattern.prototype.before;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("woo");
        repository.setName("optional-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("optional api method Difference in orElse(), orElseGet()");

        String url = githubIssue.getUrl();
        System.out.println("url = " + url);

        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println("url = " + clone.getUrl());

        // GitHubIssue 에 user 를 변경하면 deCopy 가 된다 -> Custom clone 필요
        repository.setUser("foo");

        System.out.println(clone != githubIssue);
        System.out.println(clone.equals(githubIssue));
        System.out.println(clone.getClass() == githubIssue.getClass());
        System.out.println(clone.getRepository() == githubIssue.getRepository());

        System.out.println("url = " + clone.getUrl());
    }



}
