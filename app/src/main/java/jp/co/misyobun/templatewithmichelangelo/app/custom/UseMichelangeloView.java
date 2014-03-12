package jp.co.misyobun.templatewithmichelangelo.app.custom;

import android.content.Context;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.romainpiel.michelangelo.AfterInflate;
import com.romainpiel.michelangelo.InflateLayout;

import org.w3c.dom.Text;

import jp.co.misyobun.templatewithmichelangelo.app.R;
import jp.co.misyobun.templatewithmichelangelo.app.data.PBoy;

/**
 * MichelangeloでインフレートするHolder
 */

@InflateLayout(R.layout.personal)
public class UseMichelangeloView extends LinearLayout {

    /**
     * サムネイル画像
     */
    public ImageView mImage;

    /**
     * 名前
     */
    public TextView  mName;

    /**
     * 出現エリア
     */
    public TextView  mArea;

    /**
     * 性別
     */
    public TextView  mSex;

    /**
     * 職業
     */
    public TextView  mJob;

    /**
     * 所属
     */
    public TextView  mAttr;

    /**
     * コンストラクタ
     * @param context アプリケーションコンテキスト
     */
    public UseMichelangeloView(Context context) {
        super(context);
    }

    /**
     * インフレート処理の実行
     */
    @AfterInflate
    public void updateMemberValue() {

        mArea  = (TextView)findViewById(R.id.cAreaValue);
        mSex   = (TextView)findViewById(R.id.cSexValue);
        mName  = (TextView)findViewById(R.id.cNameValue);
        mJob   = (TextView)findViewById(R.id.cJobValue);
        mAttr  = (TextView)findViewById(R.id.cAttrValue);
        mImage = (ImageView)findViewById(R.id.thumbnail);
    }

    /**
     * Viewにデータを割り付ける
     * @param data
     */
    public void bind(final PBoy data) {

        mName.setText(data.name);
        mJob.setText(data.job);
        mSex.setText(data.sex);
        mArea.setText(data.area);
        mAttr.setText(data.attr);
        mImage.setImageResource(data.drawbleResId);

    }

}
