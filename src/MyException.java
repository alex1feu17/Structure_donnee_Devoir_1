public class MyException extends Exception {
	private static final long serialVersionUID = 1L;

	public MyException(String id) {
		System.out.println("Le chauffeur " + id + " n'a pas été trouvé. Veuillez réessayer.\n");
    }
}
