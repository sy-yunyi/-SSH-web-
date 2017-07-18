package sy.qust.three.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/5/31 0031.
 */
@Entity
@Table(name = "tporders", schema = "threeup", catalog = "")
public class Tporders_three {
    private Integer studyTime;
    private String startTime;
    private String endTime;
    private Integer isValid;
    private String oid;
    private Timestamp otime;
    private Double oprice;
    private String osubject;
    private Timestamp canceltime;
    private String tphone;
    private String pphone;
    private String ocname;
    private Integer ocage;
    private String ocsex;
    private String ocgrade;

    @Basic
    @Column(name = "studyTime", nullable = true)
    public Integer getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(Integer studyTime) {
        this.studyTime = studyTime;
    }

    @Basic
    @Column(name = "startTime", nullable = true, length = 30)
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "endTime", nullable = true, length = 30)
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "isValid", nullable = true)
    public Integer getIsValid() {
        return isValid;
    }

    public void setIsValid(Integer isValid) {
        this.isValid = isValid;
    }

    @Id
    @Column(name = "oid", nullable = false, length = 15)
    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    @Basic
    @Column(name = "otime", nullable = true)
    public Timestamp getOtime() {
        return otime;
    }

    public void setOtime(Timestamp otime) {
        this.otime = otime;
    }

    @Basic
    @Column(name = "oprice", nullable = true, precision = 0)
    public Double getOprice() {
        return oprice;
    }

    public void setOprice(Double oprice) {
        this.oprice = oprice;
    }

    @Basic
    @Column(name = "osubject", nullable = true, length = 8)
    public String getOsubject() {
        return osubject;
    }

    public void setOsubject(String osubject) {
        this.osubject = osubject;
    }

    @Basic
    @Column(name = "canceltime", nullable = true)
    public Timestamp getCanceltime() {
        return canceltime;
    }

    public void setCanceltime(Timestamp canceltime) {
        this.canceltime = canceltime;
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
    @Column(name = "pphone", nullable = true, length = 11)
    public String getPphone() {
        return pphone;
    }

    public void setPphone(String pphone) {
        this.pphone = pphone;
    }

    @Basic
    @Column(name = "ocname", nullable = true, length = 10)
    public String getOcname() {
        return ocname;
    }

    public void setOcname(String ocname) {
        this.ocname = ocname;
    }

    @Basic
    @Column(name = "ocage", nullable = true)
    public Integer getOcage() {
        return ocage;
    }

    public void setOcage(Integer ocage) {
        this.ocage = ocage;
    }

    @Basic
    @Column(name = "ocsex", nullable = true, length = 4)
    public String getOcsex() {
        return ocsex;
    }

    public void setOcsex(String ocsex) {
        this.ocsex = ocsex;
    }

    @Basic
    @Column(name = "ocgrade", nullable = true, length = 8)
    public String getOcgrade() {
        return ocgrade;
    }

    public void setOcgrade(String ocgrade) {
        this.ocgrade = ocgrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tporders_three that = (Tporders_three) o;

        if (studyTime != null ? !studyTime.equals(that.studyTime) : that.studyTime != null) return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        if (endTime != null ? !endTime.equals(that.endTime) : that.endTime != null) return false;
        if (isValid != null ? !isValid.equals(that.isValid) : that.isValid != null) return false;
        if (oid != null ? !oid.equals(that.oid) : that.oid != null) return false;
        if (otime != null ? !otime.equals(that.otime) : that.otime != null) return false;
        if (oprice != null ? !oprice.equals(that.oprice) : that.oprice != null) return false;
        if (osubject != null ? !osubject.equals(that.osubject) : that.osubject != null) return false;
        if (canceltime != null ? !canceltime.equals(that.canceltime) : that.canceltime != null) return false;
        if (tphone != null ? !tphone.equals(that.tphone) : that.tphone != null) return false;
        if (pphone != null ? !pphone.equals(that.pphone) : that.pphone != null) return false;
        if (ocname != null ? !ocname.equals(that.ocname) : that.ocname != null) return false;
        if (ocage != null ? !ocage.equals(that.ocage) : that.ocage != null) return false;
        if (ocsex != null ? !ocsex.equals(that.ocsex) : that.ocsex != null) return false;
        if (ocgrade != null ? !ocgrade.equals(that.ocgrade) : that.ocgrade != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = studyTime != null ? studyTime.hashCode() : 0;
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (isValid != null ? isValid.hashCode() : 0);
        result = 31 * result + (oid != null ? oid.hashCode() : 0);
        result = 31 * result + (otime != null ? otime.hashCode() : 0);
        result = 31 * result + (oprice != null ? oprice.hashCode() : 0);
        result = 31 * result + (osubject != null ? osubject.hashCode() : 0);
        result = 31 * result + (canceltime != null ? canceltime.hashCode() : 0);
        result = 31 * result + (tphone != null ? tphone.hashCode() : 0);
        result = 31 * result + (pphone != null ? pphone.hashCode() : 0);
        result = 31 * result + (ocname != null ? ocname.hashCode() : 0);
        result = 31 * result + (ocage != null ? ocage.hashCode() : 0);
        result = 31 * result + (ocsex != null ? ocsex.hashCode() : 0);
        result = 31 * result + (ocgrade != null ? ocgrade.hashCode() : 0);
        return result;
    }
}
