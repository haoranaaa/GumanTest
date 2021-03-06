package com.guman.raft.rpc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author duanhaoran
 * @since 2019/7/28 6:43 PM
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Request<T> implements Serializable {

    /** 请求投票 */
    public static final int R_VOTE = 0;
    /** 附加日志 */
    public static final int A_ENTRIES = 1;
    /** 客户端 */
    public static final int CLIENT_REQ = 2;
    /** 配置变更. add*/
    public static final int CHANGE_CONFIG_ADD = 3;
    /** 配置变更. remove*/
    public static final int CHANGE_CONFIG_REMOVE = 4;

    private String url;

    private int cmd = -1;

    private T obj;

    @Override
    public String toString() {
        return "Request{" +
                "url='" + url + '\'' +
                ", cmd=" + cmd +
                ", obj=" + obj +
                '}';
    }
}
