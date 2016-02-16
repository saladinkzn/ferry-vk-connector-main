package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Error {
    @JsonProperty("error_code")
    private int errorCode;
    @JsonProperty("error_msg")
    private String errorMessage;
    @JsonProperty("request_params")
    private List<RequestParam> requestParams;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public List<RequestParam> getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(List<RequestParam> requestParams) {
        this.requestParams = requestParams;
    }


    @Override
    public String toString() {
        return "Error{" +
                "errorCode=" + errorCode +
                ", errorMessage='" + errorMessage + '\'' +
                ", requestParams=" + requestParams +
                '}';
    }
}
