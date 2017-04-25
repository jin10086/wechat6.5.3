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

public final class fe extends c {
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
                c = c.a(c, 1.0f, 0.0f, -340.0f, 0.0f, 1.0f, -201.0f);
                d.reset();
                d.setValues(c);
                canvas.concat(d);
                canvas.save();
                float[] a = c.a(c, 1.0f, 0.0f, 349.0f, 0.0f, 1.0f, 210.0f);
                d.reset();
                d.setValues(a);
                canvas.concat(d);
                canvas.save();
                Paint a2 = c.a(g, looper);
                a2.setColor(-13783042);
                Path h = c.h(looper);
                h.moveTo(50.80595f, 0.0f);
                h.cubicTo(58.6365f, 0.0f, 62.5508f, 0.0f, 66.76605f, 1.3325f);
                h.cubicTo(71.36805f, 3.00755f, 74.99245f, 6.63195f, 76.6675f, 11.23395f);
                h.cubicTo(78.0f, 15.44855f, 78.0f, 19.36415f, 78.0f, 27.19405f);
                h.lineTo(78.0f, 50.80595f);
                h.cubicTo(78.0f, 58.6365f, 78.0f, 62.5508f, 76.6675f, 66.76605f);
                h.cubicTo(74.99245f, 71.36805f, 71.36805f, 74.99245f, 66.76605f, 76.66685f);
                h.cubicTo(62.5508f, 78.0f, 58.6365f, 78.0f, 50.80595f, 78.0f);
                h.lineTo(27.19405f, 78.0f);
                h.cubicTo(19.3635f, 78.0f, 15.44855f, 78.0f, 11.23395f, 76.66685f);
                h.cubicTo(6.63195f, 74.99245f, 3.00755f, 71.36805f, 1.3325f, 66.76605f);
                h.cubicTo(0.0f, 62.5508f, 0.0f, 58.6365f, 0.0f, 50.80595f);
                h.lineTo(0.0f, 27.19405f);
                h.cubicTo(0.0f, 19.36415f, 0.0f, 15.44855f, 1.3325f, 11.23395f);
                h.cubicTo(3.00755f, 6.63195f, 6.63195f, 3.00755f, 11.23395f, 1.3325f);
                h.cubicTo(15.44855f, 0.0f, 19.3635f, 0.0f, 27.19405f, 0.0f);
                h.lineTo(50.80595f, 0.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                a2 = c.a(g, looper);
                a2.setColor(-201326593);
                h = c.h(looper);
                h.moveTo(77.15287f, 65.0f);
                h.cubicTo(77.0148f, 65.59051f, 76.85423f, 66.17532f, 76.6675f, 66.76605f);
                h.cubicTo(74.99245f, 71.36805f, 71.36805f, 74.99245f, 66.76605f, 76.66685f);
                h.cubicTo(62.5508f, 78.0f, 58.6365f, 78.0f, 50.80595f, 78.0f);
                h.lineTo(27.19405f, 78.0f);
                h.cubicTo(19.3635f, 78.0f, 15.44855f, 78.0f, 11.23395f, 76.66685f);
                h.cubicTo(6.63195f, 74.99245f, 3.00755f, 71.36805f, 1.3325f, 66.76605f);
                h.cubicTo(1.1457635f, 66.17532f, 0.9851963f, 65.59051f, 0.84713095f, 65.0f);
                h.lineTo(33.0f, 65.0f);
                h.cubicTo(35.795135f, 64.88961f, 38.52101f, 67.3264f, 39.0f, 70.0f);
                h.cubicTo(39.478985f, 67.3264f, 42.204865f, 64.88961f, 46.0f, 65.0f);
                h.lineTo(77.15287f, 65.0f);
                h.close();
                canvas.saveLayerAlpha(null, 230, 4);
                g2 = c.a(a2, looper);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, g2);
                canvas.restore();
                canvas.save();
                a2 = c.a(g, looper);
                a2.setColor(-13783042);
                h = c.h(looper);
                h.moveTo(50.80595f, 0.0f);
                h.cubicTo(58.6365f, 0.0f, 62.5508f, 0.0f, 66.76605f, 1.3325f);
                h.cubicTo(71.36805f, 3.00755f, 74.99245f, 6.63195f, 76.6675f, 11.23395f);
                h.cubicTo(78.0f, 15.44855f, 78.0f, 19.36415f, 78.0f, 27.19405f);
                h.lineTo(78.0f, 50.80595f);
                h.cubicTo(78.0f, 58.6365f, 78.0f, 62.5508f, 76.6675f, 66.76605f);
                h.cubicTo(74.99245f, 71.36805f, 71.36805f, 74.99245f, 66.76605f, 76.66685f);
                h.cubicTo(62.5508f, 78.0f, 58.6365f, 78.0f, 50.80595f, 78.0f);
                h.lineTo(27.19405f, 78.0f);
                h.cubicTo(19.3635f, 78.0f, 15.44855f, 78.0f, 11.23395f, 76.66685f);
                h.cubicTo(6.63195f, 74.99245f, 3.00755f, 71.36805f, 1.3325f, 66.76605f);
                h.cubicTo(0.0f, 62.5508f, 0.0f, 58.6365f, 0.0f, 50.80595f);
                h.lineTo(0.0f, 27.19405f);
                h.cubicTo(0.0f, 19.36415f, 0.0f, 15.44855f, 1.3325f, 11.23395f);
                h.cubicTo(3.00755f, 6.63195f, 6.63195f, 3.00755f, 11.23395f, 1.3325f);
                h.cubicTo(15.44855f, 0.0f, 19.3635f, 0.0f, 27.19405f, 0.0f);
                h.lineTo(50.80595f, 0.0f);
                h.close();
                h.moveTo(50.503235f, 1.0f);
                h.cubicTo(58.133f, 1.0f, 61.946934f, 1.0f, 66.0541f, 2.2983334f);
                h.cubicTo(70.5381f, 3.9304333f, 74.069565f, 7.4619f, 75.70167f, 11.9459f);
                h.cubicTo(77.0f, 16.052433f, 77.0f, 19.867634f, 77.0f, 27.496767f);
                h.lineTo(77.0f, 50.503235f);
                h.cubicTo(77.0f, 58.133f, 77.0f, 61.946934f, 75.70167f, 66.0541f);
                h.cubicTo(74.069565f, 70.5381f, 70.5381f, 74.069565f, 66.0541f, 75.701035f);
                h.cubicTo(61.946934f, 77.0f, 58.133f, 77.0f, 50.503235f, 77.0f);
                h.lineTo(27.496767f, 77.0f);
                h.cubicTo(19.867f, 77.0f, 16.052433f, 77.0f, 11.9459f, 75.701035f);
                h.cubicTo(7.4619f, 74.069565f, 3.9304333f, 70.5381f, 2.2983334f, 66.0541f);
                h.cubicTo(1.0f, 61.946934f, 1.0f, 58.133f, 1.0f, 50.503235f);
                h.lineTo(1.0f, 27.496767f);
                h.cubicTo(1.0f, 19.867634f, 1.0f, 16.052433f, 2.2983334f, 11.9459f);
                h.cubicTo(3.9304333f, 7.4619f, 7.4619f, 3.9304333f, 11.9459f, 2.2983334f);
                h.cubicTo(16.052433f, 1.0f, 19.867f, 1.0f, 27.496767f, 1.0f);
                h.lineTo(50.503235f, 1.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                g = c.a(g, looper);
                g.setColor(-1);
                c = c.a(a, -1.0f, 0.0f, 125.0f, 0.0f, 1.0f, 0.0f);
                d.reset();
                d.setValues(c);
                canvas.concat(d);
                h = c.h(looper);
                h.moveTo(72.0f, 52.056374f);
                h.cubicTo(72.0f, 47.607002f, 67.74677f, 44.0f, 62.5f, 44.0f);
                h.cubicTo(57.253307f, 44.0f, 53.0f, 47.607002f, 53.0f, 52.056374f);
                h.cubicTo(53.0f, 56.505817f, 57.253307f, 60.11282f, 62.5f, 60.11282f);
                h.cubicTo(63.92956f, 60.11282f, 65.28509f, 59.844482f, 66.501205f, 59.364857f);
                h.cubicTo(67.81153f, 60.11975f, 69.11952f, 60.876648f, 69.286606f, 60.985985f);
                h.cubicTo(69.28684f, 60.984447f, 69.288086f, 60.982292f, 69.28879f, 60.98052f);
                h.cubicTo(69.31669f, 60.992764f, 69.34739f, 61.0f, 69.37989f, 61.0f);
                h.cubicTo(69.503876f, 61.0f, 69.60433f, 60.900673f, 69.60433f, 60.778244f);
                h.cubicTo(69.60433f, 60.755222f, 69.59981f, 60.73343f, 69.593185f, 60.712486f);
                h.cubicTo(69.600044f, 60.70748f, 69.60433f, 60.704327f, 69.60433f, 60.704327f);
                h.lineTo(68.72402f, 58.14304f);
                h.cubicTo(70.730896f, 56.665897f, 72.0f, 54.486835f, 72.0f, 52.056374f);
                h.close();
                h.moveTo(65.499954f, 51.0f);
                h.cubicTo(64.671585f, 51.0f, 64.0f, 50.32839f, 64.0f, 49.499954f);
                h.cubicTo(64.0f, 48.67161f, 64.671585f, 48.0f, 65.499954f, 48.0f);
                h.cubicTo(66.328415f, 48.0f, 67.0f, 48.67161f, 67.0f, 49.499954f);
                h.cubicTo(67.0f, 50.32839f, 66.328415f, 51.0f, 65.499954f, 51.0f);
                h.close();
                h.moveTo(59.500046f, 51.0f);
                h.cubicTo(58.671566f, 51.0f, 58.0f, 50.32839f, 58.0f, 49.499954f);
                h.cubicTo(58.0f, 48.67161f, 58.671566f, 48.0f, 59.500046f, 48.0f);
                h.cubicTo(60.328434f, 48.0f, 61.0f, 48.67161f, 61.0f, 49.499954f);
                h.cubicTo(61.0f, 50.32839f, 60.328434f, 51.0f, 59.500046f, 51.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, g);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                c.f(looper);
                break;
        }
        return 0;
    }
}
