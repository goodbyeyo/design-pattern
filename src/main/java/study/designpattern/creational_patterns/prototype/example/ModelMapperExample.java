package study.designpattern.creational_patterns.prototype.example;

import org.modelmapper.ModelMapper;
import study.designpattern.creational_patterns.prototype.after.GithubIssue;
import study.designpattern.creational_patterns.prototype.after.GithubRepository;

public class ModelMapperExample {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("Foo");
        repository.setName("Optional Study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("orElse() 와 orElseGet() 차이");

        ModelMapper modelMapper = new ModelMapper();
        GithubIssueData githubIssueData = modelMapper.map(githubIssue, GithubIssueData.class);
        System.out.println("githubIssueData = " + githubIssueData);
    }
}
