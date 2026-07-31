import com.projeto.atribuicaoreferencia.MeuObj;

public class Main {
    public static void main(String[] args) throws Exception {
        int abc = 1;
        int abc2 = abc;

        abc = 2;

        System.out.println("abc = " + abc);
        System.out.println("abc2 = " + abc2);

        System.out.println("====================");

        MeuObj obj = new MeuObj();
        obj.setNum(1);
        MeuObj obj2 = obj;
        obj.setNum(2);

        System.out.println("obj = " + obj);
        System.out.println("obj2 = " + obj2);


    }
}
