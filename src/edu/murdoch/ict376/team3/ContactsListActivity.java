package edu.murdoch.ict376.team3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Fragment;
import android.database.Cursor;
import android.content.ContentResolver;
import android.net.Uri;
import android.provider.ContactsContract;
import android.content.Intent;

public class ContactsListActivity extends Activity
{
	private Vector<Uri> mSourceURIs;
	private Vector<Uri> mOutputURIs;

	private static final String KEY_SOURCE_URIS = 
		"edu.murdoch.ict376.team3.source_uris";

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactslist);
        
        mSourceURIs = new Vector<Uri>;
        mOutputURIs = new Vector<Uri>;
        
        FragmentManager fm = getFragmentManager();
        Fragment f = fm.findFragmentById(R.id.fragment_container);
      	if (f == null) {
			f = new ContactsListFragment();
			FragmentTransaction ft = fm.beginTransaction();
			ft.add(R.id.fragment_container, f);
			ft.commit();
		}
    }
    public static Intent newIntent(Context packageContext, 
}
