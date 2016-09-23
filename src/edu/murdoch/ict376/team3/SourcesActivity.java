package edu.murdoch.ict376.team3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;
import android.widget.Toast;
import android.widget.Button;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.Fragment;
import android.database.Cursor;
import android.content.ContentResolver;
import android.net.Uri;
import android.provider.ContactsContract;
import java.util.Vector;

public class SourcesActivity extends Activity
{
	private Button mListButton;

	private Vector<Uri> mSourceURIs;
	private Vector<Uri> mOutputURIs;
	private Uri mPhoneURI;
	private Uri mSimURI;
	private Uri mSim2URI;
	
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sources);
        
        FragmentManager fm = getFragmentManager();
        Fragment f = fm.findFragmentById(R.id.fragment_container);
      	if (f == null) {
			f = new SourcesFragment();
			FragmentTransaction ft = fm.beginTransaction();
			ft.add(R.id.fragment_container, f);
			ft.commit();
		}

		mSourceURIs = new Vector<Uri>();
		mPhoneURI = ContactsContract.Contacts.CONTENT_URI;
		mListButton = (Button) findViewById(R.id.to_list_button);
		mListButton.setOnClickListener(new View.OnClickListener() {
			@Override public void onClick(View v) {
				Intent i = new Intent(SourcesActivity.this,ContactsListActivity.class);
				startActivity(i);
			}
		});
		
    }
    public void setSources(boolean phone, boolean sim, boolean sim2) {
    	mSourceURIs.clear();
		if (phone) {
	    	mSourceURIs.add(mPhoneURI);
		} else if (sim) {
			mSourceURIs.add(mSimURI);
		} else if (sim2) {
			mSourceURIs.add(mSim2URI);
		}
    }
    public void setOutputs(boolean phone, boolean sim, boolean sim2) {
    	mOutputPhone = phone;
    	mOutputSim = sim;
    	mOutputSim2 = sim2;
    }
	public void deleteOriginals(boolean delete) {
		mDeleteOriginals = delete;
	}
}
