import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class Image2Ascii
{
	BufferedImage bImage = null;
	int imageWidth = 0;
	int imageHeight = 0;
	int[][] greyVals;
	String ramp = "@%#*+=-:. ";
	String rampNegative = " .:-=+*#%@";
	
	/*void print ()
	{
		for (int j = 0; j < imageHeight; j+= 2)
		{
			for (int i = 0; i < imageWidth; i++)
			{
				int rampIndex = 10 * greyVals[j][i] / 256;
				char thisChar = ramp.charAt(rampIndex);
				System.out.print(thisChar);
			}
			System.out.println();
		}
	}*/
	
	void printWarhol()
	{
			for (int j = 0; j < imageHeight; j+= 2)
			{
					for (int i = 0; i < imageWidth; i++)
					{
						int rampIndex = 10 * greyVals[j][i] / 256;
						char thisChar = ramp.charAt(rampIndex);
						System.out.print(thisChar);
						
						
					}
					
					for (int i = 0; i < imageWidth; i++)
					{
						int rampIndex = 10 * greyVals[j][i] / 256;
						char thisChar = rampNegative.charAt(rampIndex);
						System.out.print(thisChar);
					}
					
					System.out.println();
			}
			
			for (int j = 0; j < imageHeight; j+= 2)
			{
					for (int i = 0; i < imageWidth; i++)
					{
						int rampIndex = 10 * greyVals[j][i] / 256;
						char thisChar = rampNegative.charAt(rampIndex);
						System.out.print(thisChar);
						
						
					}
					
					for (int i = 0; i < imageWidth; i++)
					{
						int rampIndex = 10 * greyVals[j][i] / 256;
						char thisChar = ramp.charAt(rampIndex);
						System.out.print(thisChar);
					}
					
					System.out.println();
			}
	}
	

	
	
	void LoadImage( String fileName )
	{
		try
		{
			bImage = ImageIO.read( new File(fileName) );
			imageWidth = bImage.getWidth();
			imageHeight = bImage.getHeight();
			
			greyVals = new int [imageHeight][imageWidth];
			
			for (int j = 0; j < imageHeight; j++)
			{
				for (int i = 0; i < imageWidth; i++)
				{
					Color pixel = new Color( bImage.getRGB( i, j ) );
					int red = pixel.getRed();
					int green = pixel.getGreen();
					int blue = pixel.getBlue();
					int grey = ( red + 2*green + blue ) / 4;
					greyVals[j][i] = grey;
				}
			}
		}
		
		catch (IOException e )
		{
			System.out.println("could not open image file "+fileName);
		}
	}
}