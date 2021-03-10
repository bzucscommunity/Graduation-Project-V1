package graduation.project.bzu.cscomunity.Adapters;
import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;
        import androidx.annotation.NonNull;
        import androidx.recyclerview.widget.RecyclerView;
        import com.squareup.picasso.Picasso;

import java.util.List;

import graduation.project.bzu.cscomunity.DataModels.Subject;
import graduation.project.bzu.cscomunity.R;


public class GridSubjectsListAdapter extends RecyclerView.Adapter<GridSubjectsListAdapter.ViewHolder> {

    LayoutInflater inflater;
    List<Subject> subjects;

    public GridSubjectsListAdapter(Context context, List<Subject> subjects){
        this.inflater=LayoutInflater.from(context);
        this.subjects = subjects;


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =inflater.inflate(R.layout.grid_subject_list_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.subjectName.setText(subjects.get(position).getName());
        Picasso.get().load(subjects.get(position).getImageURL()).into(holder.subjectImage);

    }

    @Override
    public int getItemCount() {
        return subjects.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView subjectName;
        ImageView subjectImage;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            subjectName=itemView.findViewById(R.id.subjectTitle);
            subjectImage=itemView.findViewById(R.id.coverImage);

        }
    }
}