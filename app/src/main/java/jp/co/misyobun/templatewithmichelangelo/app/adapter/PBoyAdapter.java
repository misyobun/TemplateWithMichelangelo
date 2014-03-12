package jp.co.misyobun.templatewithmichelangelo.app.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.romainpiel.michelangelo.Michelangelo;

import java.util.List;

import jp.co.misyobun.templatewithmichelangelo.app.custom.UseMichelangeloView;
import jp.co.misyobun.templatewithmichelangelo.app.custom.UseMichelangeloWithBKView;
import jp.co.misyobun.templatewithmichelangelo.app.data.PBoy;

/**
 * Michelangelo使う
 */
public class PBoyAdapter extends BaseAdapter {

    public static final String TAG = PBoyAdapter.class.getName();

    private Context mContext;
    private List<PBoy> mList;

    public PBoyAdapter(final Context context,
                       final List<PBoy> list) {

        this.mContext = context;
        this.mList    = list;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public PBoy getItem(int position) {
        if (mList != null && mList.size() > 0) {
            return mList.get(position);
        }
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //UseMichelangeloView row;
        UseMichelangeloWithBKView row;

        if (convertView == null) {

            //row = Michelangelo.build(mContext, UseMichelangeloView.class);
            row = Michelangelo.build(mContext,UseMichelangeloWithBKView.class);

        } else {

            row = (UseMichelangeloWithBKView)convertView;
        }

        PBoy item = getItem(position);

        row.bind(item);

        return row;
    }




}
