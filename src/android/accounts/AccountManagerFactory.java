package android.accounts;

/**
 * @author Denis Bogdanas <bogdanad@oregonstate.edu> Created on 8/8/2016.
 */
public class AccountManagerFactory {
    public static AccountManager create() {
        return new AccountManager();
    }
}
