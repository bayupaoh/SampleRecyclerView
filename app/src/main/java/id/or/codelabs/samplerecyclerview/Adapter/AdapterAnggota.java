package id.or.codelabs.samplerecyclerview.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import id.or.codelabs.samplerecyclerview.Model.ModelAnggota;
import id.or.codelabs.samplerecyclerview.R;

/**
 * Created by bayu on 22/11/15.
 */
public class AdapterAnggota extends RecyclerView.Adapter<AdapterAnggota.ViewHolderAnggota> {

    private ArrayList<ModelAnggota> listAnggota;

    public AdapterAnggota(ArrayList<ModelAnggota> listAnggota) {
        this.listAnggota = listAnggota;
    }

    @Override
    public ViewHolderAnggota onCreateViewHolder(ViewGroup parent, int viewType) {
        //create new view
        View viewItem = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_recyclerview_anggota,null);

        //create view holder
        ViewHolderAnggota view = new ViewHolderAnggota(viewItem);
        return view;
    }

    @Override
    public void onBindViewHolder(ViewHolderAnggota holder, int position) {
        holder.fotoProfil.setImageResource(listAnggota.get(position).getFoto());
        holder.namaAnggota.setText(listAnggota.get(position).getNama());
        holder.posisiAnggota.setText(listAnggota.get(position).getKelas());
    }

    @Override
    public int getItemCount() {
        return listAnggota.size();
    }

    public class ViewHolderAnggota extends RecyclerView.ViewHolder {
        public ImageView fotoProfil;
        public TextView namaAnggota;
        public TextView posisiAnggota;

        public ViewHolderAnggota(View itemView) {
            super(itemView);
            fotoProfil = (ImageView) itemView.findViewById(R.id.img_fotoprofil);
            namaAnggota = (TextView) itemView.findViewById(R.id.text_nama);
            posisiAnggota = (TextView) itemView.findViewById(R.id.text_posisi);
        }
    }

}



