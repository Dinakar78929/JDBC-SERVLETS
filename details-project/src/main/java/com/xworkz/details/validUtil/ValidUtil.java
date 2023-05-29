package com.xworkz.details.validUtil;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator; 
import javax.validation.ValidatorFactory;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ValidUtil {
	public<T> boolean validateDTO(T t) {
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		
		Set<ConstraintViolation<T>> constraintViolations=validator.validate(t);
		System.out.println(constraintViolations.size());
		constraintViolations.forEach(cv->System.err.println(cv.getPropertyPath()+" "+cv.getMessage()));
		
		return constraintViolations.isEmpty();
	}
}
