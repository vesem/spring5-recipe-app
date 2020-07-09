package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Data
@EqualsAndHashCode(exclude = {"recipes"})
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Recipe> recipes;

    public Set<Recipe> getRecipies() {
        return recipes;
    }

    public void setRecipies(Set<Recipe> recipies) {
        this.recipes = recipes;
    }
}
