public class while2 { //Объявление класса while2
    public static void main(String[] args) //Объявление главного метода main
    {
        int a=4; //Объявление и инициализация переменных a и s
        int s=8;

        do
        {
            /*внутри метода объявлние и инициализация переменных a и s, а также тело метода do-while*/
            a=a-1;s=s*a;
    }
        while (a!=1); // проверка условия
     System.out.println(a); //Печать переменной s за пределами цикла
        System.out.println(s);

    }
}
