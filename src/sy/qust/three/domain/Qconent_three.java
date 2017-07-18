package sy.qust.three.domain;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/5/30 0030.
 */
@Entity
@Table(name = "qconent", schema = "threeup", catalog = "")
public class Qconent_three {
    private int qcid;
    private Integer qid;
    private String qoption;
    private String qoconent;

    @Id
    @Column(name = "qcid", nullable = false)
    public int getQcid() {
        return qcid;
    }

    public void setQcid(int qcid) {
        this.qcid = qcid;
    }

    @Basic
    @Column(name = "qid", nullable = true)
    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    @Basic
    @Column(name = "qoption", nullable = true, length = 1)
    public String getQoption() {
        return qoption;
    }

    public void setQoption(String qoption) {
        this.qoption = qoption;
    }

    @Basic
    @Column(name = "qoconent", nullable = true, length = 300)
    public String getQoconent() {
        return qoconent;
    }

    public void setQoconent(String qoconent) {
        this.qoconent = qoconent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Qconent_three that = (Qconent_three) o;

        if (qcid != that.qcid) return false;
        if (qid != null ? !qid.equals(that.qid) : that.qid != null) return false;
        if (qoption != null ? !qoption.equals(that.qoption) : that.qoption != null) return false;
        if (qoconent != null ? !qoconent.equals(that.qoconent) : that.qoconent != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = qcid;
        result = 31 * result + (qid != null ? qid.hashCode() : 0);
        result = 31 * result + (qoption != null ? qoption.hashCode() : 0);
        result = 31 * result + (qoconent != null ? qoconent.hashCode() : 0);
        return result;
    }
}
