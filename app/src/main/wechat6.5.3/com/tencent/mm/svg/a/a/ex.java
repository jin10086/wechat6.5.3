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

public final class ex extends c {
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
                c = c.a(c, 1.0f, 0.0f, 16.0f, 0.0f, 1.0f, 10.0f);
                d.reset();
                d.setValues(c);
                canvas.concat(d);
                canvas.save();
                Paint a = c.a(g, looper);
                a.setColor(-22016);
                Path h = c.h(looper);
                h.moveTo(19.317638f, 63.759476f);
                h.cubicTo(12.20059f, 64.09469f, 6.5654516f, 67.05959f, 6.7320137f, 70.3846f);
                h.cubicTo(6.896771f, 73.70869f, 12.802292f, 76.13345f, 19.918438f, 75.80005f);
                h.cubicTo(27.036388f, 75.467094f, 32.671078f, 72.50083f, 32.504063f, 69.17493f);
                h.cubicTo(32.34021f, 65.85083f, 26.43559f, 63.42607f, 19.317638f, 63.759476f);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                a = c.a(g, looper);
                a.setColor(-22016);
                h = c.h(looper);
                h.moveTo(45.6783f, 63.759476f);
                h.cubicTo(52.791286f, 64.09469f, 58.421005f, 67.05959f, 58.25625f, 70.3846f);
                h.cubicTo(58.089687f, 73.70869f, 52.18823f, 76.13345f, 45.07705f, 75.80005f);
                h.cubicTo(37.964516f, 75.467094f, 32.335243f, 72.50083f, 32.49955f, 69.17493f);
                h.cubicTo(32.664757f, 65.85083f, 38.565765f, 63.42607f, 45.6783f, 63.759476f);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                a = c.a(g, looper);
                a.setColor(WebView.NIGHT_MODE_COLOR);
                h = c.h(looper);
                h.moveTo(10.228472f, 29.266787f);
                h.cubicTo(10.228472f, 29.773453f, 9.544167f, 30.184214f, 8.700069f, 30.184214f);
                h.cubicTo(7.8555207f, 30.184214f, 7.171215f, 29.773453f, 7.171215f, 29.266787f);
                h.cubicTo(7.171215f, 28.761024f, 7.8555207f, 28.348452f, 8.700069f, 28.348452f);
                h.cubicTo(9.544167f, 28.348452f, 10.228472f, 28.761024f, 10.228472f, 29.266787f);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                a = c.a(g, looper);
                a.setColor(WebView.NIGHT_MODE_COLOR);
                h = c.h(looper);
                h.moveTo(57.57375f, 29.266787f);
                h.cubicTo(57.57375f, 29.773453f, 56.888992f, 30.184214f, 56.045345f, 30.184214f);
                h.cubicTo(55.201702f, 30.184214f, 54.517395f, 29.773453f, 54.517395f, 29.266787f);
                h.cubicTo(54.517395f, 28.761024f, 55.201702f, 28.348452f, 56.045345f, 28.348452f);
                h.cubicTo(56.888992f, 28.348452f, 57.57375f, 28.761024f, 57.57375f, 29.266787f);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                a = c.a(g, looper);
                a.setColor(WebView.NIGHT_MODE_COLOR);
                h = c.h(looper);
                h.moveTo(6.427778f, 46.39393f);
                h.cubicTo(6.427778f, 61.615643f, 18.18059f, 70.99441f, 32.50316f, 70.99441f);
                h.cubicTo(46.826633f, 70.99441f, 58.300034f, 61.52381f, 58.300034f, 46.39393f);
                h.cubicTo(58.300034f, 31.456762f, 46.688057f, 19.344715f, 32.361874f, 19.344715f);
                h.cubicTo(18.039757f, 19.344715f, 6.427778f, 31.456762f, 6.427778f, 46.39393f);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                a = c.a(g, looper);
                a.setColor(WebView.NIGHT_MODE_COLOR);
                h = c.h(looper);
                h.moveTo(56.220936f, 33.18576f);
                h.cubicTo(56.220936f, 33.18576f, 69.18979f, 46.24419f, 63.27434f, 58.62993f);
                h.cubicTo(61.354584f, 62.35483f, 50.905834f, 47.794952f, 56.220936f, 33.18576f);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                a = c.a(g, looper);
                a.setColor(WebView.NIGHT_MODE_COLOR);
                h = c.h(looper);
                h.moveTo(8.601215f, 33.18667f);
                h.cubicTo(8.601215f, 33.18667f, -4.118021f, 46.246906f, 1.6827778f, 58.630833f);
                h.cubicTo(3.5659723f, 62.35619f, 13.811146f, 47.797215f, 8.601215f, 33.18667f);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                a = c.a(g, looper);
                a.setColor(-1);
                h = c.h(looper);
                h.moveTo(11.798403f, 48.2505f);
                h.cubicTo(11.798403f, 60.52993f, 19.81823f, 69.94986f, 32.105488f, 69.94986f);
                h.cubicTo(44.393196f, 69.94986f, 52.329063f, 60.52993f, 52.329063f, 48.2505f);
                h.cubicTo(52.329063f, 36.538357f, 43.567604f, 27.618761f, 32.063057f, 27.618761f);
                h.cubicTo(20.557604f, 27.618761f, 11.798403f, 36.538357f, 11.798403f, 48.2505f);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                a = c.a(g, looper);
                a.setColor(WebView.NIGHT_MODE_COLOR);
                h = c.h(looper);
                h.moveTo(56.925556f, 25.535095f);
                h.cubicTo(56.538265f, 39.109238f, 52.788578f, 42.363667f, 32.406113f, 42.363667f);
                h.cubicTo(12.020486f, 42.363667f, 7.7923265f, 39.114216f, 7.7923265f, 25.535095f);
                h.cubicTo(7.7923265f, 10.712833f, 18.790869f, 0.040261906f, 32.35691f, 0.040261906f);
                h.cubicTo(45.927464f, 0.040261906f, 57.303368f, 12.237809f, 56.925556f, 25.535095f);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                a = c.a(g, looper);
                a.setColor(-22016);
                h = c.h(looper);
                h.moveTo(42.931145f, 33.38933f);
                h.cubicTo(37.711735f, 36.21807f, 36.26097f, 37.717712f, 32.15785f, 37.86474f);
                h.cubicTo(28.053368f, 38.010857f, 26.60486f, 36.21807f, 21.384098f, 33.38933f);
                h.cubicTo(13.171077f, 28.939714f, 16.832293f, 28.565596f, 22.055313f, 26.94381f);
                h.cubicTo(25.154549f, 25.982048f, 29.413403f, 25.511572f, 32.15785f, 25.511572f);
                h.cubicTo(34.900036f, 25.511572f, 39.161144f, 25.982048f, 42.25948f, 26.94381f);
                h.cubicTo(47.484306f, 28.565596f, 51.143715f, 28.939714f, 42.931145f, 33.38933f);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                a = c.a(g, looper);
                a.setColor(-5493976);
                h = c.h(looper);
                h.moveTo(44.601738f, 29.397976f);
                h.cubicTo(44.601738f, 29.397976f, 43.008785f, 31.826357f, 38.675903f, 33.543144f);
                h.cubicTo(36.40587f, 34.442024f, 35.466526f, 36.505787f, 32.15785f, 36.505787f);
                h.cubicTo(28.849619f, 36.505787f, 27.90441f, 34.45469f, 25.63934f, 33.543144f);
                h.cubicTo(21.366041f, 31.826357f, 19.714409f, 29.397976f, 19.714409f, 29.397976f);
                h.cubicTo(20.675869f, 30.167025f, 24.4558f, 33.876095f, 32.098717f, 33.876095f);
                h.cubicTo(39.745243f, 33.876095f, 43.640278f, 30.167025f, 44.601738f, 29.397976f);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                a = c.a(g, looper);
                a.setColor(-1);
                h = c.h(looper);
                h.moveTo(20.866354f, 18.413261f);
                h.cubicTo(20.72868f, 14.732691f, 22.670105f, 11.656953f, 25.204653f, 11.5420475f);
                h.cubicTo(27.736042f, 11.428952f, 29.9f, 14.320571f, 30.037674f, 17.999786f);
                h.cubicTo(30.17625f, 21.679905f, 28.234827f, 24.755644f, 25.701632f, 24.869642f);
                h.cubicTo(23.167986f, 24.984095f, 21.002222f, 22.09112f, 20.866354f, 18.413261f);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                a = c.a(g, looper);
                a.setColor(-1);
                h = c.h(looper);
                h.moveTo(33.929096f, 18.343596f);
                h.cubicTo(33.929096f, 14.670714f, 35.98021f, 11.692691f, 38.50889f, 11.692691f);
                h.cubicTo(41.037117f, 11.692691f, 43.08913f, 14.670714f, 43.08913f, 18.343596f);
                h.cubicTo(43.08913f, 22.01512f, 41.037117f, 24.991785f, 38.50889f, 24.991785f);
                h.cubicTo(35.98021f, 24.991785f, 33.929096f, 22.01512f, 33.929096f, 18.343596f);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                a = c.a(g, looper);
                a.setColor(WebView.NIGHT_MODE_COLOR);
                h = c.h(looper);
                h.moveTo(39.772327f, 20.095667f);
                h.cubicTo(39.44507f, 20.095667f, 39.180103f, 19.82831f, 39.180103f, 19.499428f);
                h.lineTo(39.180103f, 19.361452f);
                h.cubicTo(39.180103f, 17.813404f, 38.592396f, 16.601477f, 37.844444f, 16.601477f);
                h.cubicTo(37.09469f, 16.601477f, 36.50698f, 17.813404f, 36.50698f, 19.361452f);
                h.lineTo(36.50698f, 19.499428f);
                h.cubicTo(36.50698f, 19.82831f, 36.242916f, 20.095667f, 35.914757f, 20.095667f);
                h.cubicTo(35.5875f, 20.095667f, 35.32073f, 19.82831f, 35.32073f, 19.499428f);
                h.lineTo(35.32073f, 19.361452f);
                h.cubicTo(35.32073f, 17.035763f, 36.36073f, 15.410357f, 37.844444f, 15.410357f);
                h.cubicTo(39.327255f, 15.410357f, 40.366356f, 17.035763f, 40.366356f, 19.361452f);
                h.lineTo(40.366356f, 19.499428f);
                h.cubicTo(40.366356f, 19.82831f, 40.099133f, 20.095667f, 39.772327f, 20.095667f);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                a = c.a(g, looper);
                a.setColor(WebView.NIGHT_MODE_COLOR);
                h = c.h(looper);
                h.moveTo(28.82118f, 17.794405f);
                h.cubicTo(28.941702f, 19.502596f, 28.113853f, 21.020334f, 26.974548f, 21.186357f);
                h.cubicTo(25.833437f, 21.351929f, 24.811493f, 20.102f, 24.689617f, 18.392904f);
                h.cubicTo(24.570902f, 16.68381f, 25.397396f, 15.166071f, 26.534895f, 15.001857f);
                h.cubicTo(27.677813f, 14.835381f, 28.701563f, 16.086666f, 28.82118f, 17.794405f);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                a = c.a(g, looper);
                a.setColor(-1);
                h = c.h(looper);
                h.moveTo(27.989721f, 17.69669f);
                h.cubicTo(28.00868f, 18.267595f, 27.690903f, 18.756166f, 27.281042f, 18.786476f);
                h.cubicTo(26.87434f, 18.8195f, 26.52948f, 18.383406f, 26.51052f, 17.810238f);
                h.cubicTo(26.49382f, 17.24069f, 26.811146f, 16.749857f, 27.218298f, 16.719095f);
                h.cubicTo(27.627708f, 16.688786f, 27.971666f, 17.125786f, 27.989721f, 17.69669f);
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                a = c.a(g, looper);
                a.setColor(-1889520);
                h = c.h(looper);
                h.moveTo(57.12417f, 28.60631f);
                h.cubicTo(57.05375f, 28.7565f, 56.963924f, 28.923882f, 56.853333f, 29.105738f);
                h.cubicTo(55.16153f, 31.766644f, 47.320904f, 39.00293f, 32.362778f, 39.0925f);
                h.cubicTo(17.404202f, 39.00293f, 9.565382f, 31.766644f, 7.873125f, 29.105738f);
                h.cubicTo(7.762986f, 28.923882f, 7.673611f, 28.7565f, 7.6022916f, 28.60631f);
                h.cubicTo(7.2127433f, 28.795856f, 7.087257f, 29.167261f, 6.894965f, 30.081976f);
                h.cubicTo(5.7692013f, 35.473f, 5.53809f, 36.461906f, 5.5466666f, 36.473213f);
                h.cubicTo(6.2810764f, 37.59919f, 7.5300694f, 38.782166f, 9.169966f, 39.928047f);
                h.cubicTo(10.9840975f, 41.24312f, 13.137222f, 42.39081f, 15.506111f, 43.345787f);
                h.cubicTo(15.116563f, 45.464287f, 14.69993f, 48.585262f, 14.69993f, 52.256786f);
                h.cubicTo(14.69993f, 53.47369f, 14.798333f, 53.804382f, 15.289444f, 54.33457f);
                h.cubicTo(16.465313f, 55.59943f, 20.999966f, 56.16445f, 22.942291f, 56.1165f);
                h.cubicTo(23.710104f, 56.09614f, 24.42014f, 55.58043f, 24.42014f, 54.68969f);
                h.cubicTo(24.42014f, 52.68293f, 24.409306f, 48.71464f, 24.402082f, 45.875954f);
                h.cubicTo(26.878403f, 46.328335f, 29.463959f, 46.58574f, 32.082466f, 46.58574f);
                h.cubicTo(32.176353f, 46.58574f, 32.26979f, 46.58574f, 32.362778f, 46.584835f);
                h.cubicTo(32.455765f, 46.58574f, 32.549652f, 46.58574f, 32.643543f, 46.58574f);
                h.cubicTo(36.29573f, 46.58574f, 39.88427f, 46.082237f, 43.201527f, 45.252117f);
                h.cubicTo(47.92757f, 44.118904f, 52.29205f, 42.293095f, 55.555138f, 39.928047f);
                h.cubicTo(57.197292f, 38.782166f, 58.443577f, 37.59919f, 59.17979f, 36.473213f);
                h.cubicTo(59.18882f, 36.461906f, 58.73969f, 34.35019f, 57.83014f, 30.081976f);
                h.cubicTo(57.63559f, 29.167261f, 57.514168f, 28.795856f, 57.12417f, 28.60631f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.restore();
                c.f(looper);
                break;
        }
        return 0;
    }
}
