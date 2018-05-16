package com.capgemini.pe1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DidierApp {
	
	private static Logger logger = LoggerFactory.getLogger(DidierApp.class);

	public static void main(String[] args) {
		/*
		System.out.println("didier app v1 *** ### ***");
        System.out.println("6 aout");
        System.out.println("***");*/
		logger.info("didier app v1 *** ### ***");
		logger.debug("sysout le 6 aout seulement");
		logger.debug("***");
		//logger.error() dans try/catch
        int a=3;
        //System.out.println("a="+a);
	}

}
