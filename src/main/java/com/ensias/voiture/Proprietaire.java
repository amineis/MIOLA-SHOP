package io.spring.voiture;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Proprietaire {
	@OneToMany(cascade = CascadeType.ALL, mappedBy="proprietaire")
	@JsonIgnore
	private List<Voiture> voitures;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@NonNull
	private String nom;
	@NonNull
	private String prenom;
	
	
	
	
	
	
}

