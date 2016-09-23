package edu.murdoch.ict376.team3;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.os.Bundle;
import android.widget.TextView;
import android.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class ContactsListFragment extends Fragment {
	private RecyclerView mRecycler;
	private Adapter mAdapter;

	@Override public View onCreateView(LayoutInflater inf, ViewGroup cont, Bundle savedInState) {
		View view = inf.inflate(R.layout.fragment_recycler, cont, false);
		
		mRecycler = (RecyclerView) view.findViewById(R.id.recycler_view);
		mRecycler.setLayoutManager(new LinearLayoutManager(getActivity()));
		updateUI();
		return view;
	}
	private void updateUI() {
		mAdapter = new Adapter();
		mRecycler.setAdapter(mAdapter);
	}
    private class ViewHolder extends RecyclerView.ViewHolder {
    	public TextView mTextView;
    	
    	public ViewHolder(View itemView) {
    		super(itemView);
    		mTextView = (TextView) itemView;
    	}
    }
  	private class Adapter extends RecyclerView.Adapter<ViewHolder> {
  		private String mContactNames[];
  		
  		public Adapter() {
  		mStrings = new String[100];
  			for (int i=0; i<100; i++) {
  				mStrings[i] = String.valueOf(i);
  			}
  		}
  		@Override public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
  			LayoutInflater layoutInflater = LayoutInflater.from(getActivity());
  			View view = layoutInflater.inflate(android.R.layout.simple_list_item_1,parent,false);
  			return new ViewHolder(view);
  		}
  		@Override public void onBindViewHolder(ViewHolder holder, int position) {
//  			String string = mStrings[position];
  			holder.mTextView.setText("Fragment "+String.valueOf(position));
  		}
  		@Override public int getItemCount() {
  			return 100;
  		}
  	}

}
