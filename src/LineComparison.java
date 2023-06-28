public class LineComparison
{
    public void Line()
    {
        System.out.println("Welcome to Line Comparison computation");
        int x1 = 3;
        int x2 = 7;
        int y1 = 4;
        int y2 = 2;
        int a1 = 4;
        int a2 = 9;
        int b1 = 6;
        int b2 = 5;

        double disOfFirstLine = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        double disOfSecondLine = Math.sqrt(Math.pow((a2-a1), 2) + Math.pow((b2-b1), 2));

        System.out.println("Two points are (x1,y1)(3,4) and (x2,y2)(7,2)");
        System.out.println("Another Two points are (a1,b1)(4,6) and (a2,b2)(9,5)");

        System.out.println("Length of the first line (3,4)(7,2) is : " + disOfFirstLine);
        System.out.println("Length of the second line (4,6)(9,5) is : " + disOfSecondLine);

        Integer obj1 = new Integer((int) disOfFirstLine);
        Integer obj2 = new Integer((int) disOfSecondLine);

        System.out.println("these lines are equal :" + obj1.equals(obj2));
        if (+obj1.compareTo(obj2) > 0 ) {
            System.out.println("Length of first line is greater than Length of second line");
        } else {
            System.out.println("Length of Second line is greater than Length of first line");
        }
    }
}
