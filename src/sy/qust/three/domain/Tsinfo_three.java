package sy.qust.three.domain;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/5/28 0028.
 */
@Entity
@Table(name = "tsinfo", schema = "threeup", catalog = "")
public class Tsinfo_three {
    private int tsid;
    private Integer sid;
    private String tphone;
    private String sname;
    private Double tprice;

    @Id
    @Column(name = "tsid", nullable = false)
    public int getTsid() {
        return tsid;
    }

    public void setTsid(int tsid) {
        this.tsid = tsid;
    }

    @Basic
    @Column(name = "sid", nullable = true)
    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "tphone", nullable = true, length = 11)
    public String getTphone() {
        return tphone;
    }

    public void setTphone(String tphone) {
        this.tphone = tphone;
    }

    @Basic
    @Column(name = "sname", nullable = true, length = 8)
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Basic
    @Column(name = "tprice", nullable = true, precision = 0)
    public Double getTprice() {
        return tprice;
    }

    public void setTprice(Double tprice) {
        this.tprice = tprice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tsinfo_three that = (Tsinfo_three) o;

        if (tsid != that.tsid) return false;
        if (sid != null ? !sid.equals(that.sid) : that.sid != null) return false;
        if (tphone != null ? !tphone.equals(that.tphone) : that.tphone != null) return false;
        if (sname != null ? !sname.equals(that.sname) : that.sname != null) return false;
        if (tprice != null ? !tprice.equals(that.tprice) : that.tprice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tsid;
        result = 31 * result + (sid != null ? sid.hashCode() : 0);
        result = 31 * result + (tphone != null ? tphone.hashCode() : 0);
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        result = 31 * result + (tprice != null ? tprice.hashCode() : 0);
        return result;
    }
}
