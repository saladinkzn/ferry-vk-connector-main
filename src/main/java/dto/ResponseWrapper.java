package dto;

/**
 * @author sala
 */
public class ResponseWrapper<T> {
    private T response;
    private Error error;

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }


    @Override
    public String toString() {
        return "ResponseWrapper{" +
                "response=" + response +
                ", error=" + error +
                '}';
    }
}
