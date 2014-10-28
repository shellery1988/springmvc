package com.lss.until;

import java.lang.reflect.ParameterizedType;

public class DaoImplTemplate {
	
	public String getStatement(Class<?> clazz) {
        StackTraceElement[] stacks = new Exception().getStackTrace();
        return getStatement(clazz, stacks[1].getMethodName());
    }

    public String getStatement(Class<?> clazz, String methodName) {
        return clazz.getName() + "." + methodName;
    }

    public String getStatement() {
        StackTraceElement[] stacks = new Exception().getStackTrace();
        return getStatement(stacks[1].getMethodName());
    }

    public String getStatement(String methodName) {
        ParameterizedType type = (ParameterizedType) super.getClass().getGenericSuperclass();

        Class entityClass = (Class) (Class) type.getActualTypeArguments()[0];
        return getStatement(entityClass, methodName);
    }

}
 