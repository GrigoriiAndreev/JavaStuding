package task08.task0802;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> veg = new HashMap<String, String>();
		veg.put("�����", "�����");
		veg.put("�����", "�����");
		veg.put("�����", "�����");
		veg.put("�����", "�����");
		veg.put("����", "����");
		veg.put("�������", "����");
		veg.put("����-����", "������");
		veg.put("���������", "�����");
		veg.put("����", "������");
		veg.put("���������", "�������");
		
        for (Map.Entry<String, String> pair : veg.entrySet())
        {
 //           String key = pair.getKey();                      //����
 //           String value = pair.getValue();                  //��������
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
	}

}
