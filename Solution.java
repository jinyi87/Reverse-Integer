import java.lang.reflect.Array;

public class Solution
{
	public int reverse(int x)
	{
		String str = Integer.toString(x);
		char[] nums = str.toCharArray();
		int len = nums.length;
		char temp;
		if (x > 0)
		{
			for (int i = 0; i < (len + 1) / 2; i++)
			{
				temp = nums[i];
				nums[i] = nums[len - i - 1];
				nums[len - i - 1] = temp;
			}
			str = new String(nums);
			if (Long.parseLong(str) < 2147483647 )
				return Integer.parseInt(str);
			else
				return 0;
		} else if (x < 0)
		{
			for (int i = 1; i < (len + 2) / 2; i++)
			{
				temp = nums[i];
				nums[i] = nums[len - i];
				nums[len - i] = temp;
			}
			str = new String(nums);
			if (Long.parseLong(str) > -2147483647 )
				return Integer.parseInt(str);
			else
				return 0;
		} else
		{
			return 0;
		}
	}

}