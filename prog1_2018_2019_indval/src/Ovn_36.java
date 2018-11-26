/**
 * 
 */


/**
 * @author danand004
 *
 */
public class Ovn_36 {

	public static void main(String[] args) {
		
		
		int sekunder=3661;
		
		
		int timmar = sekunder/3600;
		
		int rest = sekunder%3600;
		//int rest= sekunder- (timmar*3600);
		
		int minuter= rest/60;
		
		int s= minuter%60;
		//int s= rest-(minuter *60);
		
		System.out.println(timmar+":"+minuter+":"+s);
		
		
		
	}
	
	
	
}
