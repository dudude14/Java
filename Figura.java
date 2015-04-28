import java.awt.*;

public abstract class Figura // implements Cloneable
{
    protected Color cor;
	protected Color cor1;
	  
    protected Figura ()
    {
        this (Color.BLACK,Color.white);
    }
	  
    protected Figura (Color cor,Color cor1)
    {
        this.setCor (cor,cor1);
    }
	  
   

	public void setCor (Color cor,Color cor1)
    {
        this.cor = cor;
        this.cor1 = cor1;
    }
	  
    public Color getCor()
    {
  	return this.cor;
    }

  //public abstract Object  clone          ();
  //public abstract boolean equals         (Object obj);
  //public abstract int     hashCode       ();
    public abstract String  toString       ();
    public abstract void    torneSeVisivel (Graphics g);
}
