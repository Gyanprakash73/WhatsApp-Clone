package com.gyan.whatsapp.activity.camera;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.gyan.whatsapp.MainActivity;
import com.gyan.whatsapp.databinding.ActivitySendPicBinding;
import com.squareup.picasso.Picasso;

import java.util.UUID;

public class SendPicActivity extends AppCompatActivity {

    private Uri imageUri;
    ActivitySendPicBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySendPicBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        imageUri = MainActivity.imageUri;

        setInfo();
        initClick();

    }


    private void initClick() {
        binding.btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

//        binding.btnSend.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new FirebaseService(AddStatusPicActivity.this).uploadImageToFireBaseStorage(imageUri, new FirebaseService.OnCallBack() {
//                    @Override
//                    public void onUploadSuccess(String imageUrl) {
//                        StatusModel status = new StatusModel();
//                        status.setId(UUID.randomUUID().toString());
//                        status.setCreatedDate(new ChatService(AddStatusPicActivity.this).getCurrentDate());
//                        status.setImageStatus(imageUrl);
//                        status.setUserID(FirebaseAuth.getInstance().getUid());
//                        status.setViewCount("0");
//                        status.setTextStatus(binding.edDescription.getText().toString());
//
//                        new FirebaseService(AddStatusPicActivity.this).addNewStatus(status, new FirebaseService.OnAddNewStatusCallBack() {
//                            @Override
//                            public void onSuccess() {
//                                Toast.makeText(getApplicationContext(),"Success",Toast.LENGTH_SHORT).show();
//                                finish();
//                            }
//
//                            @Override
//                            public void onFailed() {
//                                Toast.makeText(getApplicationContext(),"Something went wrong",Toast.LENGTH_SHORT).show();
//                                finish();
//                            }
//                        });
//                    }
//
//                    @Override
//                    public void onUploadFailed(Exception e) {
//                        Log.e("TAG", "onUploadFailed: ",e );
//                    }
//                });
//            }
//        });

    }

    private void setInfo() {
        Picasso.get().load(imageUri).into(binding.imageView);
    }

}