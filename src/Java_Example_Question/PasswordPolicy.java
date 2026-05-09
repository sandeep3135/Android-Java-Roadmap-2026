package Java_Example_Question;

// Password Validator to check if a password is "Strong" or "Weak"

public class PasswordPolicy {

    public void isStrong(String password){
        boolean hasMinLength = false;
        boolean hasSpecialChar = false;

        if (password.length() >= 8){   // To Check length once, 8 characters
            hasMinLength =true;
        }
        for (int i = 0; i < password.length(); i++) {    // loop for special char
            char c = password.charAt(i);   // Check/Look at one letter at a time
            if (c == '@' || c == '#'){
                hasSpecialChar = true;
                break;
            }
        }
        if (hasMinLength && hasSpecialChar){      // if both condition true
            System.out.println("Strong Password: " +password);
        } else {
            System.out.println("Weak Password: " +password);
        }

    }


    public static void main(String[] args) {
        PasswordPolicy myPol = new PasswordPolicy();

        myPol.isStrong("sna@deep");
        myPol.isStrong("sandeep@123");
        myPol.isStrong("sna@");
        myPol.isStrong("sandeep123");

    }
}
