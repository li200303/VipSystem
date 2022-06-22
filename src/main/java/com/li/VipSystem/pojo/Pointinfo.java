package com.li.VipSystem.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName PointInfo
 */
@TableName(value ="PointInfo")
@Data
public class Pointinfo implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer pointid;

    /**
     * 
     */
    private Float point;

    /**
     * 
     */
    private Date spendingtime;

    /**
     * 
     */
    private Integer memberid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Pointinfo other = (Pointinfo) that;
        return (this.getPointid() == null ? other.getPointid() == null : this.getPointid().equals(other.getPointid()))
            && (this.getPoint() == null ? other.getPoint() == null : this.getPoint().equals(other.getPoint()))
            && (this.getSpendingtime() == null ? other.getSpendingtime() == null : this.getSpendingtime().equals(other.getSpendingtime()))
            && (this.getMemberid() == null ? other.getMemberid() == null : this.getMemberid().equals(other.getMemberid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPointid() == null) ? 0 : getPointid().hashCode());
        result = prime * result + ((getPoint() == null) ? 0 : getPoint().hashCode());
        result = prime * result + ((getSpendingtime() == null) ? 0 : getSpendingtime().hashCode());
        result = prime * result + ((getMemberid() == null) ? 0 : getMemberid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", pointid=").append(pointid);
        sb.append(", point=").append(point);
        sb.append(", spendingtime=").append(spendingtime);
        sb.append(", memberid=").append(memberid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}