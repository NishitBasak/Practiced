class EncapsulationAuthentication
{
	static private String UserName="nbasak";
	static private String Password="nbk"; 
	static public String MatchData(String u,String p)
	{
		if(u.equals(UserName) && p.equals(Password))
			return "Login Succesfully";
		return "Login Failed";
	}
}
public class DrivenCode {

	public static void main(String[] args) {
		System.out.println
		(EncapsulationAuthentication.MatchData("nbasak", "nbk"));

	}

}
