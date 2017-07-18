package sy.qust.three.domain;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/5/31 0031.
 */
@Entity
@Table(name = "appointment", schema = "threeup", catalog = "")
public class Appointment_three {
    private String apid;
    private String apphone;
    private String atphone;
    private String acname;
    private Integer acage;
    private String asubject;
    private String acgrade;
    private String address;
    private String astarttime;
    private String astoptime;
    private Integer aday;
    private Integer aflag;
    private String acsex;

    @Id
    @Column(name = "apid", nullable = false, length = 15)
    public String getApid() {
        return apid;
    }

    public void setApid(String apid) {
        this.apid = apid;
    }

    @Basic
    @Column(name = "apphone", nullable = true, length = 11)
    public String getApphone() {
        return apphone;
    }

    public void setApphone(String apphone) {
        this.apphone = apphone;
    }

    @Basic
    @Column(name = "atphone", nullable = true, length = 11)
    public String getAtphone() {
        return atphone;
    }

    public void setAtphone(String atphone) {
        this.atphone = atphone;
    }

    @Basic
    @Column(name = "acname", nullable = true, length = 8)
    public String getAcname() {
        return acname;
    }

    public void setAcname(String acname) {
        this.acname = acname;
    }

    @Basic
    @Column(name = "acage", nullable = true)
    public Integer getAcage() {
        return acage;
    }

    public void setAcage(Integer acage) {
        this.acage = acage;
    }

    @Basic
    @Column(name = "asubject", nullable = true, length = 6)
    public String getAsubject() {
        return asubject;
    }

    public void setAsubject(String asubject) {
        this.asubject = asubject;
    }

    @Basic
    @Column(name = "acgrade", nullable = true, length = 8)
    public String getAcgrade() {
        return acgrade;
    }

    public void setAcgrade(String acgrade) {
        this.acgrade = acgrade;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 150)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "astarttime", nullable = true, length = 30)
    public String getAstarttime() {
        return astarttime;
    }

    public void setAstarttime(String astarttime) {
        this.astarttime = astarttime;
    }

    @Basic
    @Column(name = "astoptime", nullable = true, length = 30)
    public String getAstoptime() {
        return astoptime;
    }

    public void setAstoptime(String astoptime) {
        this.astoptime = astoptime;
    }

    @Basic
    @Column(name = "aday", nullable = true)
    public Integer getAday() {
        return aday;
    }

    public void setAday(Integer aday) {
        this.aday = aday;
    }

    @Basic
    @Column(name = "aflag", nullable = true)
    public Integer getAflag() {
        return aflag;
    }

    public void setAflag(Integer aflag) {
        this.aflag = aflag;
    }

    @Basic
    @Column(name = "acsex", nullable = true, length = 4)
    public String getAcsex() {
        return acsex;
    }

    public void setAcsex(String acsex) {
        this.acsex = acsex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Appointment_three that = (Appointment_three) o;

        if (apid != null ? !apid.equals(that.apid) : that.apid != null) return false;
        if (apphone != null ? !apphone.equals(that.apphone) : that.apphone != null) return false;
        if (atphone != null ? !atphone.equals(that.atphone) : that.atphone != null) return false;
        if (acname != null ? !acname.equals(that.acname) : that.acname != null) return false;
        if (acage != null ? !acage.equals(that.acage) : that.acage != null) return false;
        if (asubject != null ? !asubject.equals(that.asubject) : that.asubject != null) return false;
        if (acgrade != null ? !acgrade.equals(that.acgrade) : that.acgrade != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (astarttime != null ? !astarttime.equals(that.astarttime) : that.astarttime != null) return false;
        if (astoptime != null ? !astoptime.equals(that.astoptime) : that.astoptime != null) return false;
        if (aday != null ? !aday.equals(that.aday) : that.aday != null) return false;
        if (aflag != null ? !aflag.equals(that.aflag) : that.aflag != null) return false;
        if (acsex != null ? !acsex.equals(that.acsex) : that.acsex != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = apid != null ? apid.hashCode() : 0;
        result = 31 * result + (apphone != null ? apphone.hashCode() : 0);
        result = 31 * result + (atphone != null ? atphone.hashCode() : 0);
        result = 31 * result + (acname != null ? acname.hashCode() : 0);
        result = 31 * result + (acage != null ? acage.hashCode() : 0);
        result = 31 * result + (asubject != null ? asubject.hashCode() : 0);
        result = 31 * result + (acgrade != null ? acgrade.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (astarttime != null ? astarttime.hashCode() : 0);
        result = 31 * result + (astoptime != null ? astoptime.hashCode() : 0);
        result = 31 * result + (aday != null ? aday.hashCode() : 0);
        result = 31 * result + (aflag != null ? aflag.hashCode() : 0);
        result = 31 * result + (acsex != null ? acsex.hashCode() : 0);
        return result;
    }
}
