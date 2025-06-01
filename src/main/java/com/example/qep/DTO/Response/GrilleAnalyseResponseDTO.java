package com.example.qep.DTO.Response;

import com.example.qep.DTO.ParametreDTO;

import java.util.List;

public class GrilleAnalyseResponseDTO {
    private Long id;
    private String code;
    private List<ParametreDTO> parametres;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public List<ParametreDTO> getParametres() { return parametres; }
    public void setParametres(List<ParametreDTO> parametres) { this.parametres = parametres; }
}
