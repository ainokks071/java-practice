package theme4_Comparable_Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class CompareTest1 {

	public static void main(String[] args) {
		
		String[] strArr = {"Z", "d", "a", "t"};
		
		Arrays.sort(strArr); //오름차순
		
		System.out.println(Arrays.toString(strArr));  
		
		Arrays.sort(strArr, new Descending()); //사용자 정렬 기준 제공 : 내림차순

		System.out.println(Arrays.toString(strArr));  
// a = {"", "", ""}		
// Arrays 클래스의 sort메서드 내부에서 String객체(Comparable구현 객체)의 CompareTo() 호출 !
		
//	    public static void sort(Object[] a) {
//	        if (LegacyMergeSort.userRequested)
//	            legacyMergeSort(a);
//	        else
//	            ComparableTimSort.sort(a, 0, a.length, null, 0, 0);
//	    }
		
//	    private static void mergeSort(Object[] src,
//	           ((Comparable) dest[j-1]).compareTo(dest[j])>0; j--)
//	        if (((Comparable)src[mid-1]).compareTo(src[mid]) <= 0) {
//if (q >= high || p < mid && ((Comparable)src[p]).compareTo(src[q])<=0)
		
		
		
//public final class String implements Comparable<String> {
//	
//    public int compareTo(String anotherString) {
//        byte v1[] = value;
//        byte v2[] = anotherString.value;
//        
//        if (coder() == anotherString.coder()) {
//            return isLatin1() ? StringLatin1.compareTo(v1, v2)
//                              : StringUTF16.compareTo(v1, v2);
//        }
//        return isLatin1() ? StringLatin1.compareToUTF16(v1, v2)
//                          : StringUTF16.compareToLatin1(v1, v2);
//     }
//
//	
//}
	}

}


class Descending implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
			return o1.compareTo(o2) * -1;
	}
	
	
}