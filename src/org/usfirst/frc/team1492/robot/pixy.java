/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.usfirst.frc.team1492.robot;

public class pixy implements pixyConstants {
  public static int pixy_init() {
    return pixyJNI.pixy_init();
  }

  public static int pixy_get_blocks(int max_blocks, BlockArray blocks) {
    return pixyJNI.pixy_get_blocks(max_blocks, BlockArray.getCPtr(blocks), blocks);
  }

  public static void pixy_close() {
    pixyJNI.pixy_close();
  }

  public static int pixy_blocks_are_new() {
    return pixyJNI.pixy_blocks_are_new();
  }

  public static int pixy_cam_set_auto_white_balance(short value) {
    return pixyJNI.pixy_cam_set_auto_white_balance(value);
  }

  public static int pixy_cam_get_auto_white_balance() {
    return pixyJNI.pixy_cam_get_auto_white_balance();
  }

  public static long pixy_cam_get_white_balance_value() {
    return pixyJNI.pixy_cam_get_white_balance_value();
  }

  public static int pixy_cam_set_white_balance_value(short red, short green, short blue) {
    return pixyJNI.pixy_cam_set_white_balance_value(red, green, blue);
  }

  public static int pixy_cam_set_auto_exposure_compensation(short enable) {
    return pixyJNI.pixy_cam_set_auto_exposure_compensation(enable);
  }

  public static int pixy_cam_get_auto_exposure_compensation() {
    return pixyJNI.pixy_cam_get_auto_exposure_compensation();
  }

  public static int pixy_cam_set_exposure_compensation(short gain, int compensation) {
    return pixyJNI.pixy_cam_set_exposure_compensation(gain, compensation);
  }

  public static int pixy_cam_get_exposure_compensation(short[] gain, int[] compensation) {
    return pixyJNI.pixy_cam_get_exposure_compensation(gain, compensation);
  }

  public static int pixy_cam_set_brightness(short brightness) {
    return pixyJNI.pixy_cam_set_brightness(brightness);
  }

  public static int pixy_cam_get_brightness() {
    return pixyJNI.pixy_cam_get_brightness();
  }

}