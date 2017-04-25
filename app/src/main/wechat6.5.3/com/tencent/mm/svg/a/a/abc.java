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

public final class abc extends c {
    private final int height = 90;
    private final int width = 90;

    protected final int j(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 90;
            case 1:
                return 90;
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
                c = c.a(c, 1.0f, 0.0f, 16.0f, 0.0f, 1.0f, 30.0f);
                d.reset();
                d.setValues(c);
                canvas.concat(d);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path h = c.h(looper);
                h.moveTo(1.7763568E-15f, 0.0f);
                h.lineTo(6.0f, 0.0f);
                h.cubicTo(5.9900165f, 2.0f, 5.9900165f, 4.0f, 6.0f, 6.0f);
                h.lineTo(1.7763568E-15f, 6.0f);
                h.lineTo(1.7763568E-15f, 0.0f);
                h.lineTo(1.7763568E-15f, 0.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                h = c.h(looper);
                h.moveTo(10.0f, 0.0f);
                h.lineTo(16.0f, 0.0f);
                h.lineTo(16.0f, 6.0f);
                h.lineTo(10.0f, 6.0f);
                h.cubicTo(10.009983f, 4.0f, 10.009983f, 2.0f, 10.0f, 0.0f);
                h.lineTo(10.0f, 0.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                Paint a3 = c.a(a, looper);
                Path h2 = c.h(looper);
                h2.moveTo(21.0f, 0.0f);
                h2.lineTo(27.0f, 0.0f);
                h2.lineTo(27.0f, 6.0f);
                h2.lineTo(21.0f, 6.0f);
                h2.lineTo(21.0f, 0.0f);
                h2.lineTo(21.0f, 0.0f);
                h2.close();
                WeChatSVGRenderC2Java.setFillType(h2, 2);
                canvas.drawPath(h2, a3);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                h = c.h(looper);
                h.moveTo(31.0f, 0.0f);
                h.lineTo(37.0f, 0.0f);
                h.lineTo(37.0f, 6.0f);
                h.lineTo(31.0f, 6.0f);
                h.cubicTo(31.009983f, 4.0f, 31.009983f, 2.0f, 31.0f, 0.0f);
                h.lineTo(31.0f, 0.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                h = c.h(looper);
                h.moveTo(42.0f, 0.0f);
                h.lineTo(48.0f, 0.0f);
                h.cubicTo(47.990017f, 2.0f, 47.990017f, 4.0f, 48.0f, 6.0f);
                h.lineTo(42.0f, 6.0f);
                h.lineTo(42.0f, 0.0f);
                h.lineTo(42.0f, 0.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                h = c.h(looper);
                h.moveTo(52.0f, 0.0f);
                h.lineTo(58.0f, 0.0f);
                h.lineTo(58.0f, 6.0f);
                h.lineTo(52.0f, 6.0f);
                h.cubicTo(52.009983f, 4.0f, 52.009983f, 2.0f, 52.0f, 0.0f);
                h.lineTo(52.0f, 0.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                h = c.h(looper);
                h.moveTo(1.7763568E-15f, 12.0f);
                h.lineTo(6.0f, 12.0f);
                h.cubicTo(5.9900165f, 14.0f, 5.9900165f, 16.0f, 6.0f, 18.0f);
                h.lineTo(1.7763568E-15f, 18.0f);
                h.lineTo(1.7763568E-15f, 12.0f);
                h.lineTo(1.7763568E-15f, 12.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                h = c.h(looper);
                h.moveTo(10.0f, 12.0f);
                h.lineTo(16.0f, 12.0f);
                h.lineTo(16.0f, 18.0f);
                h.lineTo(10.0f, 18.0f);
                h.cubicTo(10.009983f, 16.0f, 10.009983f, 14.0f, 10.0f, 12.0f);
                h.lineTo(10.0f, 12.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                a3 = c.a(a, looper);
                h2 = c.h(looper);
                h2.moveTo(21.0f, 12.0f);
                h2.lineTo(27.0f, 12.0f);
                h2.lineTo(27.0f, 18.0f);
                h2.lineTo(21.0f, 18.0f);
                h2.lineTo(21.0f, 12.0f);
                h2.lineTo(21.0f, 12.0f);
                h2.close();
                WeChatSVGRenderC2Java.setFillType(h2, 2);
                canvas.drawPath(h2, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(a, looper);
                h2 = c.h(looper);
                h2.moveTo(31.0f, 12.0f);
                h2.lineTo(37.0f, 12.0f);
                h2.lineTo(37.0f, 18.0f);
                h2.lineTo(31.0f, 18.0f);
                h2.lineTo(31.0f, 12.0f);
                h2.lineTo(31.0f, 12.0f);
                h2.close();
                WeChatSVGRenderC2Java.setFillType(h2, 2);
                canvas.drawPath(h2, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(a, looper);
                h2 = c.h(looper);
                h2.moveTo(42.0f, 12.0f);
                h2.lineTo(48.0f, 12.0f);
                h2.lineTo(48.0f, 18.0f);
                h2.lineTo(42.0f, 18.0f);
                h2.lineTo(42.0f, 12.0f);
                h2.lineTo(42.0f, 12.0f);
                h2.close();
                WeChatSVGRenderC2Java.setFillType(h2, 2);
                canvas.drawPath(h2, a3);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                h = c.h(looper);
                h.moveTo(52.0f, 12.0f);
                h.lineTo(58.0f, 12.0f);
                h.lineTo(58.0f, 18.0f);
                h.lineTo(52.0f, 18.0f);
                h.cubicTo(52.009983f, 16.0f, 52.009983f, 14.0f, 52.0f, 12.0f);
                h.lineTo(52.0f, 12.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                h = c.h(looper);
                h.moveTo(10.0f, 24.0f);
                h.lineTo(48.0f, 24.0f);
                h.cubicTo(47.989872f, 25.99852f, 47.989872f, 27.99704f, 48.0f, 30.0f);
                h.cubicTo(35.329956f, 30.005552f, 22.670042f, 29.99556f, 10.0f, 30.0f);
                h.cubicTo(10.010128f, 27.99704f, 10.010128f, 25.99852f, 10.0f, 24.0f);
                h.lineTo(10.0f, 24.0f);
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
