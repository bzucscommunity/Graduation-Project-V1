package graduation.project.bzu.cscomunity.Activities;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import graduation.project.bzu.cscomunity.Adapters.GridSubjectsListAdapter;
import graduation.project.bzu.cscomunity.DataModels.Subject;
import graduation.project.bzu.cscomunity.R;

import static android.view.View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN;

public class CreatePost extends AppCompatActivity {

    EditText postSubject,postTitle,postTags,postBody;
    Button submit;

    @Override
    protected void onResume(){
        super.onResume();
        View decorView = getWindow().getDecorView();
// Hide both the navigation bar and the status bar.
// SYSTEM_UI_FLAG_FULLSCREEN is only available on Android 4.1 and higher, but as
// a general rule, you should design your app to hide the status bar whenever you
// hide the navigation bar.
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN ;
        decorView.setSystemUiVisibility(uiOptions);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getSupportActionBar().hide();
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        //          WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.create_post_layout);
        submit=(Button)findViewById(R.id.post_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CreatePost.this,"Success",Toast.LENGTH_SHORT).show();
                submitPost();
            }
        });

    }

    private void submitPost(){
        String post_url="http://192.168.1.111:8080/api/post";
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        postSubject=findViewById(R.id.post_subject);
        postTitle=findViewById(R.id.post_title);
        postTags=findViewById(R.id.post_tags);
        postBody=findViewById(R.id.post_body);
        JSONObject postData = new JSONObject();



        try {
            postData.put("postType","Question");
            postData.put("postSubject", postSubject.getText().toString().trim());
            postData.put("postTitle", postTitle.getText().toString().trim());
            postData.put("postTags", postTags.getText().toString().trim());
            postData.put("postBody", postBody.getText().toString().trim());
            postData.put("postAttachment", "Attachment");

        } catch (JSONException e) {
            e.printStackTrace();
        }

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, post_url, postData, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.d("tag", response.toString());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
                Log.d("tag", "onErrorResponse:ERROR");
            }
        });

        requestQueue.add(jsonObjectRequest);

    }
}
