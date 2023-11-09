import com.thinking.machines.nframework.client.*;
class CalculatorUI
{
public static void main(String gg[])
{
try
{
NFrameworkClient nfc=new NFrameworkClient();
int num1=Integer.parseInt(gg[0]);
int num2=Integer.parseInt(gg[1]);
Object result=nfc.execute("/calculator/add",num1,num2);
Double i=(Double)result;
System.out.println(i);
result=nfc.execute("/calculator/sub",num1,num2);
System.out.println(result);
result=nfc.execute("/calculator/mul",num1,num2);
System.out.println(result);
result=nfc.execute("/calculator/div",num1,num2);
System.out.println(result);

}catch(Throwable t)
{
System.out.println(t.getMessage());
}
}
}