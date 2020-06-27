package junit;
import java.util.List;
import java.util.stream.Collectors;
public class Access {
public double average(List<Integer> a)
{
  return a.stream()
      .mapToInt(val -> val).average().orElse(0.0);
}
public List<String> checkLength(List <String> s)
{
  return s.stream()
  .filter(value -> ((value.length()==3) && (value.charAt(0)=='a') ))
  .collect(Collectors.toList());
}
public List<String> checkPallindrome(List <String> a)
{
  return a.stream()
    .filter(value -> check(value))  
    .collect(Collectors.toList());
}

private static boolean  check(String value) 
{  
  String s="";
  for(int i=value.length()-1;i>=0;i--)
  {
    s=s+value.charAt(i);
  }
  if(value.equals(s))
  {
  return(true);
  }
  else 
  {
    return(false);
  }
}
}