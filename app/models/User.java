package models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import play.db.ebean.Model;

import com.avaje.ebean.annotation.CreatedTimestamp;

@Entity
public class User extends Model {

    /**
     * 
     */
    private static final long serialVersionUID = -2699878042692102776L;

    @Id
    public Long id;

    @Column(nullable = false)
    public String name;

    @CreatedTimestamp
    public Date createDate;

    @Version
    public Date updateDate;

    public String toString() {
        return "Parent [id=" + id + ", name=" + name + ", createDate="
                + createDate + ", updateDate=" + updateDate + "]";
    }
}