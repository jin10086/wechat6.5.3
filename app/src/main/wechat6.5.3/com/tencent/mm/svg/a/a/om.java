package com.tencent.mm.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class om extends c {
    private final int height = 96;
    private final int width = 96;

    protected final int j(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 96;
            case 1:
                return 96;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix d = c.d(looper);
                float[] c = c.c(looper);
                Paint g = c.g(looper);
                g.setFlags(385);
                g.setStyle(Style.FILL);
                Paint g2 = c.g(looper);
                g2.setFlags(385);
                g2.setStyle(Style.STROKE);
                g.setColor(WebView.NIGHT_MODE_COLOR);
                g2.setStrokeWidth(1.0f);
                g2.setStrokeCap(Cap.BUTT);
                g2.setStrokeJoin(Join.MITER);
                g2.setStrokeMiter(4.0f);
                g2.setPathEffect(null);
                c.a(g2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint a = c.a(g, looper);
                a.setColor(-1);
                Path h = c.h(looper);
                h.moveTo(48.0f, 88.0f);
                h.cubicTo(70.09139f, 88.0f, 88.0f, 70.09139f, 88.0f, 48.0f);
                h.cubicTo(88.0f, 25.90861f, 70.09139f, 8.0f, 48.0f, 8.0f);
                h.cubicTo(25.90861f, 8.0f, 8.0f, 25.90861f, 8.0f, 48.0f);
                h.cubicTo(8.0f, 70.09139f, 25.90861f, 88.0f, 48.0f, 88.0f);
                h.close();
                h.moveTo(48.0f, 60.0f);
                h.cubicTo(54.62742f, 60.0f, 60.0f, 54.62742f, 60.0f, 48.0f);
                h.cubicTo(60.0f, 41.37258f, 54.62742f, 36.0f, 48.0f, 36.0f);
                h.cubicTo(41.37258f, 36.0f, 36.0f, 41.37258f, 36.0f, 48.0f);
                h.cubicTo(36.0f, 54.62742f, 41.37258f, 60.0f, 48.0f, 60.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                float[] a2 = c.a(c, 1.0f, 0.0f, 10.0f, 0.0f, 1.0f, 10.0f);
                d.reset();
                d.setValues(a2);
                canvas.concat(d);
                canvas.save();
                Paint a3 = c.a(g, looper);
                a3.setColor(-499359);
                float[] a4 = c.a(a2, 1.0f, 0.0f, 24.0f, 0.0f, 1.0f, 0.0f);
                d.reset();
                d.setValues(a4);
                canvas.concat(d);
                canvas.save();
                a3 = c.a(a3, looper);
                h = c.h(looper);
                h.moveTo(0.0f, 2.6236634f);
                h.cubicTo(8.265033f, -0.6444683f, 17.53581f, -0.805361f, 25.990042f, 1.8393117f);
                h.cubicTo(25.980083f, 10.899578f, 25.960169f, 19.94979f, 26.0f, 29.0f);
                h.cubicTo(17.49598f, 20.04029f, 8.623516f, 11.452647f, 0.0f, 2.6236634f);
                h.lineTo(0.0f, 2.6236634f);
                h.lineTo(0.0f, 2.6236634f);
                h.lineTo(0.0f, 2.6236634f);
                h.lineTo(0.0f, 2.6236634f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a3);
                canvas.restore();
                canvas.restore();
                canvas.save();
                a3 = c.a(g, looper);
                a3.setColor(-9676047);
                a4 = c.a(a4, 1.0f, 0.0f, 53.0f, 0.0f, 1.0f, 3.0f);
                d.reset();
                d.setValues(a4);
                canvas.concat(d);
                canvas.save();
                a3 = c.a(a3, looper);
                h = c.h(looper);
                h.moveTo(0.03728671f, 0.0f);
                h.cubicTo(8.154168f, 3.6518438f, 14.891579f, 10.052603f, 19.0f, 17.968275f);
                h.cubicTo(12.672432f, 24.30884f, 6.344863f, 30.669468f, 0.01729439f, 37.0f);
                h.cubicTo(0.01729439f, 24.670012f, -0.0326864f, 12.340022f, 0.03728671f, 0.0f);
                h.lineTo(0.03728671f, 0.0f);
                h.lineTo(0.03728671f, 0.0f);
                h.lineTo(0.03728671f, 0.0f);
                h.lineTo(0.03728671f, 0.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a3);
                canvas.restore();
                canvas.restore();
                canvas.save();
                a3 = c.a(g, looper);
                a3.setColor(-16384);
                a4 = c.a(a4, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 4.0f);
                d.reset();
                d.setValues(a4);
                canvas.concat(d);
                canvas.save();
                a3 = c.a(a3, looper);
                h = c.h(looper);
                h.moveTo(0.0f, 18.962732f);
                h.cubicTo(3.6939936f, 10.870102f, 10.040855f, 4.0662975f, 17.979437f, 0.0f);
                h.cubicTo(24.326298f, 6.324241f, 30.663149f, 12.648482f, 37.0f, 18.982716f);
                h.cubicTo(24.666666f, 18.982716f, 12.333333f, 19.03267f, 0.0f, 18.962732f);
                h.lineTo(0.0f, 18.962732f);
                h.lineTo(0.0f, 18.962732f);
                h.lineTo(0.0f, 18.962732f);
                h.lineTo(0.0f, 18.962732f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a3);
                canvas.restore();
                canvas.restore();
                canvas.save();
                a3 = c.a(g, looper);
                a3.setColor(-12799249);
                a4 = c.a(a4, 1.0f, 0.0f, 47.0f, 0.0f, 1.0f, 24.0f);
                d.reset();
                d.setValues(a4);
                canvas.concat(d);
                canvas.save();
                a3 = c.a(a3, looper);
                h = c.h(looper);
                h.moveTo(-7.1054274E-15f, 26.0f);
                h.cubicTo(8.894916f, 17.439388f, 17.54834f, 8.640153f, 26.362759f, 0.0f);
                h.cubicTo(29.622887f, 8.262333f, 29.82413f, 17.538815f, 27.167728f, 26.0f);
                h.cubicTo(18.111818f, 25.990057f, 9.055909f, 25.980114f, -7.1054274E-15f, 26.0f);
                h.lineTo(-7.1054274E-15f, 26.0f);
                h.lineTo(-7.1054274E-15f, 26.0f);
                h.lineTo(-7.1054274E-15f, 26.0f);
                h.lineTo(-7.1054274E-15f, 26.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a3);
                canvas.restore();
                canvas.restore();
                canvas.save();
                a3 = c.a(g, looper);
                a3.setColor(-1124019);
                a4 = c.a(a4, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 26.0f);
                d.reset();
                d.setValues(a4);
                canvas.concat(d);
                canvas.save();
                a3 = c.a(a3, looper);
                h = c.h(looper);
                h.moveTo(1.8326316f, 0.01995395f);
                h.cubicTo(10.885068f, 0.00997698f, 19.937506f, 0.0399079f, 29.0f, 0.0f);
                h.cubicTo(19.977737f, 8.450499f, 11.448331f, 17.38987f, 2.5970595f, 26.0f);
                h.cubicTo(-0.6014681f, 17.729086f, -0.83280814f, 8.470453f, 1.8326316f, 0.01995395f);
                h.lineTo(1.8326316f, 0.01995395f);
                h.lineTo(1.8326316f, 0.01995395f);
                h.lineTo(1.8326316f, 0.01995395f);
                h.lineTo(1.8326316f, 0.01995395f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a3);
                canvas.restore();
                canvas.restore();
                canvas.save();
                a3 = c.a(g, looper);
                a3.setColor(-5117108);
                a4 = c.a(a4, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 36.0f);
                d.reset();
                d.setValues(a4);
                canvas.concat(d);
                canvas.save();
                a3 = c.a(a3, looper);
                h = c.h(looper);
                h.moveTo(0.0f, 19.053654f);
                h.cubicTo(6.3366494f, 12.69911f, 12.673299f, 6.354543f, 19.0f, 0.0f);
                h.cubicTo(18.850786f, 12.3300085f, 19.019896f, 24.669992f, 18.910471f, 37.0f);
                h.cubicTo(10.793194f, 33.378807f, 4.088482f, 26.94446f, 0.0f, 19.053654f);
                h.lineTo(0.0f, 19.053654f);
                h.lineTo(0.0f, 19.053654f);
                h.lineTo(0.0f, 19.053654f);
                h.lineTo(0.0f, 19.053654f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a3);
                canvas.restore();
                canvas.restore();
                canvas.save();
                a3 = c.a(g, looper);
                a3.setColor(-10818218);
                a4 = c.a(a4, 1.0f, 0.0f, 26.0f, 0.0f, 1.0f, 47.0f);
                d.reset();
                d.setValues(a4);
                canvas.concat(d);
                canvas.save();
                a3 = c.a(a3, looper);
                h = c.h(looper);
                h.moveTo(0.0f, 7.1054274E-15f);
                h.cubicTo(8.487356f, 8.976492f, 17.383142f, 17.54085f, 26.0f, 26.386665f);
                h.cubicTo(17.7318f, 29.58322f, 8.457471f, 29.854626f, 0.01992337f, 27.160673f);
                h.cubicTo(0.00996169f, 18.103765f, 0.03984674f, 9.056909f, 0.0f, 7.1054274E-15f);
                h.lineTo(0.0f, 7.1054274E-15f);
                h.lineTo(0.0f, 7.1054274E-15f);
                h.lineTo(0.0f, 7.1054274E-15f);
                h.lineTo(0.0f, 7.1054274E-15f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a3);
                canvas.restore();
                canvas.restore();
                canvas.save();
                a3 = c.a(g, looper);
                a3.setColor(-11083026);
                a2 = c.a(a4, 1.0f, 0.0f, 36.0f, 0.0f, 1.0f, 53.0f);
                d.reset();
                d.setValues(a2);
                canvas.concat(d);
                canvas.save();
                Paint a5 = c.a(a3, looper);
                h = c.h(looper);
                h.moveTo(-7.1054274E-15f, 0.01226055f);
                h.cubicTo(12.333333f, 0.02224884f, 24.666666f, -0.0376809f, 37.0f, 0.04222542f);
                h.cubicTo(33.306007f, 8.122752f, 26.969156f, 14.944755f, 19.020563f, 19.0f);
                h.cubicTo(12.683712f, 12.667424f, 6.32684f, 6.3548245f, -7.1054274E-15f, 0.01226055f);
                h.lineTo(-7.1054274E-15f, 0.01226055f);
                h.lineTo(-7.1054274E-15f, 0.01226055f);
                h.lineTo(-7.1054274E-15f, 0.01226055f);
                h.lineTo(-7.1054274E-15f, 0.01226055f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a5);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                c.f(looper);
                break;
        }
        return 0;
    }
}
