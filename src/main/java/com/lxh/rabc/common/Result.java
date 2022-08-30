package com.lxh.rabc.common;


import java.util.HashMap;

public class Result extends HashMap<String, Object> {
    private static final long serialVersionUID = 1L;

    /**
     * 初始化一个新创建的 AjaxResult 对象，使其表示一个空消息。
     */
    public Result() {
    }

    /**
     * 初始化一个新创建的 AjaxResult 对象
     *
     * @param code 状态码
     * @param msg  返回内容
     */
    public Result(int code, String msg) {
        super.put("code", code);
        super.put("msg", msg);
    }

    /**
     * 初始化一个新创建的 AjaxResult 对象
     *
     * @param code 状态码
     * @param msg  返回内容
     * @param data 数据对象
     */
    public Result(int code, String msg, Object data) {
        super.put("code", code);
        super.put("msg", msg);
        if (data !=null) {
            super.put("data", data);
        }
    }
    public static Result success(Object data) {
        Result result = new Result();
        result.put("code", 2000);
        result.put("msg","成功");
        if (data !=null) {
            result.put("data", data);
        }
        return result;
    }
}
