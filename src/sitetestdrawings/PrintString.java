package sitetestdrawings;
import java.awt.*;

public class PrintString
        extends java.applet.Applet
{
    public void init() {}
    public void paint(Graphics graph)
    {
        graph.drawString("Hello, World!",10,20);
    }
}