package com.tencent.mm.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.WeChatSVGRenderC2Java;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class dl extends c {
    private final int height = 54;
    private final int width = 54;

    protected final int j(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 54;
            case 1:
                return 54;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                c.d(looper);
                c.c(looper);
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
                Paint a = c.a(g, looper);
                a.setColor(-1);
                canvas.save();
                Paint a2 = c.a(a, looper);
                Path h = c.h(looper);
                h.moveTo(0.0f, 0.0f);
                h.lineTo(26.0f, 0.0f);
                h.cubicTo(12.533542f, 0.5350773f, 0.82137287f, 11.880697f, 0.0f, 25.0f);
                h.lineTo(0.0f, 0.0f);
                h.lineTo(0.0f, 0.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                h = c.h(looper);
                h.moveTo(29.0f, 0.0f);
                h.lineTo(54.0f, 0.0f);
                h.lineTo(54.0f, 26.0f);
                h.cubicTo(53.438755f, 12.482031f, 42.08586f, 0.7210938f, 29.0f, 0.0f);
                h.lineTo(29.0f, 0.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                h = c.h(looper);
                h.moveTo(21.470905f, 3.7110238f);
                h.cubicTo(33.007473f, 0.630928f, 45.994865f, 7.8811536f, 49.63694f, 19.211506f);
                h.cubicTo(52.53859f, 26.971746f, 50.667526f, 36.10203f, 45.3545f, 42.382225f);
                h.cubicTo(40.441704f, 48.312412f, 32.5272f, 51.622513f, 24.85283f, 50.902493f);
                h.cubicTo(18.869425f, 50.292473f, 13.106144f, 47.452385f, 9.113872f, 42.92224f);
                h.cubicTo(3.6507616f, 36.822052f, 1.4795256f, 27.781773f, 4.1210294f, 19.961529f);
                h.cubicTo(6.492379f, 11.971281f, 13.366292f, 5.591082f, 21.470905f, 3.7110238f);
                h.lineTo(21.470905f, 3.7110238f);
                h.close();
                h.moveTo(19.537832f, 16.591116f);
                h.cubicTo(18.1471f, 18.38323f, 18.035437f, 20.670403f, 17.781652f, 22.809057f);
                h.cubicTo(18.918602f, 22.82886f, 20.065702f, 22.848661f, 21.20265f, 22.858562f);
                h.cubicTo(21.334618f, 19.967419f, 22.654291f, 16.353489f, 26.095592f, 16.046553f);
                h.cubicTo(30.470816f, 15.0168295f, 33.912117f, 20.007023f, 31.820944f, 23.729868f);
                h.cubicTo(29.039478f, 28.63095f, 22.49187f, 29.720081f, 19.334806f, 34.32413f);
                h.cubicTo(17.852713f, 36.26476f, 17.46696f, 38.68065f, 17.0f, 40.997524f);
                h.cubicTo(23.273523f, 40.997524f, 29.536894f, 41.007427f, 35.810417f, 40.987625f);
                h.lineTo(35.810417f, 38.03707f);
                h.cubicTo(30.856567f, 37.997467f, 25.902718f, 38.076675f, 20.948868f, 37.987568f);
                h.cubicTo(23.303976f, 31.789427f, 31.455496f, 31.096346f, 34.734375f, 25.611092f);
                h.cubicTo(36.866154f, 22.195185f, 36.338287f, 17.11588f, 32.896984f, 14.69009f);
                h.cubicTo(28.877058f, 11.957365f, 22.41066f, 12.501929f, 19.537832f, 16.591116f);
                h.lineTo(19.537832f, 16.591116f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                a2 = c.a(a, looper);
                h = c.h(looper);
                h.moveTo(0.0f, 28.0f);
                h.cubicTo(0.554895f, 41.466824f, 11.880697f, 53.177986f, 25.0f, 54.0f);
                h.lineTo(0.0f, 54.0f);
                h.lineTo(0.0f, 28.0f);
                h.lineTo(0.0f, 28.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a2);
                canvas.restore();
                canvas.save();
                a = c.a(a, looper);
                h = c.h(looper);
                h.moveTo(28.0f, 54.0f);
                h.cubicTo(41.516758f, 53.468296f, 53.280594f, 42.105553f, 54.0f, 29.0f);
                h.lineTo(54.0f, 54.0f);
                h.lineTo(28.0f, 54.0f);
                h.lineTo(28.0f, 54.0f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                g = c.a(g, looper);
                g.setColor(-16139513);
                canvas.save();
                a = c.a(g, looper);
                h = c.h(looper);
                h.moveTo(25.64f, 0.0f);
                h.lineTo(28.61f, 0.0f);
                h.cubicTo(41.9f, 0.71f, 53.43f, 12.29f, 54.0f, 25.6f);
                h.lineTo(54.0f, 28.61f);
                h.cubicTo(53.29f, 41.92f, 41.68f, 53.46f, 28.34f, 54.0f);
                h.lineTo(25.23f, 54.0f);
                h.cubicTo(11.99f, 53.19f, 0.56f, 41.65f, 0.0f, 28.38f);
                h.lineTo(0.0f, 25.23f);
                h.cubicTo(0.81f, 11.99f, 12.36f, 0.54f, 25.64f, 0.0f);
                h.lineTo(25.64f, 0.0f);
                h.close();
                h.moveTo(21.470905f, 3.7110238f);
                h.cubicTo(13.366292f, 5.591082f, 6.492379f, 11.971281f, 4.1210294f, 19.961529f);
                h.cubicTo(1.4795256f, 27.781773f, 3.6507616f, 36.822052f, 9.113872f, 42.92224f);
                h.cubicTo(13.106144f, 47.452385f, 18.869425f, 50.292473f, 24.85283f, 50.902493f);
                h.cubicTo(32.5272f, 51.622513f, 40.441704f, 48.312412f, 45.3545f, 42.382225f);
                h.cubicTo(50.667526f, 36.10203f, 52.53859f, 26.971746f, 49.63694f, 19.211506f);
                h.cubicTo(45.994865f, 7.8811536f, 33.007473f, 0.630928f, 21.470905f, 3.7110238f);
                h.lineTo(21.470905f, 3.7110238f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                g = c.a(g, looper);
                h = c.h(looper);
                h.moveTo(19.537832f, 16.591116f);
                h.cubicTo(22.41066f, 12.501929f, 28.877058f, 11.957365f, 32.896984f, 14.69009f);
                h.cubicTo(36.338287f, 17.11588f, 36.866154f, 22.195185f, 34.734375f, 25.611092f);
                h.cubicTo(31.455496f, 31.096346f, 23.303976f, 31.789427f, 20.948868f, 37.987568f);
                h.cubicTo(25.902718f, 38.076675f, 30.856567f, 37.997467f, 35.810417f, 38.03707f);
                h.lineTo(35.810417f, 40.987625f);
                h.cubicTo(29.536894f, 41.007427f, 23.273523f, 40.997524f, 17.0f, 40.997524f);
                h.cubicTo(17.46696f, 38.68065f, 17.852713f, 36.26476f, 19.334806f, 34.32413f);
                h.cubicTo(22.49187f, 29.720081f, 29.039478f, 28.63095f, 31.820944f, 23.729868f);
                h.cubicTo(33.912117f, 20.007023f, 30.470816f, 15.0168295f, 26.095592f, 16.046553f);
                h.cubicTo(22.654291f, 16.353489f, 21.334618f, 19.967419f, 21.20265f, 22.858562f);
                h.cubicTo(20.065702f, 22.848661f, 18.918602f, 22.82886f, 17.781652f, 22.809057f);
                h.cubicTo(18.035437f, 20.670403f, 18.1471f, 18.38323f, 19.537832f, 16.591116f);
                h.lineTo(19.537832f, 16.591116f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, g);
                canvas.restore();
                c.f(looper);
                break;
        }
        return 0;
    }
}
