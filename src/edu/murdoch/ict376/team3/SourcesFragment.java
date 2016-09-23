package edu.murdoch.ict376.team3;

import android.os.Bundle;
import android.widget.TextView;
import android.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CheckBox;
public class SourcesFragment extends Fragment {
	private CheckBox mCheckPhoneSource;
	private CheckBox mCheckSimSource;
	private boolean mUsePhone;
	private boolean mUseSim;
	
	@Override public View onCreateView(LayoutInflater inf, ViewGroup cont, Bundle savedInState) {
		View view = inf.inflate(R.layout.fragment_sources, cont, false);
		
		mUsePhone = false;
		mUseSim = false;

		mCheckPhoneSource = (CheckBox) view.findViewById(R.id.use_source_phone);
		mCheckPhoneSource.setOnClickListener(new OnClickListener() {
			@Override public onClick(View v) {
				if (mCheckPhoneSource.isChecked()) {
					mUsePhone = true;
				} else {
					mUsePhone = false;
				}
				setSources();
			}
		});
		return view;
	}
	private void setSources() {
		getActivity.setSources(mUsePhone,mUseSim,false);
	}
	
}
