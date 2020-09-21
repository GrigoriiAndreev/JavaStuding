package task08.task0802;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> veg = new HashMap<String, String>();
		veg.put("арбуз", "€года");
		veg.put("банан", "трава");
		veg.put("вишн€", "€года");
		veg.put("груша", "фрукт");
		veg.put("дын€", "овощ");
		veg.put("ежевика", "куст");
		veg.put("жень-шень", "корень");
		veg.put("земл€ника", "€года");
		veg.put("ирис", "цветок");
		veg.put("картофель", "клубень");
		
        for (Map.Entry<String, String> pair : veg.entrySet())
        {
 //           String key = pair.getKey();                      //ключ
 //           String value = pair.getValue();                  //значение
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
	}

}
