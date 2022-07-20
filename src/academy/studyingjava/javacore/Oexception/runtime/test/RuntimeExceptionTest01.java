package academy.studyingjava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        // Checked e Unchecked

        // Exemplos de NullpointerException (Unchecked)
//        Object object = null;
//        System.out.println(object.toString());

        int[] nums = {1, 2};
        System.out.println(nums[2]);
    }
}
