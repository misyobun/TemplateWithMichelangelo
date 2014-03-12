package jp.co.misyobun.templatewithmichelangelo.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import jp.co.misyobun.templatewithmichelangelo.app.adapter.PBoyAdapter;
import jp.co.misyobun.templatewithmichelangelo.app.data.PBoy;

/**
 * 起動Activity
 */
public class MainActivity extends ActionBarActivity {

    /**
     * デバッグ用
     */
    public static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        setup();
    }


    /**
     * 画面セットアップ
     */
    private void setup() {

        List<PBoy> list = new ArrayList<PBoy>();
        PBoy nakaji = new PBoy(R.drawable.nakaji320, "中島", "恥知らず", "男", "渋谷", "ペパボ");
        PBoy antipop = new PBoy(R.drawable.antipop320, "アンチポさん", "基盤", "男", "渋谷", "ペパボ");
        PBoy wantipop = new PBoy(R.drawable.wantipop320, "白いアンチポ", "基盤", "男", "渋谷", "ペパボ");

        list.add(nakaji);
        list.add(antipop);
        list.add(wantipop);

       // PBoyNoUseMiceAdapter adapter = new PBoyNoUseMiceAdapter(getApplicationContext(),list);
        PBoyAdapter adapter = new PBoyAdapter(getApplicationContext(),list);
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
