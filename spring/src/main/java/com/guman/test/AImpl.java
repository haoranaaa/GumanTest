package com.guman.test;

import org.springframework.stereotype.Service;

/**
 * @author duanhaoran
 * @since 2019/7/1 4:59 PM
 */
@Service("aImpl")
public class AImpl implements TestInterface {
    @Override
    public String getStr() {
        return "A";
    }
}
