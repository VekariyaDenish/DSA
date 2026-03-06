package String;

//1108. Defanging an IP Address

public class DefanginganIPAddress {
    public static void main(String[] args) {
        String address = "1.1.1.1";

        System.out.println(defangIPaddr(address));

    }
    static String defangIPaddr(String address) {
        String Ip = address.replace("." , "[.]");
        return Ip;
    }
}
