public class opera1 {
    public static void main(String[] args)
    {
        int a=1+3;
        int b=a*3;
        int c=b/5;
        int d=b-a, e=-d;
        int f=b%5;

        System.out.println ("a="+a+"b="+b+"c="+c+"d="+d+"e="+e+"f="+f);
a+=4;
b*=3;
c+=a+b;
c%=5;
d-=3;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println ("d="+d);
        a++;
        b--;
        int k1=5,k2=5;
        int s1=2*++k1;
        int s2=2*k2++;
        System.out.println("k1="+k1+" s1="+s1);
        System.out.println ("k2="+k2+"s2="+s2);

    }
}
