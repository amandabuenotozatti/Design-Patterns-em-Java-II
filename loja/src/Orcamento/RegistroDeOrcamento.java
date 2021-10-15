package Orcamento;

import http.HttpAdapter;
import sun.rmi.transport.ObjectTable;

import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento){
        String url = "http://api.externa/orcamento";
        Map<String, Object> = Map.of()
        http.post(url, dados);
    }

}
