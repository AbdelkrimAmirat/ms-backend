package fr.atapi.abdelkrim.msbackend.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PostDTO {
    private Integer Id;
    private String title;
    private String content;
    private Integer userId;
    @Override
    public String toString() {
        return "PostDTO{" +
                "Id=" + Id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", userId=" + userId +
                '}';
    }
}


