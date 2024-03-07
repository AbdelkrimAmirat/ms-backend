package fr.atapi.abdelkrim.msbackend.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column
    private String title;

    @Column
    private String content;

    @ManyToOne(fetch= FetchType.LAZY)  // TODO: KAM
    @JoinColumn(name="userId")
    @JsonBackReference

    private User user;

    @Override
    public String toString() {
        return "Post{" +
                "Id=" + Id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", user=" + user +
                '}';
    }
}
