package com.kirtar.lab_3;

import com.kirtar.lab_3.someObjects.interfaces.Locationable;
import com.kirtar.lab_3.someObjects.interfaces.Nameable;
import com.kirtar.lab_3.someObjects.interfaces.Stateable;
import com.kirtar.lab_3.someObjects.SomeObject;
import com.kirtar.lab_3.someObjects.characters.Policemen;
import com.kirtar.lab_3.someObjects.characters.Somebody;
import com.kirtar.lab_3.someObjects.enums.Appliance;


public class Main
{
	public static void main(String[] args)
	{
		Policemen p = new Policemen("�����������","�� ���������","");
		System.out.println(p.shoot("�����",""));
		System.out.print(p.run());
		p.setLocation("�����");
		System.out.println(p.getLocation());
		p.setLocation(" � ������");
		System.out.println(p.run()+p.getLocation());
		p.setState(" � ������� ");
		System.out.println(p.getState()+p.pounce(" ������������� ������ �������"));
		System.out.println(p.destroy("��"));
		System.out.println(p.destroy(Appliance.BAROMETER.getDescription()));
		System.out.println(p.destroy(Appliance.SEISMOGRAPH.getDescription()));
		System.out.println(p.shoot("",Appliance.RAINGAUGE.getDescription()));
		p.setLocation("�� �����");
		System.out.println(p.climb()+p.getLocation());
		System.out.println(p.destroy(Appliance.ANEMOMETER.getDescription()));
		
		Somebody he = new Somebody("��","� ����� �������","");
		he.turnOnTheWeightlessnessDevice(p);
		p.setState("���������� ");
		System.out.print(p.getState()+p.tumble());
		p.setLocation("� ������� ");
		System.out.print(p.getLocation());
		p.setState(" �����������");
		System.out.println(p.wavingTheirArms());
		System.out.println(p.getState());
		System.out.println(p.kickYourFeet());
		System.out.println(p.wagTheBody());
		System.out.println(p.collideWithEachOther());
		System.out.println(p.soarUp());
		System.out.println(p.fallDown());
		System.out.println(p.pushOffTheGround());
		p.setLocation("������");
		System.out.println(p.jump()+p.getLocation());
		
	}

}