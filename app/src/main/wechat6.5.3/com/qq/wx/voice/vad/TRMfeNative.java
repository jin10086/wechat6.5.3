package com.qq.wx.voice.vad;

public class TRMfeNative {
    public native int mfeClose();

    public native int mfeDetect();

    public native int mfeEnableNoiseDetection(boolean z);

    public native int mfeExit();

    public native int mfeGetCallbackData(byte[] bArr, int i);

    public native int mfeGetEndFrame();

    public native int mfeGetParam(int i);

    public native int mfeGetStartFrame();

    public native int mfeInit();

    public native int mfeOpen();

    public native int mfeSendData(short[] sArr, int i);

    public native int mfeSetParam(int i, int i2);

    public native int mfeStart();

    public native int mfeStop();
}
