package main;

import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.twelvemonkeys.image.ResampleOp;

public class Application {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.out.println("Starting");
		
		// Observer design pattern
			//target / observable
			File rootDir = new File("images/original");
			if (!rootDir.isDirectory() || !rootDir.exists()) {
				System.err.println("it hasn't DIRectory " );
			}
			
			
			
			
			//watch loop
			File[] lastFile = {};
			while(true) {
				File[] files = rootDir.listFiles();
				//detect if something. has changed
				if (files.length != lastFile.length ) {
					System.out.println("--------------");
					System.out.println("Found files :");
				
					for (File file : files) {
						System.out.println(">>" + file);
					}
				
					lastFile = files;
				}
				Thread.sleep(200);
			}
		
		// Observer design pattern
		/////////////////////////////////////
		//Transformer
//		BufferedImage bio = ImageIO.read(new File("images/original/1.jpg"));
//		
//		BufferedImageOp resampler = new ResampleOp(200, 200, ResampleOp.FILTER_LANCZOS);
//		BufferedImage bir = resampler.filter(bio, null);
//		
//		ImageIO.write(bir, "jpeg", new File("images/processed/1.jpg"));  
		////////////////////////////////////
		//	System.out.println("Finished");

	}

}
