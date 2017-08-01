public class Mutable {
  public static void main(String[] args) {
    class MutableString {
	    private String s;
	    public void setS(String newS) {
		  s = newS;
	    } // Setter makes it mutable
	    public String getS() {
	      return s;
	    }
	}
	final class ImmutableString {
		private String s = "name";
		public String getS() { 
			return s;
		}// Immutable only has a getter
	}
	System.out.println("I am mutable");
	System.out.println("I am immutable");
  }
}