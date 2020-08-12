
public class Question3 {

	public static void main(String[] args) {
		
		 typo("pale","bake");
	 }
	
	

	
	

    public static int typo(String x, String y) {
        x = x.toLowerCase();
        y = y.toLowerCase();
        
        int [] costs = new int [y.length() + 1];
        for (int j = 0; j < costs.length; j++)
            costs[j] = j;
        for (int i = 1; i <= x.length(); i++) {
            costs[0] = i;
            int nw = i - 1;
            for (int j = 1; j <= y.length(); j++) {
                int cj = Math.min(1 + Math.min(costs[j], costs[j - 1]), x.charAt(i - 1) == y.charAt(j - 1) ? nw : nw + 1);
                nw = costs[j];
                costs[j] = cj;
            }
        }
        System.out.println("difference:"+ costs[y.length()]);
        
        if(costs[y.length()] ==0) {
        	 System.out.println("zero typo");
        } else if(costs[y.length()] ==1) {
        	 System.out.println("one typo");
        }
       
        
        
        return costs[y.length()];
    }
	
    

	

	
	
}
