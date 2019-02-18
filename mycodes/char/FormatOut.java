public class FormatOut{
    public static void main(String[] args) {
        int x = 38 , y = -152;
        System.out.printf("Location: (%d,%d)\n",x,y);

        int score = 87;
        System.out.printf("Your got %d%% on the exam\n", score);

        double gpa = 3.18652;
        String name = "Jessica";
        System.out.printf("student name: %10s\n",name);
        System.out.printf("exam score  : %10d\n",score);
        System.out.printf("GPA         : %10.2f\n",gpa);

        System.out.println();

        for(int i = 1;i <= 10;i++){
            for(int j = 1;j <= 10;j++){
                System.out.printf("%-5d", i * j);
            }
            System.out.println();
        }

    }
}