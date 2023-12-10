import java.io.*;
import java.util.*;
import java.text.*;

public class Ibm {

  public static void calculateVaccDriveList(String adharNumber, String DOB, String comorbidity) {

    // Validate adhar number
    if (!adharNumber.matches("\\d{4} \\d{4} \\d{4}")) {
      System.out.println("Invalid adhar number");
      return;
    }

    // Validate date of birth
    try {
      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
      sdf.setLenient(false);
      sdf.parse(DOB);
    } catch (ParseException e) {
      System.out.println("Invalid DOB");
      return;
    }

    // Validate comorbidity
    if (!comorbidity.equalsIgnoreCase("yes") && !comorbidity.equalsIgnoreCase("no")) {
      System.out.println("Invalid input");
      return;
    }

    // Calculate age
    Calendar birthDate = Calendar.getInstance();
    birthDate.setTime(new Date(DOB));
    Calendar today = Calendar.getInstance();
    int age = today.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

    // Determine vaccination drive list
    if (age >= 60) {
      System.out.println(1);
    } else if (comorbidity.equalsIgnoreCase("yes")) {
      System.out.println(1);
    } else if (age >= 45) {
      System.out.println(2);
    } else if (age >= 30) {
      System.out.println(3);
    } else {
      // Age less than 30 and no comorbidity
      System.out.println("Not eligible");
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    String adharNumber = bufferedReader.readLine();
    String DOB = bufferedReader.readLine();
    String comorbidity = bufferedReader.readLine();

    calculateVaccDriveList(adharNumber, DOB, comorbidity);

    bufferedReader.close();
  }
}
