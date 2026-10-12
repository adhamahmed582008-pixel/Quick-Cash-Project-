import java.util.*;
public class Quick_Cash_Project{
    //======================================================================================//
                                    //MAIN PROGRAM//
    //======================================================================================//
public static void main(String[] args) {   
    }

// ==========================================================
//validation 
// ==========================================================
//1) numbers only check 
static boolean isDigitsOnly(String text)
{
    if(text.length()==0)
    {
        return false;
    }
    for(int i =0; i<text.length(); i++)
    {
        if (text.charAt(i) < '0' || text.charAt(i)>'9' )
        {
            return false;
        }
    }
    return true;
}
//2) at least 3 letter check 
static boolean isValidName(String name)
{
    if (name.length()<3){
         return false ; 
    }
        for (int i=0; i<name.length(); i++)
            {
                char character = name.charAt(i);
                boolean isLetter = (character>='a' && character <= 'z') || (character>='A' && character<='Z');
                if (!isLetter && character !=' ')//character dont equal space 
                {
                    return false;
                }
            } 
            return true ;
}
//3) email without spaces with one @ and one . 
static boolean isValidEmail(String email )
{
    if (email.contains(" "))
    {
        return false ; 
    }
    int at = email.indexOf("@"); // place of first @ (at=@)
    int dot = email.lastIndexOf(".");// last place of dot (dot=.)
    return at > 0 && at == email.lastIndexOf("@") && dot >at + 1 && dot < email.length()-1;
    // there are words before @ && there is only one @ && dot is after @ and there are words between them && there are words after dot 
}
//4) phone number is 11 digits and start with 01
static boolean isValidPhone (String Phones)
{
    return phones.length()==11 && isDigitsOnly(Phones) && phones.startWith("01");
}
//5) PASSWORD IS 4 OR MORE LETTERS OR NUMBERS AND DONT CONTAIN ANY SPACES 
static boolean isValidPassword (String Passwords)
{
   return Passwords.length()>=4 && !Passwords.contains(" ");
}
//6) METHOD THAT READ STRING FOR ALL PROGRAM (USE ANY WHERE NEED STRING INPUT )
// message is any question you want to ask 
static String ReadText (String message)
{
    System.out.println(message);
    String line = input.nextLine().trim();
    return line;
}
//7) METHOD THAT READ NUMBERS FOR ALL PROGRAM (USE ANY WHERE NEED NUMBERS INPUT )
// message is any question you want to ask
static int ReadNumber (String message)
{
        System.out.print(message); 
        int number = input.nextInt(); 
        input.nextLine(); 
        return number;
}
}
