package sy.qust.three.domain;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/5/25 0025.
 */
@Entity
@Table(name = "administrator", schema = "threeup")
public class Administrator_three {
    private int aid;
    private String aname;
    private String apasswd;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "aid", nullable = false)
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    @Basic
    @Column(name = "aname", nullable = false, length = 6)
    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    @Basic
    @Column(name = "apasswd", nullable = true, length = 6)
    public String getApasswd() {
        return apasswd;
    }

    public void setApasswd(String apasswd) {
        this.apasswd = apasswd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Administrator_three that = (Administrator_three) o;

        if (aid != that.aid) return false;
        if (aname != null ? !aname.equals(that.aname) : that.aname != null) return false;
        if (apasswd != null ? !apasswd.equals(that.apasswd) : that.apasswd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aid;
        result = 31 * result + (aname != null ? aname.hashCode() : 0);
        result = 31 * result + (apasswd != null ? apasswd.hashCode() : 0);
        return result;
    }
}
