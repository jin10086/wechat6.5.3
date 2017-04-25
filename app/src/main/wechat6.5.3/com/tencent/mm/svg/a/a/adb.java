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

public final class adb extends c {
    private final int height = 144;
    private final int width = 144;

    protected final int j(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 144;
            case 1:
                return 144;
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
                c = c.a(c, 1.0f, 0.0f, 24.0f, 0.0f, 1.0f, 24.0f);
                d.reset();
                d.setValues(c);
                canvas.concat(d);
                Paint a = c.a(g, looper);
                a.setColor(-9473160);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path h = c.h(looper);
                h.moveTo(48.0f, 96.0f);
                h.cubicTo(74.50967f, 96.0f, 96.0f, 74.50967f, 96.0f, 48.0f);
                h.cubicTo(96.0f, 21.490332f, 74.50967f, 0.0f, 48.0f, 0.0f);
                h.cubicTo(21.490332f, 0.0f, 0.0f, 21.490332f, 0.0f, 48.0f);
                h.cubicTo(0.0f, 74.50967f, 21.490332f, 96.0f, 48.0f, 96.0f);
                h.close();
                h.moveTo(48.0f, 94.0f);
                h.cubicTo(73.4051f, 94.0f, 94.0f, 73.4051f, 94.0f, 48.0f);
                h.cubicTo(94.0f, 22.594902f, 73.4051f, 2.0f, 48.0f, 2.0f);
                h.cubicTo(22.594902f, 2.0f, 2.0f, 22.594902f, 2.0f, 48.0f);
                h.cubicTo(2.0f, 73.4051f, 22.594902f, 94.0f, 48.0f, 94.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(g, looper);
                a2.setColor(-9473160);
                h = c.h(looper);
                h.moveTo(26.0f, 32.9981f);
                h.cubicTo(26.0f, 31.89458f, 26.886707f, 31.0f, 27.998102f, 31.0f);
                h.lineTo(32.0019f, 31.0f);
                h.cubicTo(33.10542f, 31.0f, 34.0f, 31.886707f, 34.0f, 32.9981f);
                h.lineTo(34.0f, 37.0019f);
                h.cubicTo(34.0f, 38.10542f, 33.113293f, 39.0f, 32.0019f, 39.0f);
                h.lineTo(27.998102f, 39.0f);
                h.cubicTo(26.89458f, 39.0f, 26.0f, 38.113293f, 26.0f, 37.0019f);
                h.lineTo(26.0f, 32.9981f);
                h.lineTo(26.0f, 32.9981f);
                h.close();
                h.moveTo(26.0f, 44.9981f);
                h.cubicTo(26.0f, 43.89458f, 26.886707f, 43.0f, 27.998102f, 43.0f);
                h.lineTo(32.0019f, 43.0f);
                h.cubicTo(33.10542f, 43.0f, 34.0f, 43.886707f, 34.0f, 44.9981f);
                h.lineTo(34.0f, 49.0019f);
                h.cubicTo(34.0f, 50.10542f, 33.113293f, 51.0f, 32.0019f, 51.0f);
                h.lineTo(27.998102f, 51.0f);
                h.cubicTo(26.89458f, 51.0f, 26.0f, 50.113293f, 26.0f, 49.0019f);
                h.lineTo(26.0f, 44.9981f);
                h.lineTo(26.0f, 44.9981f);
                h.close();
                h.moveTo(50.0f, 32.9981f);
                h.cubicTo(50.0f, 31.89458f, 50.886707f, 31.0f, 51.9981f, 31.0f);
                h.lineTo(56.0019f, 31.0f);
                h.cubicTo(57.10542f, 31.0f, 58.0f, 31.886707f, 58.0f, 32.9981f);
                h.lineTo(58.0f, 37.0019f);
                h.cubicTo(58.0f, 38.10542f, 57.113293f, 39.0f, 56.0019f, 39.0f);
                h.lineTo(51.9981f, 39.0f);
                h.cubicTo(50.89458f, 39.0f, 50.0f, 38.113293f, 50.0f, 37.0019f);
                h.lineTo(50.0f, 32.9981f);
                h.lineTo(50.0f, 32.9981f);
                h.close();
                h.moveTo(50.0f, 44.9981f);
                h.cubicTo(50.0f, 43.89458f, 50.886707f, 43.0f, 51.9981f, 43.0f);
                h.lineTo(56.0019f, 43.0f);
                h.cubicTo(57.10542f, 43.0f, 58.0f, 43.886707f, 58.0f, 44.9981f);
                h.lineTo(58.0f, 49.0019f);
                h.cubicTo(58.0f, 50.10542f, 57.113293f, 51.0f, 56.0019f, 51.0f);
                h.lineTo(51.9981f, 51.0f);
                h.cubicTo(50.89458f, 51.0f, 50.0f, 50.113293f, 50.0f, 49.0019f);
                h.lineTo(50.0f, 44.9981f);
                h.lineTo(50.0f, 44.9981f);
                h.close();
                h.moveTo(38.0f, 32.9981f);
                h.cubicTo(38.0f, 31.89458f, 38.886707f, 31.0f, 39.9981f, 31.0f);
                h.lineTo(44.0019f, 31.0f);
                h.cubicTo(45.10542f, 31.0f, 46.0f, 31.886707f, 46.0f, 32.9981f);
                h.lineTo(46.0f, 37.0019f);
                h.cubicTo(46.0f, 38.10542f, 45.113293f, 39.0f, 44.0019f, 39.0f);
                h.lineTo(39.9981f, 39.0f);
                h.cubicTo(38.89458f, 39.0f, 38.0f, 38.113293f, 38.0f, 37.0019f);
                h.lineTo(38.0f, 32.9981f);
                h.lineTo(38.0f, 32.9981f);
                h.close();
                h.moveTo(38.0f, 44.9981f);
                h.cubicTo(38.0f, 43.89458f, 38.886707f, 43.0f, 39.9981f, 43.0f);
                h.lineTo(44.0019f, 43.0f);
                h.cubicTo(45.10542f, 43.0f, 46.0f, 43.886707f, 46.0f, 44.9981f);
                h.lineTo(46.0f, 49.0019f);
                h.cubicTo(46.0f, 50.10542f, 45.113293f, 51.0f, 44.0019f, 51.0f);
                h.lineTo(39.9981f, 51.0f);
                h.cubicTo(38.89458f, 51.0f, 38.0f, 50.113293f, 38.0f, 49.0019f);
                h.lineTo(38.0f, 44.9981f);
                h.lineTo(38.0f, 44.9981f);
                h.close();
                h.moveTo(62.0f, 32.9981f);
                h.cubicTo(62.0f, 31.89458f, 62.886707f, 31.0f, 63.9981f, 31.0f);
                h.lineTo(68.0019f, 31.0f);
                h.cubicTo(69.10542f, 31.0f, 70.0f, 31.886707f, 70.0f, 32.9981f);
                h.lineTo(70.0f, 37.0019f);
                h.cubicTo(70.0f, 38.10542f, 69.1133f, 39.0f, 68.0019f, 39.0f);
                h.lineTo(63.9981f, 39.0f);
                h.cubicTo(62.89458f, 39.0f, 62.0f, 38.113293f, 62.0f, 37.0019f);
                h.lineTo(62.0f, 32.9981f);
                h.lineTo(62.0f, 32.9981f);
                h.close();
                h.moveTo(62.0f, 44.9981f);
                h.cubicTo(62.0f, 43.89458f, 62.886707f, 43.0f, 63.9981f, 43.0f);
                h.lineTo(68.0019f, 43.0f);
                h.cubicTo(69.10542f, 43.0f, 70.0f, 43.886707f, 70.0f, 44.9981f);
                h.lineTo(70.0f, 49.0019f);
                h.cubicTo(70.0f, 50.10542f, 69.1133f, 51.0f, 68.0019f, 51.0f);
                h.lineTo(63.9981f, 51.0f);
                h.cubicTo(62.89458f, 51.0f, 62.0f, 50.113293f, 62.0f, 49.0019f);
                h.lineTo(62.0f, 44.9981f);
                h.lineTo(62.0f, 44.9981f);
                h.close();
                h.moveTo(34.0f, 58.9981f);
                h.cubicTo(34.0f, 57.89458f, 34.8999f, 57.0f, 35.991245f, 57.0f);
                h.lineTo(60.008755f, 57.0f);
                h.cubicTo(61.10849f, 57.0f, 62.0f, 57.886707f, 62.0f, 58.9981f);
                h.lineTo(62.0f, 63.0019f);
                h.cubicTo(62.0f, 64.10542f, 61.1001f, 65.0f, 60.008755f, 65.0f);
                h.lineTo(35.991245f, 65.0f);
                h.cubicTo(34.89151f, 65.0f, 34.0f, 64.1133f, 34.0f, 63.0019f);
                h.lineTo(34.0f, 58.9981f);
                h.lineTo(34.0f, 58.9981f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.restore();
                c.f(looper);
                break;
        }
        return 0;
    }
}
