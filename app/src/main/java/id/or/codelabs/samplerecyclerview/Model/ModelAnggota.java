package id.or.codelabs.samplerecyclerview.Model;

/**
 * Created by bayu on 21/11/15.
 */
public class ModelAnggota {
    private int foto;
    private String nama;
    private String kelas;

    public ModelAnggota(int foto, String nama, String kelas) {
        this.foto = foto;
        this.nama = nama;
        this.kelas = kelas;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}
