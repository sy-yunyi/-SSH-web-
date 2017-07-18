package sy.qust.three.domain;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2017/5/28 0028.
 */
@Entity
@Table(name = "follow", schema = "threeup", catalog = "")
public class Follow_three {
    private String followId;
    private int fid;
    private String followedId;
    private Timestamp ftime;
    private String ftype;

    @Basic
    @Column(name = "followID", nullable = true, length = 11)
    public String getFollowId() {
        return followId;
    }

    public void setFollowId(String followId) {
        this.followId = followId;
    }

    @Id
    @Column(name = "fid", nullable = false)
    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "followedID", nullable = true, length = 11)
    public String getFollowedId() {
        return followedId;
    }

    public void setFollowedId(String followedId) {
        this.followedId = followedId;
    }

    @Basic
    @Column(name = "ftime", nullable = true)
    public Timestamp getFtime() {
        return ftime;
    }

    public void setFtime(Timestamp ftime) {
        this.ftime = ftime;
    }

    @Basic
    @Column(name = "ftype", nullable = true, length = 2)
    public String getFtype() {
        return ftype;
    }

    public void setFtype(String ftype) {
        this.ftype = ftype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Follow_three that = (Follow_three) o;

        if (fid != that.fid) return false;
        if (followId != null ? !followId.equals(that.followId) : that.followId != null) return false;
        if (followedId != null ? !followedId.equals(that.followedId) : that.followedId != null) return false;
        if (ftime != null ? !ftime.equals(that.ftime) : that.ftime != null) return false;
        if (ftype != null ? !ftype.equals(that.ftype) : that.ftype != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = followId != null ? followId.hashCode() : 0;
        result = 31 * result + fid;
        result = 31 * result + (followedId != null ? followedId.hashCode() : 0);
        result = 31 * result + (ftime != null ? ftime.hashCode() : 0);
        result = 31 * result + (ftype != null ? ftype.hashCode() : 0);
        return result;
    }
}
