public class Ns{

  public static void main(String args[]){
    String text = "30-4";
    int answer = calculate(text);
    System.out.println(answer);
  }
    
  public static int calculate(String text){
    char[] array = text.toCharArray();
    int acc = 0;
    char op = '+';
    int n = 0;
    for (char c : array){
      if (c >= '0' && c <='9'){
        n = n*10+(int)(c-'0');
      }
      else if(c == '+'){
        acc = cal(acc, op, n);
        op = '+';
        n = 0;
      }
      else if(c == '-'){
        acc = cal(acc, op, n);
        op = '-';
        n = 0;
      }
      else if(c == '='){
        acc = cal(acc, op, n);
        return acc;
      }
    }
    acc = cal(acc, op, n);
    return acc;
  }

  private static int cal(int acc, char op, int n){
    if(op == '+'){
      acc += n;
    }
    if(op == '-'){
      acc -= n;
    }
    return acc;
  }

}
