package Structural.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SecurityProxy implements InvocationHandler {

    private Object obj;
    //factory pattern
    private SecurityProxy(Object obj) {
        this.obj = obj;
    }

    public static Object newInstance(Object object) {
        return java.lang.reflect.Proxy.newProxyInstance(object.getClass().getClassLoader(),
        object.getClass().getInterfaces(), new SecurityProxy(object));
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object result;
        try {
            //Se till att man inte kan köra post requests
            if(method.getName().contains("post")) {
                throw new IllegalAccessException("Posts are currently not allowed");
            } else {
                result = method.invoke(obj, objects);
            }
        } catch (InvocationTargetException e) {
            throw e.getTargetException();
        } catch (Exception e) {
            throw new RuntimeException("Unexpected invocation exception: "
            + e.getMessage());
        }
        return result;
    }
}
