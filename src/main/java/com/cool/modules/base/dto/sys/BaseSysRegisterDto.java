package com.cool.modules.base.dto.sys;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 注册请求参数
 */
@Getter
@Setter
@Schema(description = "注册参数")
public class BaseSysRegisterDto {
    @Schema(description = "部门ID")
    private Long departmentId;

    @Schema(description = "用户名")
    @NotBlank(message = "用户名不能为空")
    @Size(min = 3, max = 20, message = "用户名长度应在 3 到 20 个字符之间")
    private String username;

    @Schema(description = "密码")
    @NotBlank(message = "密码不能为空")
    @Size(min = 6, message = "密码长度至少为 6 个字符")
    private String password;

    @Schema(description = "昵称")
    @NotBlank(message = "昵称不能为空")
    @Size(min = 1, max = 20, message = "昵称长度应在 1 到 20 个字符之间")
    private String nickname;

    @Schema(description = "姓名")
    @NotBlank(message = "姓名不能为空")
    private String name;

    @Schema(description = "状态，1 为启用，0 为禁用")
    private Integer status;

    @Schema(description = "角色ID列表")
    private Long[] roleIdList;


}
