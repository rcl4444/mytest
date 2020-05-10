package com.rcl.sn.vo;

import lombok.Data;

public abstract class SelectSuningResponse extends SuningResponse {
    @Data
    public static class SnHead {
        Integer pageNo;
        Integer pageTotal;
        Integer totalSize;
        String returnMessage;
    }
}
