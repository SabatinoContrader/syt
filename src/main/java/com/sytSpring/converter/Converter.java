package com.sytSpring.converter;


public interface Converter <Entity, DTO> {
	//converte un dto nella entity corrispondente;
	
		public Entity convertToEntity(DTO dto);
		
	 //converte una entity nel dto desiderato;
		
		public DTO convertToDTO(Entity entity);
}

