import java.util.Scanner;

class Result {

    public static void calculateVaccDriveList(String adharNumber, String DOB, String comorbidity) {
        // Validate Adhar Number
        if (!isValidAdharNumber(adharNumber)) {
            System.out.println("Invalid adhar number");
            return;
        }

        // Validate Date of Birth
        if (!isValidDOB(DOB)) {
            System.out.println("Invalid DOB");
            return;
        }

        // Validate Comorbidity
        if (!isValidComorbidity(comorbidity)) {
            System.out.println("Invalid input");
            return;
        }

        // Extracting year from DOB
        int year = Integer.parseInt(DOB.split("/")[2].trim());

        // Applying vaccination drive rules
        if (year > 60 || "yes".equalsIgnoreCase(comorbidity)) {
            System.out.println("1"); // First vaccination drive list
        } else if (year > 45) {
            System.out.println("2"); // Second vaccination drive list
        } else if (year > 30) {
            System.out.println("3"); // Third vaccination drive list
        }
    }

    private static boolean isValidAdharNumber(String adharNumber) {
        // Adhar card number should be a 12 digit number with 4 digits separated by a space
        return adharNumber.matches("\\d{4} \\d{4} \\d{4}");
    }

    private static boolean isValidDOB(String DOB) {
        // Date of Birth should be in dd/mm/yyyy format and should be a valid date
        return DOB.matches("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}");
    }

    private static boolean isValidComorbidity(String comorbidity) {
        // Comorbidity can take the value "yes" or "no" and can be in any case
        return "yes".equalsIgnoreCase(comorbidity) || "no".equalsIgnoreCase(comorbidity);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Adhar Number:");
        String adharNumber = scanner.nextLine();

        System.out.println("Enter Date of Birth (dd/mm/yyyy):");
        String DOB = scanner.nextLine();

        System.out.println("Enter Comorbidity (yes/no):");
        String comorbidity = scanner.nextLine();

        Result.calculateVaccDriveList(adharNumber, DOB, comorbidity);
        scanner.close();
    }
}
