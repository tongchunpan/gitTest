import com.tong.product.reflection.ReflectionTest;
import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @author 童纯盼
 * @date 2022/3/31 13:17
 */
public class MyTest {

    @Test
    public void t() {
        try {
            //获取reflectionTest类的Class对象
            Class<?> cla = Class.forName("com.tong.product.reflection.ReflectionTest");
            //获取 构造器
            Object o = cla.newInstance();
            //收取方法
            Method show = cla.getMethod("show");

            //执行方法
            show.invoke(o);

            Field name = cla.getField("name");
            Object o1 = name.get(o);
            System.out.println(o1);


        } catch (Exception e) {

        }


    }

    @Test
    public void classLoad() {
        ReflectionTest reflectionTest = new ReflectionTest();
        ReflectionTest reflectionTest1 = new ReflectionTest();
        System.out.println(reflectionTest1 == reflectionTest);
    }

    @Test
    public void index() {

        System.out.println(is(7));
    }


    public boolean is(int target) {
        int right = target / 2;
        int left = 0;
        while (left <= right) {
            if ((left * left + right * right) == target) {
                System.out.println(String.valueOf(left) + ":" + Integer.toString(right));
                return true;
            }
            if ((left * left + right * right) < target) {
                left += 1;
                continue;
            }
            if ((left * left + right * right) > target) {
                right -= 1;
            }
        }
        return false;


    }

    public String he(int[] arr, int target, int left, int right) {
        if (arr.length < 2) {
            return "数组长度必须大于2";
        }
        while (left < right) {
            if (arr[left] + arr[right] == target) {
                return String.valueOf(left + right);
            }
            if (arr[left] + arr[right] < target) {
                left += 1;
                continue;
            }
            if (arr[left] + arr[right] > target) {
                right -= 1;
            }
        }

        return "没有";
    }


    @Test
    public void intTest() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            System.out.println(integer);

        }

    }


}
