package com.yidusoft.Utils;

import com.google.gson.Gson;

import java.lang.reflect.Type;

/**
 * Java对象和JSON字符串相互转化工具类
 * @date 2017-03-21
 */
public final class JsonUtil {

    private JsonUtil(){}

    /**
     * 对象转换成json字符串
     * @param obj
     * @return
     */
    public static String toJson(Object obj) {
        Gson gson = new Gson();
        return gson.toJson(obj);
    }
    /**
     * json字符串转成对象
     * @param str
     * @param type
     * @return
     */
    public static <T> T fromJson(String str, Type type) {
        Gson gson = new Gson();
        return gson.fromJson(str, type);
    }

    /**
     * json字符串转成对象
     * @param str
     * @param type
     * @return
     */
    public static <T> T fromJson(String str, Class<T> type) {
        Gson gson = new Gson();
        return gson.fromJson(str, type);
    }

//    public static <T> List<T> fromList(String json,  Class<T> clazz){
//        Gson gson = new Gson();
//        return gson.fromJson(json, new TypeToken<List<T>>(){}.getType());

//    }
//    .List<Person> ps = gson.fromJson(str, new TypeToken<List<Person>>(){}.getType());

}