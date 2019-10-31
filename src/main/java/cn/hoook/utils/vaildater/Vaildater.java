package cn.hoook.utils.vaildater;

public class Vaildater {
    /**
     * 判断是否为空的方法类
     */
    public static boolean vaildationEmpty(String str){
        if (str == null || "".equals(str)){
            return false;
        }
        return true;
    }
}
