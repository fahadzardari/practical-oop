
public class NullException {
        public static void main(String[] args) {
                try {
                        Integer i  = null;
                        throw new NullPointerException();
                } catch (NullPointerException excep) {
                        //TODO: handle exception
                        System.out.println(excep);
                }
        }
}
