public class MiniBookCorner
{
    public static void main(String[] args)
    {
        //book corner program

        String type[]={"Fiction","Nepali"};

        String book[][]=new String[2][1];
        double cost[][]=new double[2][1];

        //1st book fiction
        book[0][0]="Asahamati - 5";
        cost[0][0]=750.0;

        //2nd book nepali
        book[1][0]="Muna Madan";
        cost[1][0]=450.0;

        System.out.println("--- Mini Book Store ---");

        //showing fiction part
        System.out.println("Type: "+type[0]);
        System.out.println("Book name: "+book[0][0]);
        System.out.println("Rate: Rs."+cost[0][0]);
        System.out.println("-----");

        //showing nepali part
        System.out.println("Type: "+type[1]);
        System.out.println("Book name: "+book[1][0]);
        System.out.println("Rate: Rs."+cost[1][0]);
    }
}
