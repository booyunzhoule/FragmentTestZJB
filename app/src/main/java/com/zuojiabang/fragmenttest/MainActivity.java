package com.zuojiabang.fragmenttest;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;

import android.widget.TextView;

import org.wordpress.android.editor.EditorFragment;
import org.wordpress.android.editor.EditorFragmentAbstract;
import org.wordpress.android.util.helpers.MediaFile;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements EditorFragment.EditorDragAndDropListener, EditorFragment.EditorFragmentListener{
    private EditorFragment editorFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editorFragment = new EditorFragment();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.test_fragment, editorFragment, "editorFragment");
        fragmentTransaction.commit();
    }

    @Override
    public void onMediaDropped(ArrayList<Uri> mediaUri) {

    }

    @Override
    public void onRequestDragAndDropPermissions(DragEvent dragEvent) {

    }

    @Override
    public void onEditorFragmentInitialized() {

    }

    @Override
    public void onSettingsClicked() {

    }

    @Override
    public void onAddMediaClicked() {

    }

    @Override
    public void onMediaRetryClicked(String mediaId) {

    }

    @Override
    public void onMediaUploadCancelClicked(String mediaId, boolean delete) {

    }

    @Override
    public void onFeaturedImageChanged(long mediaId) {

    }

    @Override
    public void onVideoPressInfoRequested(String videoId) {

    }

    @Override
    public String onAuthHeaderRequested(String url) {
        return null;
    }

    @Override
    public void saveMediaFile(MediaFile mediaFile) {

    }

    @Override
    public void onTrackableEvent(EditorFragmentAbstract.TrackableEvent event) {

    }
}
