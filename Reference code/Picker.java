package picking;

import processing.core.PApplet;
import processing.core.PGraphics;

public class Picker {
  public static final String VERSION = "0.3.1";
  
  protected PApplet parent;
  
  public Buffer buffer;
  
  public Picker(PApplet paramPApplet) {
    this.parent = paramPApplet;
    this.buffer = (Buffer)paramPApplet.createGraphics(paramPApplet.width, paramPApplet.height, "picking.Buffer");
    this.buffer.beginDraw();
    this.buffer.background(0);
    this.buffer.endDraw();
    paramPApplet.registerMethod("pre", this);
    paramPApplet.registerMethod("draw", this);
    welcome();
  }
  
  public void pre() {
    this.parent.beginRecord((PGraphics)this.buffer);
  }
  
  public void draw() {
    if (this.parent.recorder == null)
      this.parent.recorder = (PGraphics)this.buffer; 
    this.parent.endRecord();
  }
  
  public void start(int paramInt) {
    if (paramInt < 0 || paramInt > 16777214) {
      PApplet.println("[Picking error] start(): ID out of range");
      return;
    } 
    if (this.parent.recorder == null)
      this.parent.recorder = (PGraphics)this.buffer; 
    this.buffer.setCurrentId(paramInt);
  }
  
  public void stop() {
    this.parent.recorder = null;
  }
  
  public void resume() {
    if (this.parent.recorder == null)
      this.parent.recorder = (PGraphics)this.buffer; 
  }
  
  public int get(int paramInt1, int paramInt2) {
    return this.buffer.getId(paramInt1, paramInt2);
  }
  
  public PGraphics getBuffer() {
    return (PGraphics)this.buffer;
  }
  
  public static String version() {
    return "0.3.1";
  }
  
  private void welcome() {
    System.out.println("Picking 0.3.1 by Nicolas Clavaud http://n.clavaud.free.fr/");
  }
}


/* Location:              /Users/cob1501/Documents/Processing/libraries/Picking/library/Picking.jar!/picking/Picker.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */