package org.dromara.email.comm.config;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * MailSmtpConfig
 * <p> smtp协议配置文件
 * @author :Wind
 * 2023/6/7  21:19
 **/
@Builder
@ToString
@Getter
@EqualsAndHashCode
public class MailSmtpConfig {
    /**
     * 端口号
     * */
    private String port;

    /**
     * 发件人地址
     * */
    private String fromAddress;

    /**
     * 服务器地址
     * */
    private String smtpServer;

    /**
     * 账号
     * */
    private String username;

    /**
     * 密码
     * */
    private String password;

    /**
     * 是否开启ssl 默认开启
     * */
    @Builder.Default
    private String isSSL = "true";

    /**
     * 是否开启验证 默认开启
     * */
    @Builder.Default
    private String isAuth = "true";
}