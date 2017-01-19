/**
 * Created by VINNI on 18.01.17.
 */

public class Test  {
    public static void g() throws Ex{
        throw new Ex("Error");
    }

    public static void f() throws Ex2 {
            try {
                g();
            }
            catch (Ex e) {
                throw new Ex2();
            }
        }
}
