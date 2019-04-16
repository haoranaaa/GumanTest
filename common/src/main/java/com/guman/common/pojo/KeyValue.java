package com.guman.common.pojo;

/**
 * @author duanhaoran
 * @since 2019/4/15 8:11 PM
 */
public class KeyValue {
    private Object key;

    private Object value;

    public KeyValue() {
    }

    public KeyValue(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
