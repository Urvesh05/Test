package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Spliterator;

public class ArryListExample {
	public static void addData()
	{
		//int i=1;
		//1 add()
		ArrayList<String> list = new ArrayList();
		list.add("Chirag");
		list.add("Harish");
		list.add("Haresh");
		list.add("Deepak");
		list.add("jinal");
		list.add("urvesh");
		list.add("urvesh");
		
		//System.out.println(list);
		//list.ensureCapacity(2);
		
		
		//2. addAll()
		ArrayList<String> list2= new ArrayList<String>();
		list2.add("abc");
		list2.add("tarun");
		list.addAll(list2);
		
		//System.out.println(list);
		//3. clear
		/*System.out.println(list);
		list.clear();
		System.out.println(list);
		*/
		
		// 4. clone()
		System.out.println(">>> Clone Data");
		Object clonList;
		clonList=list.clone();
		System.out.println(clonList);
		
		// 5. contains
		System.out.println(">>> Contains ");
		System.out.println(list.contains("tarun"));
		
		//6. ensureCapacity()
		list.ensureCapacity(2);
		
		//7. for each
		//ArrayList< String> names= new ArrayList<String>(Arrays.asList("A","B","C"));
		//list3.forEach(list3);
		//names.forEach(name -> printString(name));
		
		//8. ArryList Get
		
		System.out.println(">>> Get data");
		System.out.println(list.get(2));
		System.out.println(list.get(4));
		
		
		//9. Indes Of
		System.out.println(">>>> Last Index");
		System.out.println(">>> Index Of");
		int data = list.indexOf("jinal");
		System.out.println(data);
		
		
		//10. Last indexof
		//System.out.println(">>>>Index Of");
		//System.out.println(list.lastIndexOf("tarun"));
		//System.out.println(list);
		
		
		//11. listInretor
		System.out.println(">>>List Inrator");
		ListIterator itrr = list.listIterator();
		while(itrr.hasNext())
		      System.out.println(itrr.next());
		
//		while(itrr.hasPrevious())
//		      System.out.println(itrr.previous());
//		
		
		//12. remove
		
		//System.out.println(">>> Remove");
		//list.remove(2);
		//System.out.println(list);
		
		//13. 
		//list.removeAll(Collections.singleton("urvesh"));
		System.out.println(list);
		
		//14..retainAll()
		
		//list.retainAll(Collections.singleton("urvesh"));
		//System.out.println(list);
		
		//15. sort
		
		//list.sort(comparator);
		System.out.println(">>>> Array List Data");
		
		//16. spliter
		Spliterator<String> mySpliterator;
		mySpliterator = list.spliterator();
		System.out.println(mySpliterator.characteristics());
		
		//17  sublist
		ArrayList<String> sublist = new ArrayList<String>( list.subList(1,3) );
        
        System.out.println(sublist);
		
        //18 to aary
        System.out.println(list.size());
        for (String value : list) {
            System.out.println(value);
          }  
        
        Object []obj = list.toArray();
        System.out.println("Printing elements from first to last:"); 
        for (Object value : obj) {
          System.out.println( value);
        }
		
		/*for(String s:list)
		{
			System.out.println(i++ +"."+s);
		}*/
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArryListExample.addData();
		
	}

}
