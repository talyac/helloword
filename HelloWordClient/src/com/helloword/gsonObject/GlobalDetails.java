package com.helloword.gsonObject;

public class GlobalDetails {
    String sessionID;
    String errorCode;
    String error;
    UserFullInfo userInfo;

    public String getSessionID() {
        return sessionID;
    }

    public void setSessionID(String string) {
        this.sessionID = string;
    }
    
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String string) {
        this.errorCode = string;
    }
    
    public String getError() {
        return error;
    }

    public void setError(String string) {
        this.error = string;
    }

    public UserFullInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserFullInfo userInfo) {
        this.userInfo = userInfo;
    }
    
}
