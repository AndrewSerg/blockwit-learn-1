import com.blockwit.learn1.AndrewSerg.Helper;

public class Tu11 {
    public static void main(String[] args) {
        int[] number = {12, 7, 89, -4, 8, 9};
        Helper helper = new Helper();
        Utils utils = new Utils();
        helper.printIntArray(number);
        utils.Sort(number);
        helper.printIntArray(number);

    }
}


