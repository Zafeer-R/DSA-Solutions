package DSASolutions;

public class DefangingIPAddress {
    // LeetCode problem 1108 - https://leetcode.com/problems/defanging-an-ip-address/
    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
    static String defangIPaddr(String address) { // This solution method gives a runtime of 5ms
        String ipAddress = new String();
        for (int i = 0; i < address.length(); i++) {
            if(address.charAt(i) == '.') {
                ipAddress = ipAddress + "[.]";
            }
            ipAddress = ipAddress + address.charAt(i);
        }
        return ipAddress;
    }

    // Alternte Solution from leetCode discussion   // This method gives a runtime of 0ms
    // static String defangIPaddr(String address) {
    //     return address.replace(".","[.]");
    // }
}
