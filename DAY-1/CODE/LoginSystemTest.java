package ET;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginSystemTest {

    @Test
    public void testValidLogin() {
        assertEquals("Login Successful", LoginSystem.login("user1", "password123"));
    }

    @Test
    public void testInvalidPassword() {
        assertEquals("Invalid Credentials", LoginSystem.login("user1", "wrongPass"));
    }

    @Test
    public void testInvalidUsername() {
        assertEquals("Invalid Credentials", LoginSystem.login("unknownUser", "password123"));
    }

    @Test
    public void testEmptyUsername() {
        assertEquals("Username and password required", LoginSystem.login("", "password123"));
    }

    @Test
    public void testEmptyPassword() {
        assertEquals("Username and password required", LoginSystem.login("user1", ""));
    }

    @Test
    public void testAccountLockAfterThreeFailedAttempts() {
        LoginSystem.login("user1", "wrongPass");
        LoginSystem.login("user1", "wrongPass");
        LoginSystem.login("user1", "wrongPass");
        assertEquals("Account Locked", LoginSystem.login("user1", "password123"));
    }
    @Test
    public void testSuccessfulLoginAfterAccountLock() {
        LoginSystem.login("user1", "wrongPass");
        LoginSystem.login("user1", "wrongPass");
        LoginSystem.login("user1", "wrongPass");
        assertEquals("Login Successful", LoginSystem.login("user1", "password123"));
        assertEquals("Account Locked", LoginSystem.login("user1", "password123"));
    }
}
