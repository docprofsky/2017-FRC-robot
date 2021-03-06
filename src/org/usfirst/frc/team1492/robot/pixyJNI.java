/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.usfirst.frc.team1492.robot;

public class pixyJNI {
  public final static native long new_BlockArray(int jarg1);
  public final static native void delete_BlockArray(long jarg1);
  public final static native long BlockArray_getitem(long jarg1, BlockArray jarg1_, int jarg2);
  public final static native void BlockArray_setitem(long jarg1, BlockArray jarg1_, int jarg2, long jarg3, Block jarg3_);
  public final static native long BlockArray_cast(long jarg1, BlockArray jarg1_);
  public final static native long BlockArray_frompointer(long jarg1, Block jarg1_);
  public final static native int PIXY_MIN_X_get();
  public final static native int PIXY_MAX_X_get();
  public final static native int PIXY_MIN_Y_get();
  public final static native int PIXY_MAX_Y_get();
  public final static native int pixy_init();
  public final static native int pixy_get_blocks(int jarg1, long jarg2, BlockArray jarg2_);
  public final static native void pixy_close();
  public final static native int pixy_blocks_are_new();
  public final static native int pixy_cam_set_auto_white_balance(short jarg1);
  public final static native int pixy_cam_get_auto_white_balance();
  public final static native long pixy_cam_get_white_balance_value();
  public final static native int pixy_cam_set_white_balance_value(short jarg1, short jarg2, short jarg3);
  public final static native int pixy_cam_set_auto_exposure_compensation(short jarg1);
  public final static native int pixy_cam_get_auto_exposure_compensation();
  public final static native int pixy_cam_set_exposure_compensation(short jarg1, int jarg2);
  public final static native int pixy_cam_get_exposure_compensation(short[] jarg1, int[] jarg2);
  public final static native int pixy_cam_set_brightness(short jarg1);
  public final static native int pixy_cam_get_brightness();
  public final static native void Block_type_set(long jarg1, Block jarg1_, int jarg2);
  public final static native int Block_type_get(long jarg1, Block jarg1_);
  public final static native void Block_signature_set(long jarg1, Block jarg1_, int jarg2);
  public final static native int Block_signature_get(long jarg1, Block jarg1_);
  public final static native void Block_x_set(long jarg1, Block jarg1_, int jarg2);
  public final static native int Block_x_get(long jarg1, Block jarg1_);
  public final static native void Block_y_set(long jarg1, Block jarg1_, int jarg2);
  public final static native int Block_y_get(long jarg1, Block jarg1_);
  public final static native void Block_width_set(long jarg1, Block jarg1_, int jarg2);
  public final static native int Block_width_get(long jarg1, Block jarg1_);
  public final static native void Block_height_set(long jarg1, Block jarg1_, int jarg2);
  public final static native int Block_height_get(long jarg1, Block jarg1_);
  public final static native void Block_angle_set(long jarg1, Block jarg1_, short jarg2);
  public final static native short Block_angle_get(long jarg1, Block jarg1_);
  public final static native long new_Block();
  public final static native void delete_Block(long jarg1);
}
