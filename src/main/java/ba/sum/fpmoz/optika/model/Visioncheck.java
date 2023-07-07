package ba.sum.fpmoz.optika.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="visionchecks")
public class Visioncheck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false)
    Date date;


    @ManyToOne
    @JoinColumn(name="user_id", nullable = false)
    User user;


    public Visioncheck() {

    }

    public Visioncheck(Long id, Date date, User user) {
        this.id = id;
        this.date = date;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}


