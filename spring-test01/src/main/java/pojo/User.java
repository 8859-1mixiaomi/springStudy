package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author xiaomi
 * @date 2021-11-24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String id;
    private String  name;
    private int age;
    private String sex;
}
