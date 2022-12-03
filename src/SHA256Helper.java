import java.security.MessageDigest;

public class SHA256Helper {

    public static String generateHash(String data) {

        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            byte[] hash = digest.digest(data.getBytes("UTF-8"));

            // Convert Byte to Hexa
            StringBuffer hexadecimalString = new StringBuffer();

            for (int i = 0; i < hash.length; i++) {
                String hexadecimal = Integer.toHexString(0xff & hash[i]);

                // Padding 64 char
                if (hexadecimal.length() == 1) {
                    hexadecimalString.append('0');
                }

                hexadecimalString.append(hexadecimal);
            }

            return hexadecimalString.toString();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
