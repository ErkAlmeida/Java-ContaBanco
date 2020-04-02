package model.excecao;

public class ContaExcecao extends Exception 
{
	private static final long serialVersionUID = 1L;

	public ContaExcecao(String msg) 
	{
		super(msg);
	}
}
