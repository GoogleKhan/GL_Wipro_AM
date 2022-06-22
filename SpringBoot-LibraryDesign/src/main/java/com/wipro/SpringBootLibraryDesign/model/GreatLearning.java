package com.wipro.SpringBootLibraryDesign.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Equivalent to {@code @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode}.
@Data

@AllArgsConstructor
@NoArgsConstructor

@Builder
public class GreatLearning {

	private String courseName;
	private String courseType;
	private String instructorName;
	
	private Address address;

//	public GreatLearning() {
//	}
//
//	public GreatLearning(String courseName) {
//		this.courseName = courseName;
//
//	}
//
//	public GreatLearning(String courseName, String courseType) {
//		this.courseName = courseName;
//		this.courseType = courseType;
//	}
//
//	public GreatLearning(String courseName, String courseType, String instructorName) {
//		this.courseName = courseName;
//		this.courseType = courseType;
//		this.instructorName = instructorName;
//	}

}
