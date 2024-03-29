package pac;

import java.io.Serializable;
import javax.persistence.Basic;
import static javax.persistence.CascadeType.PERSIST;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author eyvind
 */
@Entity
public class PersonReal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fname;
    private String lname;

    @ManyToOne(cascade=PERSIST)
    private Family family;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonReal)) {
            return false;
        }
        PersonReal other = (PersonReal) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PersonReal{" + "fname=" + fname + ", lname=" + lname + ", family=" + family + '}';
    }



}