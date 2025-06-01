package com.example.qep.DTO.Request;

import java.util.List;

public class GrilleAnalyseRequestDTO {
    private String code;
    private List<Long> parametresIds;

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public List<Long> getParametresIds() { return parametresIds; }
    public void setParametresIds(List<Long> parametresIds) { this.parametresIds = parametresIds; }
}
