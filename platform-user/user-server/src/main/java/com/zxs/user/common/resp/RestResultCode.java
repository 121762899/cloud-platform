package com.zxs.user.common.resp;

/**
 * Created by sunyinglong on 2020/7/6
 */
public enum RestResultCode {

    // 通用错误码
    ERR_SUCCESS(10000, "OK"),
    ERR_OTHER(10001, "Error"),
    ERR_REQUEST_PARA_ERR(10002, "Missing or invalid parameter"),
    ERR_INVALID_AUTH(10003, "Invalid or expired authorization"),
    ERR_ACCESS_DENIED(10004, "Access denied"),
    ERR_BAD_REQUEST(10005, "Bad request"),
    ERR_NOT_AUTH(10006, "not authority"),
    ERR_NOT_FIND(10007, "not find"),

    // user error
    ERR_USER_IM_TOKEN_ERROR(20000, "IM token error"),
    ERR_USER_SEND_CODE_OVER_FREQUENCY(20001, "send code over frequency"),
    ERR_USER_FAILURE_EXTERNAL(20002, "send sms failure"),
    ERR_USER_INVALID_PHONE_NUMBER(20003, "invalid phone number"),
    ERR_USER_NOT_SEND_CODE(20004, "not send code"),
    ERR_USER_VERIFY_CODE_INVALID(20005, "verify code invalid"),
    ERR_USER_VERIFY_CODE_EMPTY(20006, "verify code empty"),
    ERR_USER_SEARCH_OUT_NUMBER(20007, "query users more than"),

    // 房间相关 error
    ERR_ROOM_CREATE_ROOM_ERROR(30000, "Create room error"),
    ERR_ROOM_NOT_EXIST(30001, "Room not exist"),
    ERR_ROOM_IS_EXIST(30016, "Room is exist"),
    ERR_ROOM_USER_IDS_SIZE_EXCEED(30002, "The number of userIds cannot exceed 20"),
    ERR_ROOM_ADD_BLOCK_USER_ERROR(30003, "failed to add block user"),
    ERR_ROOM_USER_IS_NOT_IN(30004, "user is not in the chatroom"),
    ERR_ROOM_USER_IS_ALREADY_IN_MIC(30005, "user is already in mic"),
    ERR_ROOM_USER_IS_APPLIED_FOR_MIC(30006, "user is applied for mic"),
    ERR_ROOM_USER_IS_NOT_APPLIED_FOR_MIC(30007, "user is not applied for mic"),
    ERR_ROOM_USER_IS_NOT_IN_MIC(30008, "user is not in mic"),
    ERR_ROOM_USER_IS_NOT_EXIST(30017, "user is not exist"),
    ERR_ROOM_IS_PK(30018, "room in pk"),
    ERR_ROOM_NO_MIC_AVAILABLE(30009, "No available mic"),
    ERR_ROOM_USER_ALREADY_THE_HOST(30010, "You're already the host"),
    ERR_ROOM_TRANSFER_INFO_INVALID(30011, "The transfer host info invalid"),
    ERR_ROOM_ADD_GAG_USER_ERROR(30012, "Failed to gag user"),
    ERR_ROOM_TAKEOVER_INFO_INVALID(30013, "The takeover host info invalid"),
    ERR_ROOM_MIC_NOT_ALLOWED_LOCK(30014, "The mic is not allowed to be locked, someone is already in mic"),
    ERR_ROOM_MIC_NOT_ALLOWED_CLOSE_MIC(30015, "The mic is not allowed to close mic, no user in mic"),
    ERR_ROOM_MUSIC_NOT_EXIST(30016, "music not exist"),

    // APP Version 相关错误码
    ERR_APP_VERSION_ALREADY_EXIST(40000, "app version already existed"),
    ERR_APP_VERSION_NOT_EXIST(40001, "app version not found"),
    ERR_APP_NO_NEW_VERSIONS(40002, "no new versions"),

    // 用户积分账号相关错误码
    ERR_ACCOUNT_SCORE_NULL(50001, "err_account_score_null"),
    ERR_ACCOUNT_SCORE_INSUFFICIENT(50001, "err_account_score_insufficient"),

    ;

    private int code;
    private String msg;

    RestResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}
