package day0704;

public class UseWork0703 {
	
	public void useDataTokenizer() {
		Work0703 w = new Work0703();
		String csvData = "강다연,김다영 김선경.김인영,김주민~박상준,박서현,서효민";
		
		//1번
		for(String data : w.dataTokenizer(csvData)) {
			System.out.print(data + " ");
		}//end for
	}
	
	public void useDate() {
		Work0703 work = new Work0703();
		String value = work.date(0);
		System.out.println( value );
	}
	
	public static void main(String[] args) {
		UseWork0703 w = new UseWork0703();
		w.useDataTokenizer();
		System.out.println();
		w.useDate();
		
	}//main
}
