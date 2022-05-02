package Entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "collaborator")
public class Collaborator extends Operator{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "collaborator")
    List<Order> orders = new ArrayList<Order>();
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
