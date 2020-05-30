package com.company;

public class Nome {

    private String prefixo;
    private String sufixo;

    public Nome(String prefixo, String sufixo) {
        this.prefixo = prefixo;
        this.sufixo = sufixo;
    }

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getSufixo() {
        return sufixo;
    }

    public void setSufixo(String sufixo) {
        this.sufixo = sufixo;
    }
}
