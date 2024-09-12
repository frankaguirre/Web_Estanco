/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordChecker {

    private static final String PWNED_API_URL = "https://api.pwnedpasswords.com/range/";

    public static boolean isPasswordPwned(String password) throws NoSuchAlgorithmException, IOException {
        String hash = sha1Hash(password);
        String prefix = hash.substring(0, 5);
        String suffix = hash.substring(5).toUpperCase();

        String response = getPwnedPasswords(prefix);
        return response.contains(suffix);
    }

    private static String sha1Hash(String password) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-1");
        byte[] hashBytes = digest.digest(password.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hashBytes) {
            sb.append(String.format("%02X", b));
        }
        return sb.toString();
    }

    private static String getPwnedPasswords(String prefix) throws IOException {
        URL url = new URL(PWNED_API_URL + prefix);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line).append("\n");
        }
        reader.close();
        return response.toString();
    }
}
