package InnerClasses;

class Outer { //Burada normalde oldugu gibi bir sinif olusturuldu.

    class Inner{
        public void print(){ //Burada bir inner sinif olusturuldu. 
            System.out.println("Bu bir inner siniftir.");
        }
    }

    void innereUlas(){ // Olusturulan innere sinifina baska siniflardan ulasabilmek icin bir fonksiyon tanimlandi.
        Inner inner = new Inner();
        inner.print();
    }
}

class Outer2 {
    private int num = 200;

    public class Inner2 {
        public int getNum(){
            System.out.print("Inner sinifindan geri dondurulen deger : ");
            return num;
        }
    }
}

class Outer3 {
    public void metod(){
        class MetodInner {
            public void yazdir(){
                System.out.println("Bu yazi metot icine yazilan siniftan donuyor.");
            }
        }

        MetodInner mInner = new MetodInner();
        mInner.yazdir();
    }
}

class Outer4 {
    static class nested {
        public void myMetod(){
            System.out.println("Bu bir nested siniftir.");
        }
    }
}   


public class Test1 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.innereUlas(); // Buraya kadar olanlar inner siniflarina ulasmak icin yapilan yontemlerden biri idi.

        Outer2 outer2 = new Outer2(); // Burada yapilanlar ise, direkt ana siniftan referans alma yontemi ile olusturulmus bir yapi.
        Outer2.Inner2 inner2 = outer2.new Inner2();
        System.out.println(inner2.getNum());

        Outer3 outer3 = new Outer3(); // 3. yontem de ise metot yardimi ile inner sinifina erisim saglaniyor.
        outer3.metod();


        Outer4.nested nested = new Outer4.nested();
        nested.myMetod();
        /*Son yontemde ise dis siniftan nesne uretmeden, static anahtar 
        *kelimesi sayesinde direkt olarak referans gosterildi ve 
        *inner sinifina ulasilmis oldu
        */
        

    }
    
    
}
