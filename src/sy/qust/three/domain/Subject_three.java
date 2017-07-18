package sy.qust.three.domain;

import javax.persistence.*;

/**
 * Created by sy on 2017/5/28 0028.
 */
@Entity
@Table(name = "subject", schema = "threeup", catalog = "")
public class Subject_three {
    private int sid;
    private String sname;
    private Double sprice;

    @Id
    @Column(name = "sid", nullable = false)
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
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
    @Column(name = "sprice", nullable = true, precision = 0)
    public Double getSprice() {
        return sprice;
    }

    public void setSprice(Double sprice) {
        this.sprice = sprice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subject_three that = (Subject_three) o;

        if (sid != that.sid) return false;
        if (sname != null ? !sname.equals(that.sname) : that.sname != null) return false;
        if (sprice != null ? !sprice.equals(that.sprice) : that.sprice != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sid;
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        result = 31 * result + (sprice != null ? sprice.hashCode() : 0);
        return result;
    }
}
