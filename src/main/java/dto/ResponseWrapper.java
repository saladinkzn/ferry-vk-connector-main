package dto;

/**
 * @author sala
 */
public class ResponseWrapper<T> {
    private T response;

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }


    @Override
    public String toString() {
        return "ResponseWrapper{" +
                "response=" + response +
                '}';
    }
}
