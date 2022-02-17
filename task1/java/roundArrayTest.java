public class roundArrayTest {

    public static void main(String[] args) {
        int arrayLen = Integer.parseInt(args[0]);
        int step = Integer.parseInt(args[1]);

        //rude errors
        if (arrayLen<2 || step<2){
            System.err.println("wrong parameters");
            return;
        }

        //init
        int currentNum=1;
        int temp;
        step -= 1;
        System.out.print(currentNum);

        //cicleArray
        do{
            temp = currentNum + step;
            if (temp<=arrayLen)currentNum = temp;
            else {
                currentNum = temp%arrayLen;
                if (currentNum==0) currentNum = arrayLen;
            }
            if (currentNum!=1) System.out.print(currentNum);
        }while (currentNum!=1);
    }
}
