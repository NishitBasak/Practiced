import java.util.ArrayList;
public class ArrayListStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str=new ArrayList<String>();
		str.add("Green");
		str.add("Red");
		str.add("Purple");
		str.add("Green");
		str.remove(0);
		str.remove("Green");
		System.out.println(str);
	}

}
