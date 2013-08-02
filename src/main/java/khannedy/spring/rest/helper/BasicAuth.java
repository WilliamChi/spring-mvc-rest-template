package khannedy.spring.rest.helper;

import org.apache.commons.codec.binary.Base64;

import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;

/**
 * Created by pakarjava on 8/2/13.
 */
public class BasicAuth implements Serializable {

    private String username;
    private String password;

    public BasicAuth(HttpServletRequest servletRequest) {
        String header = servletRequest.getHeader("Authorization");
        if (header != null) {
            header = header.replaceAll("Basic ", "");

            String[] values = new String(Base64.decodeBase64(header)).split(":");
            if (values.length == 2) {
                username = values[0];
                password = values[1];
            }
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
