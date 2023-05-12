package Contest_Question;

public class Count_the_Number_of_Vowel_String_inRange {
    public int vowelStrings(String[] words, int left, int right) {

    int ans  = 0;
    for(int i =  left;i<=right; i++)
    {
        char arr[] = words[i].toCharArray();

        if(arr[0]=='a' || arr[0]=='e' || arr[0]=='i' || arr[0]=='o' || arr[0]=='u')
        {
            if(arr[arr.length-1]=='a' || arr[arr.length-1]=='e' || arr[arr.length-1]=='i'  || arr[arr.length-1]=='o' || arr[arr.length-1]=='u' )
            {
                ans++;
            }
        }

    }
    return ans;
}
    public static void main(String[] args) {

    }
}
