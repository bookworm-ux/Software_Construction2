package froggers;

import java.awt.*;

	public class Smile {
		private static final int SMILE_WIDTH_FACTOR = 4;
	    private static final int SMILE_HEIGHT_FACTOR = 2;
		
        private int width;
        private int height;
       

        // Constructor to set the width, height, and color of the smile
        public Smile(int width, int height) {
            this.width = width;
            this.height = height;
           
        }

        public Smile(Component component) {
        	return;
		}

		public void drawAt(int left, int bottom) {
            // Calculate the x and y coordinates for the top-left corner of the bounding box
            // Adjusted to center horizontally
            // Adjusted to center vertically

        	Drawing.pen().setColor(Color.black);
            // Draw the smile as a half circle
        	Drawing.pen().drawArc(left + (width / SMILE_WIDTH_FACTOR ), bottom - height / SMILE_HEIGHT_FACTOR - 10, width / 2, height / 2, 0, -180);
        }
    }
    