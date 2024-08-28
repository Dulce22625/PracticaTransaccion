package com.bbva.mzic.lib.r001.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The MZICR001Impl class...
 */
public class MZICR001Impl extends MZICR001Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(MZICR001Impl.class);

	
//metodo

	@Override
	public void execute(String nombre) {

//sustituye system 
		LOGGER.info("Se ejecutará: " + nombre);
    }	
}
