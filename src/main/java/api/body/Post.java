package api.body;

import lombok.*;
import java.lang.String;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class Post {
    private String userId;
    private String title;
    private String body;
    private int id;
}
