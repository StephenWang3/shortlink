package com.nageoffer.shortlink.admin.dto.req;

import lombok.Data;

/**
 * 短链接新增分组请求参数
 */
@Data
public class ShortLinkGroupSaveReqDTO {
    /**
     * 分组名
     */
    private String name;
}
