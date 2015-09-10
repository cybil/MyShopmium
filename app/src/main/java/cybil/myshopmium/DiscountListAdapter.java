package cybil.myshopmium;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Cybil on 09/09/2015.
 */
public class DiscountListAdapter extends BaseAdapter {

    Context context;
    ArrayList<DiscountItem> data;
    private static LayoutInflater inflater = null;

    public DiscountListAdapter(Context context, ArrayList<DiscountItem> data) {
        this.context = context;
        this.data = data;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View vi = convertView;
        if (vi == null)
            vi = inflater.inflate(R.layout.discount_item, null);
        ImageView img = (ImageView) vi.findViewById(R.id.discountItemImageView);
        img.setImageResource(data.get(position).getImageId());
        TextView text = (TextView) vi.findViewById(R.id.discountItemTextView);
        text.setText(data.get(position).getTitle());
        return vi;
    }
}
