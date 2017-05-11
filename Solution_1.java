import java.lang.reflect.Array;

public class Solution
{
	public int reverse(int x)
	{
		int ans = 0, temp = 0;
		while (x != 0)
		{
			temp=ans*10+x%10;
			if(temp/10!=ans)
			{
				return 0;
			}
			ans=temp;
			x/=10;
		}
		return ans;
	}

}