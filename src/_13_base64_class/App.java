package _13_base64_class;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class App {
  public static void main(String[] args) {
    String text = "Lorem ipsusum dolor amet";
    byte[] textBytes = text.getBytes(); // convert to array byte
    Encoder encoder = Base64.getEncoder(); // get encoder
    String encodedString = encoder.encodeToString(textBytes); // encode string
    System.out.println(encodedString); // print output

    Decoder decoder = Base64.getDecoder(); // get decoder
    byte[] byteDecoder = decoder.decode(encodedString); // decode from encoded string
    String decodeString = new String(byteDecoder); // convert to String, with inisiate object with constructor params
                                                   // byte
    System.out.println(decodeString); // print output
    /*
     * Output:
     * TG9yZW0gaXBzdXN1bSBkb2xvciBhbWV0
     * Lorem ipsusum dolor amet
     */
  }
}
