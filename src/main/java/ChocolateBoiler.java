public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance = new ChocolateBoiler();

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public String fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler actions. Example:
            return "Filling";
        }
        return "";
    }

    public String boil() {
        if (!isEmpty() && !isBoiled()) {
            // boil the content. Example:
            boiled = true;
            return "Boiling";
        }
        return "";
   }

    public boolean isEmpty() { return empty;}

    public boolean isBoiled() { return boiled;}

	public static ChocolateBoiler getInstance() {
		return uniqueInstance;
	}
    
  
}