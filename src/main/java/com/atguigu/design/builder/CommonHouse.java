package com.atguigu.design.builder;

/**
 * @author mcRae.su start
 */
public class CommonHouse extends AbstractHouse{
	
	@Override
	public void buildBasic(){
		System.out.println("普通房子打基地");
	}


	@Override
	public void buildWalls(){
		System.out.println("普通方法砌墙");
	}

	@Override
	public void roofed(){
		System.out.println("普通房子封顶");
	}
}