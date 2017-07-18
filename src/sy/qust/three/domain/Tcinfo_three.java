package sy.qust.three.domain;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/5/28 0028.
 */
@Entity
@Table(name = "tcinfo", schema = "threeup", catalog = "")
public class Tcinfo_three {
    private int tcid;
    private String grade;
    private String tphone;

    @Id
    @Column(name = "tcid", nullable = false)
    public int getTcid() {
        return tcid;
    }

    public void setTcid(int tcid) {
        this.tcid = tcid;
    }

    @Basic
    @Column(name = "grade", nullable = true, length = 8)
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Basic
    @Column(name = "tphone", nullable = true, length = 11)
    public String getTphone() {
        return tphone;
    }

    public void setTphone(String tphone) {
        this.tphone = tphone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tcinfo_three that = (Tcinfo_three) o;

        if (tcid != that.tcid) return false;
        if (grade != null ? !grade.equals(that.grade) : that.grade != null) return false;
        if (tphone != null ? !tphone.equals(that.tphone) : that.tphone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tcid;
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        result = 31 * result + (tphone != null ? tphone.hashCode() : 0);
        return result;
    }
}
