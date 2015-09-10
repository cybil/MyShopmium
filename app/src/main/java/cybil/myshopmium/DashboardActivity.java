package cybil.myshopmium;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DashboardActivity extends ActionBarActivity {

    ListView lv;
    public static String [] discountList={"Shop","Mium","Appli","Android"};
    public ArrayList<DiscountItem> discountItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_dashboard);
        Intent intent = getIntent();
        String message = intent.getStringExtra(RegisterActivity.CONNECTION_MESSAGE);

        setDiscountItems(discountList);
        TextView text = (TextView) findViewById(R.id.serverResponseTextView);
        text.setText(message.substring(0, 40) + "...");

        lv = (ListView) findViewById(R.id.listView);
        lv.setAdapter(new DiscountListAdapter(this, discountItems));
    }

    private void setDiscountItems(String[] discountList) {
        for (String title: discountList
             ) {
            DiscountItem newItem = new DiscountItem(R.drawable.logo, title, "discount item");
            discountItems.add(newItem);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_dashboard, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    public void onClickDisconnectButton(View v) {
        finish();
    }
}
