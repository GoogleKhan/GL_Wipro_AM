package com.wipro.SpringBootLibraryDesign.model;

import lombok.AllArgsConstructor;
import lombok.Data;

//Equivalent to {@code @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode}.
@Data

@AllArgsConstructor
public class GreatLearning {

	private String courseName;
	private String courseType;
	private String instructorName;

}
