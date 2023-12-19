package com.example.petapp;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest  extends StringRequest {
    private static final String REGISTER_REQUEST_URL="http://localhost/register.php";
    private final Map<String,String> params;
    public RegisterRequest (String nombre, String apellido, String email, String contrasena, Response.Listener<String>listener){

        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params=new HashMap<>();
        params.put("nombre", nombre);
        params.put("apellido", apellido);
        params.put("email", email);
        params.put("contrasena", contrasena);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
