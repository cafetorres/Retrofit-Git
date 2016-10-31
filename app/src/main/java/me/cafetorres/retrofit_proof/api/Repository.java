package me.cafetorres.retrofit_proof.api;

/**
 * Created by Carlos on 31/10/2016.
 */
public class Repository {
    private String id;
    private String name;

    @Override
    public String toString(){
        return id + "/"+ name;
    }
}
