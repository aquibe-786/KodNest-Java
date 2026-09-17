public class Ternopr{
    public static void main(String[] args) {
        int m1 = 10;
        int m2 = 20;
        int m3 = 30;
        int m4 = 40;
        int m5 = 50;
        boolean isInvalid = (m1 < 0 || m1 > 100) ||
                            (m2 < 0 || m2 > 100) ||
                            (m3 < 0 || m3 > 100) ||
                            (m4 < 0 || m4 > 100) ||
                            (m5 < 0 || m5 > 100);

        int total = m1 + m2 + m3 + m4 + m5;
        double perc = total / 5.0;

        String result = isInvalid    ? "Invalid Marks" 
                      : (perc < 40)  ? "Fail (" + perc + "%)"
                      : (perc < 60)  ? "Pass / Second Class (" + perc + "%)"
                      : (perc < 75)  ? "First Class (" + perc + "%)"
                      : "Distinction (" + perc + "%)";
        
        System.out.println(result);
    }
}