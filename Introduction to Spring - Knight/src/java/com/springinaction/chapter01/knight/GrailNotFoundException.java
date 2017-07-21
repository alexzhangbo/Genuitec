package com.springinaction.chapter01.knight;

public class GrailNotFoundException extends QuestException
{
	private static final long serialVersionUID = 1L;

	public GrailNotFoundException()
	{
		/* no-op impl */
	}

	public GrailNotFoundException(String message)
	{
		super(message);
	}
}
