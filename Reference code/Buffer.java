package picking;

import processing.core.PImage;
import processing.core.PStyle;
import processing.opengl.PGraphics3D;
import processing.opengl.PShader;

public class Buffer extends PGraphics3D {
  protected int current_color = 0;
  
  public boolean displayable() {
    return true;
  }
  
  public void background(int paramInt) {
    super.background(0);
  }
  
  public void background(float paramFloat) {
    super.background(0);
  }
  
  public void background(float paramFloat1, float paramFloat2) {
    super.background(0);
  }
  
  public void background(int paramInt, float paramFloat) {
    super.background(0);
  }
  
  public void background(float paramFloat1, float paramFloat2, float paramFloat3) {
    super.background(0);
  }
  
  public void background(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    super.background(0);
  }
  
  public void background(PImage paramPImage) {
    super.background(0);
  }
  
  public void lights() {}
  
  public void smooth() {}
  
  public void fill(int paramInt) {}
  
  public void fill(float paramFloat) {}
  
  public void fill(float paramFloat1, float paramFloat2) {}
  
  public void fill(int paramInt, float paramFloat) {}
  
  public void fill(float paramFloat1, float paramFloat2, float paramFloat3) {}
  
  public void fill(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {}
  
  public void stroke(int paramInt) {}
  
  public void stroke(float paramFloat) {}
  
  public void stroke(float paramFloat1, float paramFloat2) {}
  
  public void stroke(int paramInt, float paramFloat) {}
  
  public void stroke(float paramFloat1, float paramFloat2, float paramFloat3) {}
  
  public void stroke(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {}
  
  public void textureMode(int paramInt) {}
  
  public void texture(PImage paramPImage) {}
  
  public void vertex(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5) {
    vertex(paramFloat1, paramFloat2, paramFloat3);
  }
  
  public void image(PImage paramPImage, float paramFloat1, float paramFloat2) {}
  
  public void image(PImage paramPImage, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {}
  
  public void image(PImage paramPImage, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void pushStyle() {}
  
  public void popStyle() {}
  
  public void style(PStyle paramPStyle) {}
  
  public void shader(PShader paramPShader) {}
  
  public void shader(PShader paramPShader, int paramInt) {}
  
  protected void imageImpl(PImage paramPImage, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setCurrentId(int paramInt) {
    this.current_color = paramInt - 16777215;
    super.fill(this.current_color);
  }
  
  public int getId(int paramInt1, int paramInt2) {
    loadPixels();
    int i = this.pixels[paramInt2 * this.width + paramInt1];
    return (i == -1) ? i : (i + 16777215);
  }
}


/* Location:              /Users/cob1501/Documents/Processing/libraries/Picking/library/Picking.jar!/picking/Buffer.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */