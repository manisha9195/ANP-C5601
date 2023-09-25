package labstringhandling;
import java.util.*;

import java.util.*;

public class LabStringHandling {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		programm1();
		System.out.println("===========================================================");
		programm2();
		System.out.println("===========================================================");
		programm3();
		System.out.println("===========================================================");
		programm4();
		System.out.println("===========================================================");
		programm5();
		System.out.println("===========================================================");
		programm6();
		System.out.println("===========================================================");
		programm7();
		System.out.println("===========================================================");
		programm8();
		System.out.println("===========================================================");
		
	}
	private static void programm8() {
		System.out.println("PROGRAM 8 OUTPUT :");
		String str = "raj";
		String s1 = "";
		StringBuilder s2 = new StringBuilder("");
		for(int i=str.length()-1; i>=0; i--){
			char ch = str.charAt(i);
			s2.append(ch);
			s1=str+s2;
		}
		System.out.println(s1);
	}
		
	
	public static void programm7(){
		System.out.println("PROGRAM 7 OUTPUT :");
		String str = "aa bb cc aa bb cc bb aa bb";
		Map<String, Integer> occurrences = new HashMap<>();
		String[] words = str.split("\\s+");
		for (String word : words) {
			occurrences.put(word, occurrences.getOrDefault(word, 0) + 1);
		}
		for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
			String word = entry.getKey();
			int count = entry.getValue();
			System.out.println("\"" + word + "\" occurred: " + count + " times in given string");
		}
		
	}
	public static void programm6(){
		System.out.println("PROGRAM 6 OUTPUT :");
		int[] arr ={7,5,9,8,5,6,7,5,4,8} ;
		ArrayList<Integer> list = new ArrayList<>();
		for(int num: arr){
			list.add(num);
		}
		LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
		for(Integer uniqueValue:set){
			map.put(uniqueValue, Collections.frequency(list,uniqueValue));
		}
		System.out.println(map);
		for (Map.Entry<Integer, Integer> entry : map.entrySet()){
			if(entry.getValue()>0)
				System.out.println(entry.getKey()+" occured "+entry.getValue()+" times");
		}
		
	}
		private static void programm5() {
			System.out.println("PROGRAM 5 OUTPUT :");
			String str="India iss my beautiful country aaa";
			String s2 = "";
			String[] s1=str.split(" ");
			for(String word:s1){
				if(word.length()>s2.length()){
					s2=word;
				}
				
			}
			System.out.println(s2);
		
	}

		private static void programm4() {
		// TODO Auto-generated method stub
				System.out.println("PROGRAM 4 OUTPUT :");
				String str = "India is my Country";
				String[] s = str.split(" ");
				StringBuilder sb = new StringBuilder();
				for (String st : s) {
					String temp = st;
					String ch = " ";
					for (int i = temp.length() - 1; i >= 0; i--) {
						ch = ch + temp.charAt(i);
					}
					sb.append(ch + " ");
				}
				String st = sb.toString();
				String []a = st.split(" ");
				for(String b: a) {
					int len = b.length();
					if (len>0) {
					System.out.println(b+ " Has length "+ len);
					}
				}
				
			
		
	}
		public static void programm3(){
			System.out.println("PROGRAM 3 OUTPUT :");
			String s1 = "Java Concept Of The Day";
			String[] words = s1.split(" ");
			StringBuilder reversedString = new StringBuilder();
			for (int i = words.length - 1; i >= 0; i--) {
				reversedString.append(words[i]).append(" ");
			}
			String result = reversedString.toString().trim();
			System.out.println(result);
			
		}
		
		
		
	

		private static void programm2() {
			System.out.println("PROGRAM 2 OUTPUT :");
			{String str = "fgaaadddddgggggghjjjjjjjkknnnnpl";
			 List<Character> chars = new ArrayList<>();
				
			 for (char ch : str.toCharArray()) {
				  
		            chars.add(ch);
		        }
			//System.out.println(chars);
			LinkedHashSet<Character> set = new LinkedHashSet<>(chars);
			//System.out.println(set);
			LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
			//System.out.println(map);

			for(Character UniqueValue:set) {
				map.put(UniqueValue, Collections.frequency(chars, UniqueValue));
				
			}
			 System.out.println(map);
			 for(Map.Entry<Character,Integer> entry : map.entrySet() ) {
				 if(entry.getValue()>1) {
					System.out.println(entry.getKey() + " occured " + entry.getValue()+" times  ");
				 }
				}
		}
				
			
	}
	
		private static void programm1()
		{
			System.out.println("PROGRAM 1 OUTPUT :");
			String str = "aaabcdddddefgggggghijjjjjjjkklnnnno";
			String st="";
			for(int i = 0;i < str.length()-1; i++){
				char ch1 = str.charAt(i);
				char ch2 = str.charAt(i+1);
				if(ch1==ch2){
					st=st+str.charAt(i);
				}else{				
					st=st+str.charAt(i);
					if(st.length()>1)
						System.out.println("\""+st+"\" occured: "+st.length()+" times in given string");
					st= "";
				}
			}
			
		}

}
