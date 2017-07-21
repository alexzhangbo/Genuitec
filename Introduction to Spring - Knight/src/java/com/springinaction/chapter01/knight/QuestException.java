package com.springinaction.chapter01.knight;

public class QuestException extends Exception
{
	private static final long serialVersionUID = 1L;

	public QuestException()
	{
		/* no-op impl */
	}

	public QuestException(String message)
	{
		super(message);
	}
}
