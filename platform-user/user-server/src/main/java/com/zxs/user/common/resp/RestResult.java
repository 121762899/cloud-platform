package com.zxs.user.common.resp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.zxs.user.common.utils.GsonUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "公共返回对象")
public class RestResult<T> {

    @JsonProperty("code")
    @ApiModelProperty(value = "返回状态码", notes = "除了 10000 都是失败")
    private int code;

    @JsonInclude(Include.NON_NULL)
    @JsonProperty("msg")
    @ApiModelProperty(value = "返回语句", notes = "失败原因或者其他提示")
    private String msg;

    @JsonProperty("data")
    @ApiModelProperty(value = "返回实体类")
    private Object result = null;

    public RestResult setCode(int code) {
        this.code = code;
        return this;
    }

    public int getCode() {
        return this.code;
    }

    public RestResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public String getMsg() {
        return this.msg;
    }

    public RestResult setResult(Object value) {
        this.result = value;
        return this;
    }

    public Object getResult() {
        return this.result;
    }

    public Object build() {
        return this;
    }

    public static RestResult success() {
        return new RestResult().setCode(RestResultCode.ERR_SUCCESS.getCode());
    }

    public static RestResult success(Object o) {
        return RestResult.success().setResult(o);
    }

    public static RestResult generic(RestResultCode code) {
        return new RestResult().setCode(code.getCode()).setMsg(code.getMsg());
    }

    public static RestResult generic(RestResultCode code, String msg) {
        return new RestResult().setCode(code.getCode()).setMsg(msg);
    }

    public static RestResult generic(RestResultCode code, Object object) {
        RestResult result = new RestResult().setCode(code.getCode()).setResult(object);
        if (code != RestResultCode.ERR_SUCCESS) {
            result.setMsg(code.getMsg());
        }
        return result;
    }

    public static <T> RestResult<T> genericObj(RestResultCode code, T object) {
        RestResult<T> result = new RestResult<>().setCode(code.getCode()).setResult(object);
        if (code != RestResultCode.ERR_SUCCESS) {
            result.setMsg(code.getMsg());
        }
        return result;
    }

    public static RestResult generic(int code, String msg) {
        return new RestResult().setCode(code).setMsg(msg);
    }

    @JsonIgnore
    public boolean isSuccess() {
        return this.code == RestResultCode.ERR_SUCCESS.getCode();
    }

    @Override
    public String toString() {
        return GsonUtil.toJson(this, RestResult.class);
    }
}
