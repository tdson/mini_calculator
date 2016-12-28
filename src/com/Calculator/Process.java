package com.Calculator;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.*;

/**
 *
 * @author TRANDAISON
 */
public class Process {
    // Thuc hien phep tinh can bac 2 so hoc
    public static double doSqrt(double a) {
        return (Math.sqrt(a));
    }

    // Xoa 1 toan tu o cuoi bieu thuc
    public static String backspaceOperator(String str) {
        String tmp = "";
        char lastChar = str.charAt(str.length() - 1);
        int endPoint = str.length() - 1;
        tmp = str.substring(0, endPoint);
        return tmp;
    }

    // Xoa 1 toan hang cuoi bieu thuc vua nhap sai
    public static String backspaceString(String str) {
        String tmp = "";

        int lastPlus = str.lastIndexOf("+");
        int lastSub = str.lastIndexOf("-");
        int lastMul = str.lastIndexOf("*");
        int lastDiv = str.lastIndexOf("/");

        int lastOperatorIndex = Math.max(Math.max(lastPlus, lastSub), Math.max(lastMul, lastDiv));
        if (lastOperatorIndex == -1) {
            tmp = "0";
        } else {
            int endPoint = Math.max(Math.max(lastPlus, lastSub), Math.max(lastMul, lastDiv)) + 1;
            tmp = str.substring(0, endPoint);
        }
        return tmp;
    }

    // Xoa 1 ky tu o cuoi bieu thuc
    public static String backOneChar(String str) {
        return str.substring(0, str.length() - 1);
    }

    // Thuc hien tinh toan tu xau vao
    public static Object doCalc(String str) throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        return engine.eval(str);
    }
}
