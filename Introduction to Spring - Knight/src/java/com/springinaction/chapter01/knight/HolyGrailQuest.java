package com.springinaction.chapter01.knight;

public class HolyGrailQuest implements Quest
{
	public HolyGrailQuest()
	{
		/* no-op impl */
	}

	@SuppressWarnings("unused")
	public Object embark() throws GrailNotFoundException
	{
		// do whatever it means to embark on a quest
		return new HolyGrail();
	}
}
