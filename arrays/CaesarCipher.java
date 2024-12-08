public class CaesarCipher {
  // Encrypt the text using a Caesar cipher
  public static String encrypt(String text, int shift) {
      StringBuilder encrypted = new StringBuilder();
      for (int i = 0; i < text.length(); i++) {
          char c = text.charAt(i);
          if (Character.isLetter(c)) {
              char base = (Character.isLowerCase(c)) ? 'a' : 'A';
              c = (char) ((c - base + shift) % 26 + base);
          }
          encrypted.append(c);
      }
      return encrypted.toString();
  }

  public static void main(String[] args) {
      String message = "THE EAGLE IS IN PLAY; MEET AT JOE'S.";
      int shift = 3;

      // Encrypt the message
      String encryptedMessage = encrypt(message, shift);
      System.out.println("Message: " + message);
      System.out.println("Secret: " + encryptedMessage);
  }
}
