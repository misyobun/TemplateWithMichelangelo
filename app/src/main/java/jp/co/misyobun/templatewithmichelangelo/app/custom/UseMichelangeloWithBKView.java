package jp.co.misyobun.templatewithmichelangelo.app.custom;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.romainpiel.michelangelo.AfterInflate;
import com.romainpiel.michelangelo.InflateLayout;
import com.romainpiel.michelangelo.InjectViews;

import butterknife.InjectView;
import jp.co.misyobun.templatewithmichelangelo.app.R;
import jp.co.misyobun.templatewithmichelangelo.app.data.PBoy;

/**
 * MichelangeloでインフレートするHolder
 * ButterKnife使う
 */

@InflateLayout(R.layout.personal)
@InjectViews
public class UseMichelangeloWithBKView extends LinearLayout {

    /**
     * サムネイル画像
     */
    @InjectView(R.id.thumbnail)
    public ImageView mImage;

    /**
     * 名前
     */
    @InjectView(R.id.cNameValue)
    public TextView  mName;

    /**
     * 出現エリア
     */
    @InjectView(R.id.cAreaValue)
    public TextView  mArea;

    /**
     * 性別
     */
    @InjectView(R.id.cSexValue)
    public TextView  mSex;

    /**
     * 職業
     */
    @InjectView(R.id.cJobValue)
    public TextView  mJob;

    /**
     * 所属
     */
    @InjectView(R.id.cAttrValue)
    public TextView  mAttr;

    /**
     * コンストラクタ
     * @param context アプリケーションコンテキスト
     */
    public UseMichelangeloWithBKView(Context context) {
        super(context);
    }

    /**
     * インフレート処理の実行
     */
    @AfterInflate
    public void updateMemberValue() {

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
