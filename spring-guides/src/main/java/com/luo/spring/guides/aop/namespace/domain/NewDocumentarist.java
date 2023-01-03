package com.luo.spring.guides.aop.namespace.domain;


/**
 * Created by iuliana.cosmina on 4/9/17.
 */
public class NewDocumentarist extends Documentarist {

	@Override
	public void execute() {
		guitarist.sing();
		Guitar guitar = new Guitar();
		guitar.setBrand("Gibson");
		guitarist.sing(guitar);
		//guitarist.sing(new Guitar());
		guitarist.talk();
	}

}
