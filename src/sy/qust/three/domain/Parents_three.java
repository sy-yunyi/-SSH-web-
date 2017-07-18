package sy.qust.three.domain;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/5/28 0028.
 */
@Entity
@Table(name = "parents", schema = "threeup", catalog = "")
public class Parents_three {
    private String address;
    private int pid;
    private String pphone;
    private String ppasswd;
    private String pimage;
    private String pname;
    private String cname;
    private String csex;
    private Integer cage;
    private String cgrade;
    private String pclaim;

    @Basic
    @Column(name = "address", nullable = true, length = 50)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Id
    @Column(name = "pid", nullable = false)
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "pphone", nullable = false, length = 11)
    public String getPphone() {
        return pphone;
    }

    public void setPphone(String pphone) {
        this.pphone = pphone;
    }

    @Basic
    @Column(name = "ppasswd", nullable = true, length = 8)
    public String getPpasswd() {
        return ppasswd;
    }

    public void setPpasswd(String ppasswd) {
        this.ppasswd = ppasswd;
    }

    @Basic
    @Column(name = "pimage", nullable = true, length = 50)
    public String getPimage() {
        return pimage;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage;
    }

    @Basic
    @Column(name = "pname", nullable = true, length = 10)
    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Basic
    @Column(name = "cname", nullable = true, length = 10)
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Basic
    @Column(name = "csex", nullable = true, length = 1)
    public String getCsex() {
        return csex;
    }

    public void setCsex(String csex) {
        this.csex = csex;
    }

    @Basic
    @Column(name = "cage", nullable = true)
    public Integer getCage() {
        return cage;
    }

    public void setCage(Integer cage) {
        this.cage = cage;
    }

    @Basic
    @Column(name = "cgrade", nullable = true, length = 8)
    public String getCgrade() {
        return cgrade;
    }

    public void setCgrade(String cgrade) {
        this.cgrade = cgrade;
    }

    @Basic
    @Column(name = "pclaim", nullable = true, length = 300)
    public String getPclaim() {
        return pclaim;
    }

    public void setPclaim(String pclaim) {
        this.pclaim = pclaim;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Parents_three that = (Parents_three) o;

        if (pid != that.pid) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (pphone != null ? !pphone.equals(that.pphone) : that.pphone != null) return false;
        if (ppasswd != null ? !ppasswd.equals(that.ppasswd) : that.ppasswd != null) return false;
        if (pimage != null ? !pimage.equals(that.pimage) : that.pimage != null) return false;
        if (pname != null ? !pname.equals(that.pname) : that.pname != null) return false;
        if (cname != null ? !cname.equals(that.cname) : that.cname != null) return false;
        if (csex != null ? !csex.equals(that.csex) : that.csex != null) return false;
        if (cage != null ? !cage.equals(that.cage) : that.cage != null) return false;
        if (cgrade != null ? !cgrade.equals(that.cgrade) : that.cgrade != null) return false;
        if (pclaim != null ? !pclaim.equals(that.pclaim) : that.pclaim != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = address != null ? address.hashCode() : 0;
        result = 31 * result + pid;
        result = 31 * result + (pphone != null ? pphone.hashCode() : 0);
        result = 31 * result + (ppasswd != null ? ppasswd.hashCode() : 0);
        result = 31 * result + (pimage != null ? pimage.hashCode() : 0);
        result = 31 * result + (pname != null ? pname.hashCode() : 0);
        result = 31 * result + (cname != null ? cname.hashCode() : 0);
        result = 31 * result + (csex != null ? csex.hashCode() : 0);
        result = 31 * result + (cage != null ? cage.hashCode() : 0);
        result = 31 * result + (cgrade != null ? cgrade.hashCode() : 0);
        result = 31 * result + (pclaim != null ? pclaim.hashCode() : 0);
        return result;
    }
}
