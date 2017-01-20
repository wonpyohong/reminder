package com.wonpyohong.reminder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class NotePreviewViewHolder extends RecyclerView.ViewHolder {
	@BindView(R.id.note_title)
	TextView titleTextView;

	@BindView(R.id.note_body)
	TextView bodyTextView;

	NotePreviewViewHolder(View itemView) {
		super(itemView);

		ButterKnife.bind(this, itemView);
	}
}
