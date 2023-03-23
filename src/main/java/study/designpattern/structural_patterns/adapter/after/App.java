package study.designpattern.structural_patterns.adapter.after;

import study.designpattern.structural_patterns.adapter.after.security.LoginHandler;
import study.designpattern.structural_patterns.adapter.after.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("sangwook", "hwang");
        System.out.println("login = " + login);
    }
}
