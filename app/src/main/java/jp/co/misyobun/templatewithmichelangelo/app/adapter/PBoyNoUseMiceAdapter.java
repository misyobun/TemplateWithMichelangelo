package jp.co.misyobun.templatewithmichelangelo.app.adapter;

import android.content.Context;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.romainpiel.michelangelo.Michelangelo;

import java.util.List;

import jp.co.misyobun.templatewithmichelangelo.app.R;
import jp.co.misyobun.templatewithmichelangelo.app.custom.UseMichelangeloView;
import jp.co.misyobun.templatewithmichelangelo.app.data.PBoy;

/**
 * ViewHolder使う
 */
public class PBoyNoUseMiceAdapter  extends BaseAdapter {

    public static final String TAG = PBoyNoUseMiceAdapter.class.getName();

    private Context mContext;
    private List<PBoy> mList;

    public PBoyNoUseMiceAdapter(final Context context,
                                final List<PBoy> list) {

        this.mContext = context;
        this.mList = list;
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

        View row = convertView;
        RowHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = LayoutInflater.from(mContext);
            row= (LinearLayout)inflater.inflate(R.layout.personal, null);
            holder = new RowHolder(row);
            row.setTag(holder);
        } else {
            holder = (RowHolder)row.getTag();
        }

        PBoy item = getItem(position);

        holder.getImageView().setImageResource(item.drawbleResId);
        holder.getNameView().setText(item.name);
        holder.getAreaView().setText(item.area);
        holder.getSexView().setText(item.sex);
        holder.getAttrView().setText(item.attr);
        holder.getJobView().setText(item.job);

        return row;
    }

    /**
     * Holder
     */
    public class RowHolder {

        private TextView mName;

        private TextView mArea;

        private TextView mSex;

        private TextView mJob;

        private TextView mAttr;

        private ImageView mImage;

        private View mBase;

        public RowHolder(final View base) {
            this.mBase = base;
        }

        public TextView getNameView() {
            if (mName == null) {
                mName = (TextView)mBase.findViewById(R.id.cNameValue);
            }
            return mName;
        }

        public TextView getAreaView() {
            if (mArea == null) {
                mArea = (TextView)mBase.findViewById(R.id.cAreaValue);
            }
            return mArea;
        }

        public TextView getSexView() {
            if (mSex == null) {
                mSex = (TextView)mBase.findViewById(R.id.cSexValue);
            }
            return mSex;
        }

        public TextView getJobView() {
            if (mJob == null) {
                mJob = (TextView)mBase.findViewById(R.id.cJobValue);
            }
            return mJob;
        }

        public TextView getAttrView() {
            if (mAttr == null) {
                mAttr = (TextView)mBase.findViewById(R.id.cAttrValue);
            }
            return mAttr;
        }

        public ImageView getImageView() {
            if (mImage == null) {
                mImage = (ImageView)mBase.findViewById(R.id.thumbnail);
            }
            return mImage;
        }


    }
}

