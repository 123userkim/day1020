package com.sist.exam06;
import java.util.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public class HomeworkExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List �÷����� ��ü�� �Ϸķ� �þ���� ����, ��ü�� �ε����� ����, ��ü�� �����ϸ� �ڵ� �ε����� �ο��ǰ� �ε����� ��ü�� �˻�/ ������ �� �ִ� ����� ����
		//get()
		//�ߺ����
		        ArrayList<String> arrList = new ArrayList<String>();
		        // ����Ʈ�� ����� ����
		        arrList.add("��");
		        arrList.add("��");
		        arrList.add("��");
		        arrList.add("�ϳ�");
		        // ����Ʈ ����� ���

		        for(int i = 0; i < arrList.size(); i++) {
		            System.out.println(arrList.get(i));
		        }
		        System.out.println("========");
		    
		
		//Set�÷����� ��쿡�� ���� ������ ����x, Set�÷����� ���� ��ü�� �����Ƿ� �ε����� ��ü�� �˻��ؼ� �������� get(index) �޼��嵵 ����x
		//��� ��ü ��ü�� ������� �� ���� �ݺ��ؼ� �������� �ݺ���(Iterator)�� ����. iterator() �޼��带 ȣ���ϸ� ���� �� ����.
		//�ߺ���� x

		        
		        	
		        		HashSet<Integer> A = new HashSet<Integer>(); // set ����
		        		
		        		A.add(1);
		        		A.add(2);
		        		A.add(3); // set�� �ߺ��� ���� �Ұ� 
		        		A.add(4); // set�� �� ���
		        		
		        		System.out.println("set ũ�� Ȯ�� : " + A.size());
		        		
		        		Iterator hi = (Iterator)A.iterator(); 
		        		while(hi.hasNext()) { 
		        			System.out.println(hi.next()); // 
		        		}
		        		
		        		 System.out.println("========");
		        	

		    
		
		//Map �÷����� Ű(key)�� ��(value)���� ������ ��ü�� �����ϴ� ����, Ű�� �ߺ����� ������ �� ���� ���� �ߺ����� ������ �� ������
		// �ߺ��� key���� ���´ٸ� ������ ���� �������� ���ο� ������ ��ü
		        
		        HashMap<String, Integer> b = new HashMap<String, Integer>();
		        b.put("one",1);
		        b.put("two",2);
		        b.put("three",3);
		        b.put("four",4);
		        
		        System.out.println(b.get("one"));
		        System.out.println(b.get("two"));
		        System.out.println(b.get("three"));
		        System.out.println(b.get("four"));
		        
		        
		        
		        
	}
}