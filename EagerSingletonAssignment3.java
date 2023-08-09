import java.text.SimpleDateFormat;
import java.util.Date;


public class EagerSingletonAssignment3 {

private static final EagerSingletonAssignment3 instance1 = new EagerSingletonAssignment3();
private static final EagerSingletonAssignment3 instance2 = new EagerSingletonAssignment3();
private static final EagerSingletonAssignment3 instance3 = new EagerSingletonAssignment3();

	private EagerSingletonAssignment3() {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("H:mm:ss:S");
		String formattedDate = dateFormat.format(new Date());
		System.out.print("Instance created at:"
				+ formattedDate + "\n");
	}

    public static EagerSingletonAssignment3 getInstance(int i){
		if (i == 1) {
			return instance1;
		}
		else if (i == 2) {
			return instance2;
		}
		else {return instance3;}
        
    }

}