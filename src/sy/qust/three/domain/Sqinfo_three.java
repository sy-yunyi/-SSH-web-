package sy.qust.three.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/6/16 0016.
 */
@Entity
@Table(name = "sqinfo", schema = "threeup", catalog = "")
public class Sqinfo_three {
    private int sqid;
    private String spphone;
    private String sname;
    private String sanswer;
    private String qanswer;
    private String sisright;
    private Timestamp sqtime;
    private String qsubject;
    private Integer qid;

    @Id
    @Column(name = "sqid", nullable = false)
    public int getSqid() {
        return sqid;
    }

    public void setSqid(int sqid) {
        this.sqid = sqid;
    }

    @Basic
    @Column(name = "spphone", nullable = true, length = 11)
    public String getSpphone() {
        return spphone;
    }

    public void setSpphone(String spphone) {
        this.spphone = spphone;
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
    @Column(name = "sanswer", nullable = true, length = 50)
    public String getSanswer() {
        return sanswer;
    }

    public void setSanswer(String sanswer) {
        this.sanswer = sanswer;
    }

    @Basic
    @Column(name = "qanswer", nullable = true, length = 50)
    public String getQanswer() {
        return qanswer;
    }

    public void setQanswer(String qanswer) {
        this.qanswer = qanswer;
    }

    @Basic
    @Column(name = "sisright", nullable = true, length = 5)
    public String getSisright() {
        return sisright;
    }

    public void setSisright(String sisright) {
        this.sisright = sisright;
    }

    @Basic
    @Column(name = "sqtime", nullable = true)
    public Timestamp getSqtime() {
        return sqtime;
    }

    public void setSqtime(Timestamp sqtime) {
        this.sqtime = sqtime;
    }

    @Basic
    @Column(name = "qsubject", nullable = true, length = 8)
    public String getQsubject() {
        return qsubject;
    }

    public void setQsubject(String qsubject) {
        this.qsubject = qsubject;
    }

    @Basic
    @Column(name = "qid", nullable = true)
    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sqinfo_three that = (Sqinfo_three) o;

        if (sqid != that.sqid) return false;
        if (spphone != null ? !spphone.equals(that.spphone) : that.spphone != null) return false;
        if (sname != null ? !sname.equals(that.sname) : that.sname != null) return false;
        if (sanswer != null ? !sanswer.equals(that.sanswer) : that.sanswer != null) return false;
        if (qanswer != null ? !qanswer.equals(that.qanswer) : that.qanswer != null) return false;
        if (sisright != null ? !sisright.equals(that.sisright) : that.sisright != null) return false;
        if (sqtime != null ? !sqtime.equals(that.sqtime) : that.sqtime != null) return false;
        if (qsubject != null ? !qsubject.equals(that.qsubject) : that.qsubject != null) return false;
        if (qid != null ? !qid.equals(that.qid) : that.qid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sqid;
        result = 31 * result + (spphone != null ? spphone.hashCode() : 0);
        result = 31 * result + (sname != null ? sname.hashCode() : 0);
        result = 31 * result + (sanswer != null ? sanswer.hashCode() : 0);
        result = 31 * result + (qanswer != null ? qanswer.hashCode() : 0);
        result = 31 * result + (sisright != null ? sisright.hashCode() : 0);
        result = 31 * result + (sqtime != null ? sqtime.hashCode() : 0);
        result = 31 * result + (qsubject != null ? qsubject.hashCode() : 0);
        result = 31 * result + (qid != null ? qid.hashCode() : 0);
        return result;
    }
}
