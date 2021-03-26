package graduation.project.bzu.cscomunity.Adapters;
        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.VideoView;

        import androidx.annotation.NonNull;
        import androidx.constraintlayout.widget.ConstraintLayout;
        import androidx.recyclerview.widget.RecyclerView;
        import com.squareup.picasso.Picasso;

        import java.util.List;

        import graduation.project.bzu.cscomunity.DataModels.Post;
        import graduation.project.bzu.cscomunity.DataModels.Subject;
        import graduation.project.bzu.cscomunity.R;


public class GetPostsAdapter extends RecyclerView.Adapter<GetPostsAdapter.ViewHolder> {

    LayoutInflater inflater;
    List<Post> posts;

    public GetPostsAdapter(Context context, List<Post> posts){
        this.inflater=LayoutInflater.from(context);
        this.posts = posts;


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =inflater.inflate(R.layout.activity_view_post,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       // holder.userName.setText(posts.get(position).getUserID());

        if(posts.get(position).getPostType().equals("Question")){
        holder.postType.setText("Q");}
        else if(posts.get(position).getPostType().equals("Topic")){
            holder.postType.setText("T");}

        holder.postTitle.setText(posts.get(position).getPostTitle());
        holder.postContent.setText(posts.get(position).getPostBody());
        String tagsString=posts.get(position).getPostTags();
        String[] tagsArray=tagsString.split(",");
        if(tagsArray.length==1){
            holder.tag1.setText(tagsArray[0]);
            holder.tag1.setVisibility(View.VISIBLE);
            holder.tags.setVisibility(View.VISIBLE);
        }else if(tagsArray.length==2){
            holder.tag1.setText(tagsArray[0]);
            holder.tag2.setText(tagsArray[1]);
            holder.tag1.setVisibility(View.VISIBLE);
            holder.tag2.setVisibility(View.VISIBLE);
            holder.tags.setVisibility(View.VISIBLE);
        }else if(tagsArray.length==3){
            holder.tag1.setText(tagsArray[0]);
            holder.tag2.setText(tagsArray[1]);
            holder.tag3.setText(tagsArray[2]);
            holder.tag1.setVisibility(View.VISIBLE);
            holder.tag2.setVisibility(View.VISIBLE);
            holder.tag3.setVisibility(View.VISIBLE);
            holder.tags.setVisibility(View.VISIBLE);
        }else if(tagsArray.length==4){
            holder.tag1.setText(tagsArray[0]);
            holder.tag2.setText(tagsArray[1]);
            holder.tag3.setText(tagsArray[2]);
            holder.tag4.setText(tagsArray[3]);
            holder.tag1.setVisibility(View.VISIBLE);
            holder.tag2.setVisibility(View.VISIBLE);
            holder.tag3.setVisibility(View.VISIBLE);
            holder.tag4.setVisibility(View.VISIBLE);
            holder.tags.setVisibility(View.VISIBLE);

        }else if(tagsArray.length==5) {
            holder.tag1.setText(tagsArray[0]);
            holder.tag2.setText(tagsArray[1]);
            holder.tag3.setText(tagsArray[2]);
            holder.tag4.setText(tagsArray[3]);
            holder.tag5.setText(tagsArray[4]);
            holder.tag1.setVisibility(View.VISIBLE);
            holder.tag2.setVisibility(View.VISIBLE);
            holder.tag3.setVisibility(View.VISIBLE);
            holder.tag4.setVisibility(View.VISIBLE);
            holder.tag5.setVisibility(View.VISIBLE);
            holder.tags.setVisibility(View.VISIBLE);

        }


        //Picasso.get().load(subjects.get(position).getImageURL()).into(holder.subjectImage);

    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView userName,postTime,postType,postTitle,postContent,tag1,tag2,tag3,tag4,tag5,postViews,postComments,postShares;
        ImageView userImage,postMoreMenu,image1,image2,image3,image4,image5;
        VideoView video1,video2,video3,video4,video5;
        ConstraintLayout tags,imagesPreviews,videosPreviews;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            userName=itemView.findViewById(R.id.userName);
            postTime=itemView.findViewById(R.id.post_time);
            postType=itemView.findViewById(R.id.postType);
            postTitle=itemView.findViewById(R.id.post_Title);
            postContent=itemView.findViewById(R.id.post_content);
            tag1=itemView.findViewById(R.id.tag1);
            tag2=itemView.findViewById(R.id.tag2);
            tag3=itemView.findViewById(R.id.tag3);
            tag4=itemView.findViewById(R.id.tag4);
            tag5=itemView.findViewById(R.id.tag5);

            postViews=itemView.findViewById(R.id.post_views);
            postComments=itemView.findViewById(R.id.post_comments);
            postShares=itemView.findViewById(R.id.post_shares);
            userImage=itemView.findViewById(R.id.userImage);
            postMoreMenu=itemView.findViewById(R.id.post_more_menu);
            image1=itemView.findViewById(R.id.image_preview1);
            image2=itemView.findViewById(R.id.image_preview2);
            image3=itemView.findViewById(R.id.image_preview3);
            image4=itemView.findViewById(R.id.image_preview4);
            image5=itemView.findViewById(R.id.image_preview5);
            video1=itemView.findViewById(R.id.video_preview1);
            video2=itemView.findViewById(R.id.video_preview2);
            video3=itemView.findViewById(R.id.video_preview3);
            video4=itemView.findViewById(R.id.video_preview4);
            video5=itemView.findViewById(R.id.video_preview5);
            tags=itemView.findViewById(R.id.tags);
            imagesPreviews=itemView.findViewById(R.id.images_previews);
            videosPreviews=itemView.findViewById(R.id.videos_previews);

        }
    }
}