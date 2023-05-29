package com.xworkz.details.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DetailsDTO {
	@NotEmpty
	@NotNull
	@Size(min = 3, max = 50, message = "Size should be >30 And lass than 50")
	private String name;
	@NotEmpty
	@NotNull
	@Size(min = 3, max = 50, message = "Size should be >30 And lass than 50")
	private String qualification;
	@NotEmpty
	@NotNull
	@Size(min = 3, max = 50, message = "Size should be >30 And lass than 50")
	private String Stream;
	@NotEmpty
	@NotNull
	@Size(min = 3, max = 50, message = "Size should be >30 And lass than 50")
	private String course;
	@NotEmpty
	@NotNull
	@Size(min = 3, max = 50, message = "Size should be >30 And lass than 50")
	private String college;
	@NotEmpty
	@NotNull
	@Size(min = 3, max = 50, message = "Size should be >30 And lass than 50")
	private String city;
	@NotEmpty
	@NotNull
	@Size(min = 3, max = 50, message = "Size should be >30 And lass than 50")
	private String state;
	@NotEmpty
	@NotNull
	@Size(min = 3, max = 50, message = "Size should be >30 And lass than 50")
	private String country;
}
