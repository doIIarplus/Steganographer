import java.awt.*;

public class CButton
{
    Image def, over, down;

    public CButton (Image a, Image b, Image c)
    {
	def = a;
	over = b;
	down = c;
    }


    public Image getState (int state)
    {
	if (state == 1)
	{
	    return down;
	}
	
	return over;
    }
}
