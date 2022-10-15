package com.company.movements;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove
{
	public Swagger()
	{
		super(Type.NORMAL,0,85);
	}
	
	@Override
	protected String describe()
	{
		return "использует Swagger";
	}

	@Override
	protected void applyOppEffects(Pokemon p)
	{
		Effect.confuse(p);
	}

	@Override
	protected void applySelfEffects(Pokemon p)
	{
		p.setMod(Stat.ATTACK,2);
	}
	
	
}