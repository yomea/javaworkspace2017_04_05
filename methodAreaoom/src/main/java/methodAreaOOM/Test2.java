package methodAreaOOM;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author may
 *
 */
public class Test2 {

	public static void main(String[] args) {
			Enhancer enhancer = new Enhancer();

			enhancer.setSuperclass(T.class);

			enhancer.setUseCache(false);

			enhancer.setCallback(new MethodInterceptor() {

				@Override
				public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
					System.err.println("hehehe ehhe");
					return arg3.invokeSuper(arg0, arg2);
				}
			});

			T t = (T) enhancer.create();
			
			t.t();
			t.tt();
			t.ttt();

	}

	public static class T {

		//静态方法不会被代理
		public static void t() {

			System.out.println("Enhancer...");

		}
		
		public  void tt() {

			System.out.println("public static void tt() {.");

		}
		
		public  void ttt() {

			System.out.println("public  void ttt() {");

		}

	}

}
