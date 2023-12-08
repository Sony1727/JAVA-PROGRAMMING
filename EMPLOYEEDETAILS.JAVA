public class Emp {
    public static void main(String a[]) {
        int Age = 30;
        char section = 'D';
        boolean isTaskCompleted = true;

        float income_january = 4800.78f;
        float income_March = 16700.55f;
        float income_June = 7800.54f;

        String name = "DADU.M";
        float total_income = income_january + income_June + income_March;
        double average = (total_income / 3);

        System.out.println("Name of employee :" + name + "Age :" + Age + "Section :" + section);
        System.out.println("isTaskCompleted or not:" + (isTaskCompleted ? "Completed" : "NotCompleted"));


        System.out.println("Total income of MR : "+" name: " +"total_income :" +"$");
System.out.println("Average :" +average);
    }
}
