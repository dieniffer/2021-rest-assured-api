package api.body;

import lombok.Getter;
import java.lang.String;

@Getter
public class Post {
    private String userId;
    private String title;
    private String body;
}
