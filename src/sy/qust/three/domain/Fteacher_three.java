package sy.qust.three.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/5/27 0027.
 */
@Entity
@Table(name = "fteacher", schema = "threeup", catalog = "")
public class Fteacher_three {
    private Integer isGold;
    private Integer isPass;
    private int tid;
    private String tname;
    private String tphone;
    private String tpasswd;
    private Integer tage;
    private String tsex;
    private String tshool;
    private String teducation;
    private String tgread;
    private String tintroduce;
    private String thabit;
    private String timage;
    private Integer tpoints;
    private Timestamp registerDate;

    @Basic
    @Column(name = "isGold", nullable = true)
    public Integer getIsGold() {
        return isGold;
    }

    public void setIsGold(Integer isGold) {
        this.isGold = isGold;
    }

    @Basic
    @Column(name = "isPass", nullable = true)
    public Integer getIsPass() {
        return isPass;
    }

    public void setIsPass(Integer isPass) {
        this.isPass = isPass;
    }

    @Id
    @Column(name = "tid", nullable = false)
    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "tname", nullable = true, length = 20)
    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Basic
    @Column(name = "tphone", nullable = false, length = 11)
    public String getTphone() {
        return tphone;
    }

    public void setTphone(String tphone) {
        this.tphone = tphone;
    }

    @Basic
    @Column(name = "tpasswd", nullable = true, length = 8)
    public String getTpasswd() {
        return tpasswd;
    }

    public void setTpasswd(String tpasswd) {
        this.tpasswd = tpasswd;
    }

    @Basic
    @Column(name = "tage", nullable = true)
    public Integer getTage() {
        return tage;
    }

    public void setTage(Integer tage) {
        this.tage = tage;
    }

    @Basic
    @Column(name = "tsex", nullable = true, length = 1)
    public String getTsex() {
        return tsex;
    }

    public void setTsex(String tsex) {
        this.tsex = tsex;
    }

    @Basic
    @Column(name = "tshool", nullable = true, length = 30)
    public String getTshool() {
        return tshool;
    }

    public void setTshool(String tshool) {
        this.tshool = tshool;
    }

    @Basic
    @Column(name = "teducation", nullable = true, length = 6)
    public String getTeducation() {
        return teducation;
    }

    public void setTeducation(String teducation) {
        this.teducation = teducation;
    }

    @Basic
    @Column(name = "tgread", nullable = true, length = 8)
    public String getTgread() {
        return tgread;
    }

    public void setTgread(String tgread) {
        this.tgread = tgread;
    }

    @Basic
    @Column(name = "tintroduce", nullable = true, length = 200)
    public String getTintroduce() {
        return tintroduce;
    }

    public void setTintroduce(String tintroduce) {
        this.tintroduce = tintroduce;
    }

    @Basic
    @Column(name = "thabit", nullable = true, length = 100)
    public String getThabit() {
        return thabit;
    }

    public void setThabit(String thabit) {
        this.thabit = thabit;
    }

    @Basic
    @Column(name = "timage", nullable = true, length = 100)
    public String getTimage() {
        return timage;
    }

    public void setTimage(String timage) {
        this.timage = timage;
    }

    @Basic
    @Column(name = "tpoints", nullable = true)
    public Integer getTpoints() {
        return tpoints;
    }

    public void setTpoints(Integer tpoints) {
        this.tpoints = tpoints;
    }

    @Basic
    @Column(name = "registerDate", nullable = true)
    public Timestamp getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Timestamp registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fteacher_three that = (Fteacher_three) o;

        if (tid != that.tid) return false;
        if (isGold != null ? !isGold.equals(that.isGold) : that.isGold != null) return false;
        if (isPass != null ? !isPass.equals(that.isPass) : that.isPass != null) return false;
        if (tname != null ? !tname.equals(that.tname) : that.tname != null) return false;
        if (tphone != null ? !tphone.equals(that.tphone) : that.tphone != null) return false;
        if (tpasswd != null ? !tpasswd.equals(that.tpasswd) : that.tpasswd != null) return false;
        if (tage != null ? !tage.equals(that.tage) : that.tage != null) return false;
        if (tsex != null ? !tsex.equals(that.tsex) : that.tsex != null) return false;
        if (tshool != null ? !tshool.equals(that.tshool) : that.tshool != null) return false;
        if (teducation != null ? !teducation.equals(that.teducation) : that.teducation != null) return false;
        if (tgread != null ? !tgread.equals(that.tgread) : that.tgread != null) return false;
        if (tintroduce != null ? !tintroduce.equals(that.tintroduce) : that.tintroduce != null) return false;
        if (thabit != null ? !thabit.equals(that.thabit) : that.thabit != null) return false;
        if (timage != null ? !timage.equals(that.timage) : that.timage != null) return false;
        if (tpoints != null ? !tpoints.equals(that.tpoints) : that.tpoints != null) return false;
        if (registerDate != null ? !registerDate.equals(that.registerDate) : that.registerDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = isGold != null ? isGold.hashCode() : 0;
        result = 31 * result + (isPass != null ? isPass.hashCode() : 0);
        result = 31 * result + tid;
        result = 31 * result + (tname != null ? tname.hashCode() : 0);
        result = 31 * result + (tphone != null ? tphone.hashCode() : 0);
        result = 31 * result + (tpasswd != null ? tpasswd.hashCode() : 0);
        result = 31 * result + (tage != null ? tage.hashCode() : 0);
        result = 31 * result + (tsex != null ? tsex.hashCode() : 0);
        result = 31 * result + (tshool != null ? tshool.hashCode() : 0);
        result = 31 * result + (teducation != null ? teducation.hashCode() : 0);
        result = 31 * result + (tgread != null ? tgread.hashCode() : 0);
        result = 31 * result + (tintroduce != null ? tintroduce.hashCode() : 0);
        result = 31 * result + (thabit != null ? thabit.hashCode() : 0);
        result = 31 * result + (timage != null ? timage.hashCode() : 0);
        result = 31 * result + (tpoints != null ? tpoints.hashCode() : 0);
        result = 31 * result + (registerDate != null ? registerDate.hashCode() : 0);
        return result;
    }

}
