class Cavalos
{
    public static void main (String[]args)
    {
        double cv, m, h, t;

        m = 150;
        h = 12;
        t = 40;

        cv = m*h*t/745.699;

        System.out.println("A quantidade de cavalos necessários para elevar a massa " + m + " é de: " + cv);
        System.exit(0);
    }
}