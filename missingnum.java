package abreviate;
public class missingnum {
	private int count;

	public void find() {
	    //prep for question
	    List<Integer> ints = new ArrayList();
	    for (int i = 0; i < 100; i++) {
	        ints.add(i);
	    }
	    ints.remove(67);

	    //find the missing number
	    for (Integer i : ints) {
	        if (i != count) {
	            System.out.println(count);
	            count++;
	        }
	        count++;
	    }
	}
}