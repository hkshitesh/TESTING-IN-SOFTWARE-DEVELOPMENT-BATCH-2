package ET;

import java.util.HashMap;

public class LoginSystem {
    private static HashMap<String, String> users = new HashMap<>();
    private static HashMap<String, Integer> failedAttempts = new HashMap<>();

    static {
        users.put("user1", "password123");
        users.put("admin", "adminPass");
    }

    public static String login(String username, String password) {
        if (username.isEmpty() || password.isEmpty()) {
            return "Username and password required";
        }

        if (!users.containsKey(username)) {
            return "Invalid Credentials";
        }

        if (failedAttempts.getOrDefault(username, 0) >= 3) {
            return "Account Locked";
        }

        if (!users.get(username).equals(password)) {
            failedAttempts.put(username, failedAttempts.getOrDefault(username, 0) + 1);
            return "Invalid Credentials";
        }

        failedAttempts.put(username, 0); // Reset failed attempts on success
        return "Login Successful";
    }
}
