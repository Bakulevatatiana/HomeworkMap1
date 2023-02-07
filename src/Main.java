import java.util.Map;
import java.util.Random;

public class Main {
    private final static Random RANDOM = new Random();

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhone(new FullName("Test", "Test"), "89234768880");
        phoneBook.addPhone(new FullName("Test1", "Test1"), "89234768880");
        while (phoneBook.getEntries().size()<20){
            phoneBook.addPhone(getRandomName(),getPhoneNumbers());
        }
        for(Map.Entry<FullName, String> entry: phoneBook.getEntries()){
            System.out.printf("%s-%s%n",entry.getKey(), entry.getValue());

        }
    }



    public static FullName getRandomName() {
        String name = "Test"+ RANDOM.nextInt(1_000_000);
        String lastName = "TestLast"+ RANDOM.nextInt( 1_000_000);
        return new FullName(name,lastName);

    }
    public static String getPhoneNumbers(){
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i <11; i++) {
            stringBuilder.append(RANDOM.nextInt(1_000_000));
            
        }
        return stringBuilder.toString();
    }


}