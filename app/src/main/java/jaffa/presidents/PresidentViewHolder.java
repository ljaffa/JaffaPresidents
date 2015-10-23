package jaffa.presidents;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by libby on 10/22/2015.
 */
public class PresidentViewHolder extends RecyclerView.ViewHolder{
    private TextView name;
    /**itemView is the president_list_item that was created.
     * the entire row that contains the textview with the presidents name
     */
    public PresidentViewHolder(View itemView){
        super(itemView);
        name = (TextView) itemView.findViewById(R.id.name);
    }

    public void bind(President president){
        name.setText(president.getPresident());
    }

}
