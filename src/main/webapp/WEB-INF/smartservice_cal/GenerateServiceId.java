package smartservice_cal;

import java.util.Random;

public class GenerateServiceId {
	 public static String generateServiceId(int length)
	    {
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        Random random = new Random();
	        StringBuilder serviceId = new StringBuilder(length);

	        for (int i = 0; i < length; i++) {
	            int index = random.nextInt(characters.length());
	            serviceId.append(characters.charAt(index));
	        }

	        return serviceId.toString();
	    }
}
