import java.text.SimpleDateFormat;
import java.util.Date;

public class LazySingletonAssignment3 {
    private static LazySingletonAssignment3 instance1;
    private static LazySingletonAssignment3 instance2;
    private static LazySingletonAssignment3 instance3;

	private LazySingletonAssignment3() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("H:mm:ss:S");
		String formattedDate = dateFormat.format(new Date());
		System.out.print("Instance created at:"
				+ formattedDate + "\n");
	}

    public static LazySingletonAssignment3 getInstance(int i){
        if (i == 1) {
            instance1 = new LazySingletonAssignment3();
            return instance1;
        }
        else if (i ==2) {
            instance2 = new LazySingletonAssignment3();
            return instance2;
        }
       else {
        instance3 = new LazySingletonAssignment3();
        return instance3;}
     
    }

}