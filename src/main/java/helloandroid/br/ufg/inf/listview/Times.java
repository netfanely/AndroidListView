package listview.br.ufg.inf.listviewexample;

import java.io.Serializable;

/**
 * Created by Alunoinf_2 on 01/02/2019.
 */

public class Times {


    private int images;
    private String nome;

    public Times(int images, String nome) {
        this.images = images;
        this.nome = nome;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
