package app.utils;

/**
 * Represents the response body of a request.
 * @param <T> the type of the body.
 */
public class ResponseEntity <T> {
    private T content;
    private Integer code;

    public ResponseEntity() {
    }

    public ResponseEntity(T content, Integer code) {
        this.content = content;
        this.code = code;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ResponseEntity{" +
                "content=" + content +
                ", code=" + code +
                '}';
    }
}
