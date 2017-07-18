package sy.qust.three.domain;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/5/30 0030.
 */
@Entity
@Table(name = "qbank", schema = "threeup", catalog = "")
public class Qbank_three {
    private int qid;
    private Integer qnumber;
    private String qsubject;
    private String qconent;
    private String qanswer;
    private String qrank;
    private String qanalysis;

    @Id
    @Column(name = "qid", nullable = false)
    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    @Basic
    @Column(name = "qnumber", nullable = true)
    public Integer getQnumber() {
        return qnumber;
    }

    public void setQnumber(Integer qnumber) {
        this.qnumber = qnumber;
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
    @Column(name = "qconent", nullable = true, length = 500)
    public String getQconent() {
        return qconent;
    }

    public void setQconent(String qconent) {
        this.qconent = qconent;
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
    @Column(name = "qrank", nullable = true, length = 2)
    public String getQrank() {
        return qrank;
    }

    public void setQrank(String qrank) {
        this.qrank = qrank;
    }

    @Basic
    @Column(name = "qanalysis", nullable = true, length = 300)
    public String getQanalysis() {
        return qanalysis;
    }

    public void setQanalysis(String qanalysis) {
        this.qanalysis = qanalysis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Qbank_three that = (Qbank_three) o;

        if (qid != that.qid) return false;
        if (qnumber != null ? !qnumber.equals(that.qnumber) : that.qnumber != null) return false;
        if (qsubject != null ? !qsubject.equals(that.qsubject) : that.qsubject != null) return false;
        if (qconent != null ? !qconent.equals(that.qconent) : that.qconent != null) return false;
        if (qanswer != null ? !qanswer.equals(that.qanswer) : that.qanswer != null) return false;
        if (qrank != null ? !qrank.equals(that.qrank) : that.qrank != null) return false;
        if (qanalysis != null ? !qanalysis.equals(that.qanalysis) : that.qanalysis != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = qid;
        result = 31 * result + (qnumber != null ? qnumber.hashCode() : 0);
        result = 31 * result + (qsubject != null ? qsubject.hashCode() : 0);
        result = 31 * result + (qconent != null ? qconent.hashCode() : 0);
        result = 31 * result + (qanswer != null ? qanswer.hashCode() : 0);
        result = 31 * result + (qrank != null ? qrank.hashCode() : 0);
        result = 31 * result + (qanalysis != null ? qanalysis.hashCode() : 0);
        return result;
    }
}
