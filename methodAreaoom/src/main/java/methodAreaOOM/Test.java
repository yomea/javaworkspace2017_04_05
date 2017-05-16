package methodAreaOOM;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 通过大量加载类来时Perm区发生溢出
 * 这里使用cglib动态代理来生成类代理，加载大量的类
 * 
 * @author may
 *
 */
public class Test {

	public static void main(String[] args) {
		//while (true) {//无限生成代理类
			Enhancer enhancer = new Enhancer();

			enhancer.setSuperclass(T.class);

			enhancer.setUseCache(false);

			enhancer.setCallback(new MethodInterceptor() {

				@Override
				public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {

					//System.out.println(arg0);似乎不可以写行代码，写了会报Stack Overflow错误。
					return arg3.invokeSuper(arg0, arg2);
				}
			});

			T t = (T) enhancer.create();
			
			t.t();

//		}

	}

	public static class T {

		public void t() {

			System.out.println("Enhancer...");

		}

	}

}
