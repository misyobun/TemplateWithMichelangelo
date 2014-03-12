package jp.co.misyobun.templatewithmichelangelo.app.data;

/**
 * Created by usr0600259 on 2014/03/10.
 */
public class PBoy {
    public int drawbleResId;
    public String name;
    public String job;
    public String sex;
    public String area;
    public String attr;

    /**
     *
     * @param drawbleResId 画像ID
     * @param job          仕事
     * @param sex          性別
     * @param area         出現
     * @param attr         所属
     */
    public PBoy(final int drawbleResId,
                final String name,
                final String job,
                final String sex,
                final String area,
                final String attr) {

        this.drawbleResId = drawbleResId;
        this.name         = name;
        this.job          = job;
        this.sex          = sex;
        this.area         = area;
        this.attr         = attr;
    }
}
