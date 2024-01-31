package cn.sx.cloud.module.api.system.user.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Set;


@Data
@Accessors(chain = true)
public class AdminUserTestDTO {

    private Long id;

    private String nickname;

    private Integer status; // 参见 CommonStatusEnum 枚举

    private Long deptId;

    private Set<Long> postIds;

    private String mobile;
}
