package rpc_servidor_cliente;

/**
 *
 * @author miguel
 */
public class Suma {
    public String suma(String a, String b){
        return String.valueOf(Integer.parseInt(a) + Integer.parseInt(b));
    }
}
