package spring.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthToken {

    private Integer id;

    //用户id
    private Integer userId;

    //成功token
    private String accessToken;

    //过期时间
    private Long accessExpire;

    //时间戳
    private Long tokenTimestamp;

    //是否有效
    private Byte isActive=1;

    //创建时间
    private Date createTime;

    //修改时间
    private Date updateTime;
}
