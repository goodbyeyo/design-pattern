package study.designpattern.structural_patterns.adapter.after;

import study.designpattern.structural_patterns.adapter.after.security.UserDetails;
import study.designpattern.structural_patterns.adapter.after.security.UserDetailsService;

public class AccountUserDetailService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
