package com.freewill.admin.common.security.session;

import lombok.Data;
import org.apache.shiro.session.mgt.SimpleSession;

@Data
public class OnlineSession extends SimpleSession {
    public static enum OnlineStatus {
        on_line("在线"), hidden("隐身"), force_logout("强制退出");
        private final String info;

        private OnlineStatus(String info) {
            this.info = info;
        }

        public String getInfo() {
            return info;
        }
    }

    private String userAgent; //用户浏览器类型
    private OnlineStatus status = OnlineStatus.on_line; //在线状态
    private String systemHost; //用户登录时系统IP
    //省略其他
}