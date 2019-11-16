package dk.kea.stud.fourplayers.restaurantstore.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Product extends BaseEntity {
  @Column(name = "name")
  private String name;

  @Column(name = "description")
  private String description;

  @OneToMany(targetEntity = dk.kea.stud.fourplayers.restaurantstore.model.Price.class,
      cascade = CascadeType.ALL, mappedBy = "products")
  private List<Price> prices;

  @OneToOne(targetEntity = dk.kea.stud.fourplayers.restaurantstore.model.Category.class)
  @JoinColumn(name = "category_id")
  private Category category;

  @OneToMany(targetEntity = dk.kea.stud.fourplayers.restaurantstore.model.ProductImage.class)
  private List<ProductImage> images;

  public Product() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public List<Price> getPrices() {
    return prices;
  }

  public void setPrices(List<Price> prices) {
    this.prices = prices;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public List<ProductImage> getImages() {
    return images;
  }

  public void setImages(List<ProductImage> images) {
    this.images = images;
  }
}