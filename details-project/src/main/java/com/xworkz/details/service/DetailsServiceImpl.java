package com.xworkz.details.service;


import com.xworkz.details.dto.DetailsDTO;
import com.xworkz.details.repo.DetailsRepository;
import com.xworkz.details.repo.DetailsRepositoryImpl;
import com.xworkz.details.validUtil.ValidUtil;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class DetailsServiceImpl implements DetailsService {
	private DetailsRepository repository=new DetailsRepositoryImpl();
	private ValidUtil validate = new ValidUtil();

	
	@Override
	public boolean validateAndSave(DetailsDTO dto) throws ClassNotFoundException{
		System.out.println("Running validate and save method");
		if(dto!=null) {
			System.out.println("DTO is not null");
			
				return this.repository.save(dto);
			
		}
		else {
			System.out.println("DTO is null");
		}
		return false;
	}




}
