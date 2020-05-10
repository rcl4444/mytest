package com.rcl.sn.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class SuningRequestDto<T> {
    @JsonProperty("sn_request")
    T request;
}
