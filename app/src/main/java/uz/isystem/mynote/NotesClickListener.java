package uz.isystem.mynote;

import androidx.cardview.widget.CardView;

import uz.isystem.mynote.core.models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);

    void onLongClick(Notes notes, CardView cardView);
}
