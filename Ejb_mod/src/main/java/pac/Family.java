package pac;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.persistence.*;

import static javax.persistence.CascadeType.PERSIST;

/**
 *
 * @author eyvind
 */
@Entity
@Table(name = "FAMILY")
public class Family implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional=false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @OneToMany(cascade=PERSIST, mappedBy="family")
    private List<PersonReal> persons=new ArrayList();

    public Family() {
    }

    public List<PersonReal> getPersons() {
        return persons;
    }

    public void setPersons(List<PersonReal> persons) {
        this.persons = persons;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public void setPersons(ArrayList<PersonReal> persons) {
        this.persons = persons;
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
        if (!(object instanceof Family)) {
            return false;
        }
        Family other = (Family) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "manytoonetest.Family[ id=" + id + " ]";
    }

}