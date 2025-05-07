//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        float amountSavingsProc = 0;
        int i = 0;
        while(amountSavingsProc < 2459000f){
            i++;
            amountSavingsProc += 15000f;
            amountSavingsProc = amountSavingsProc + amountSavingsProc * 0.01f;
            //System.out.printf("Месяц %d, сумма накоплений равна %.1f рублей \n", i, amountSavingsProc);
        }
        System.out.printf("Месяц %d, сумма накоплений равна %.1f рублей \n", i, amountSavingsProc);

        System.out.println("Задача 2");
        i = 0;
        while(i<10){
            i++;
            System.out.printf(i + " ");
        }
        System.out.println();
        for (i = 10;i>=1;i--){
            System.out.printf(i + " ");
        }
        System.out.println();

        System.out.println("Задача 3");
        long population = 12_000_000L;
        int birthRatePerThousand = 17;
        int mortalityRatePerThousand = 8;

        for(int year = 1; year <= 10; year++){
            population = population + (birthRatePerThousand - mortalityRatePerThousand)  * population / 1000;
            System.out.printf("Год %d, численность населения составляет %d \n", year, population);
        }

        amountSavingsProc = 15000f;
        int month = 0;
        System.out.println("Задача 4");
        do{
            month++;
            amountSavingsProc = amountSavingsProc + amountSavingsProc * 0.07f;
            System.out.printf("На %d месяц вклад Василия будет составлять %.1f рублей \n",month,amountSavingsProc);
        }while(amountSavingsProc < 12000000f);
        System.out.printf("Чтобы Василию собрать сумму в 12 миллионов рублей, " +
                "ему потребуется %d месяца(ев) \n", month);

        System.out.println("Задача 5");
        amountSavingsProc = 15000f;
        month = 0;
        do {
            month++;
            amountSavingsProc = amountSavingsProc + amountSavingsProc * 0.07f;
            if (month % 6 == 0) {
                System.out.printf("На %d месяц вклад Василия будет составлять %.1f рублей \n", month, amountSavingsProc);
            }
        } while (amountSavingsProc < 12000000f);

        System.out.println("Задача 6");
        amountSavingsProc = 15000f;
        month = 0;
        int cntMonthsPerNineYears = 12 * 9;
        do {
            month++;
            amountSavingsProc = amountSavingsProc + amountSavingsProc * 0.07f;
            if (month % 6 == 0) {
                System.out.printf("На %d месяц вклад Василия будет составлять %.1f рублей \n", month, amountSavingsProc);
            }
        } while (month < cntMonthsPerNineYears);

        System.out.println("Задача 7");
        int firstFriday = 1;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет \n", day);
        }


        System.out.println("Задача 8");
        int year = 0;
        int period = 79;
        int startYear = 2025 - 200;
        int stopYear = 2025 + 100;
        do{
            year+= period;
            if (year > startYear && year < stopYear){
                System.out.println(year);
            }
        }
        while(year < stopYear);
    }
}