/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.usfirst.frc.team1492.robot;

public class Block {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Block(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Block obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pixyJNI.delete_Block(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(int value) {
    pixyJNI.Block_type_set(swigCPtr, this, value);
  }

  public int getType() {
    return pixyJNI.Block_type_get(swigCPtr, this);
  }

  public void setSignature(int value) {
    pixyJNI.Block_signature_set(swigCPtr, this, value);
  }

  public int getSignature() {
    return pixyJNI.Block_signature_get(swigCPtr, this);
  }

  public void setX(int value) {
    pixyJNI.Block_x_set(swigCPtr, this, value);
  }

  public int getX() {
    return pixyJNI.Block_x_get(swigCPtr, this);
  }

  public void setY(int value) {
    pixyJNI.Block_y_set(swigCPtr, this, value);
  }

  public int getY() {
    return pixyJNI.Block_y_get(swigCPtr, this);
  }

  public void setWidth(int value) {
    pixyJNI.Block_width_set(swigCPtr, this, value);
  }

  public int getWidth() {
    return pixyJNI.Block_width_get(swigCPtr, this);
  }

  public void setHeight(int value) {
    pixyJNI.Block_height_set(swigCPtr, this, value);
  }

  public int getHeight() {
    return pixyJNI.Block_height_get(swigCPtr, this);
  }

  public void setAngle(short value) {
    pixyJNI.Block_angle_set(swigCPtr, this, value);
  }

  public short getAngle() {
    return pixyJNI.Block_angle_get(swigCPtr, this);
  }

  public Block() {
    this(pixyJNI.new_Block(), true);
  }

}