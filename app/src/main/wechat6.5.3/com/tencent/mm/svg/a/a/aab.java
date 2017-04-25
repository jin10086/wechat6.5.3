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

public final class aab extends c {
    private final int height = 71;
    private final int width = 79;

    protected final int j(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 79;
            case 1:
                return 71;
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
                Path h = c.h(looper);
                h.moveTo(85.5f, 0.0f);
                h.cubicTo(132.72035f, 0.0f, 171.0f, 38.27965f, 171.0f, 85.5f);
                h.cubicTo(171.0f, 132.72035f, 132.72035f, 171.0f, 85.5f, 171.0f);
                h.cubicTo(38.27965f, 171.0f, 0.0f, 132.72035f, 0.0f, 85.5f);
                h.cubicTo(0.0f, 38.27965f, 38.27965f, 0.0f, 85.5f, 0.0f);
                h.close();
                g = c.a(g, looper);
                g.setColor(-11119016);
                canvas.save();
                Paint a = c.a(g, looper);
                h = c.h(looper);
                h.moveTo(45.426636f, 45.59831f);
                h.cubicTo(45.064354f, 45.11882f, 43.726395f, 43.143467f, 43.855465f, 40.273315f);
                h.cubicTo(43.958363f, 37.98519f, 43.95621f, 38.081062f, 46.194515f, 34.502163f);
                h.cubicTo(49.676476f, 32.289948f, 51.986675f, 28.397346f, 51.986675f, 23.964699f);
                h.lineTo(51.986675f, 15.349729f);
                h.cubicTo(51.986675f, 8.456272f, 46.40566f, 2.8766654f, 39.521126f, 2.8766654f);
                h.cubicTo(32.63508f, 2.8766654f, 27.055576f, 8.461046f, 27.055576f, 15.349729f);
                h.lineTo(27.055576f, 23.964699f);
                h.cubicTo(27.055576f, 28.400461f, 29.36645f, 32.292213f, 32.84851f, 34.5034f);
                h.cubicTo(35.08604f, 38.08104f, 35.0839f, 37.985455f, 35.186787f, 40.273315f);
                h.cubicTo(35.33592f, 43.589542f, 33.526573f, 45.71122f, 33.526573f, 45.71122f);
                h.lineTo(33.62935f, 45.77257f);
                h.lineTo(10.716543f, 57.88848f);
                h.cubicTo(9.505955f, 58.52862f, 8.332478f, 60.158325f, 8.111063f, 61.520306f);
                h.lineTo(7.9130507f, 62.738335f);
                h.cubicTo(7.690893f, 64.10488f, 8.635479f, 65.204414f, 10.021183f, 65.204414f);
                h.lineTo(70.02355f, 65.204414f);
                h.cubicTo(71.40404f, 65.204414f, 72.32937f, 64.10031f, 72.07869f, 62.738335f);
                h.lineTo(71.8545f, 61.520306f);
                h.cubicTo(71.602974f, 60.153755f, 70.40501f, 58.551296f, 69.17688f, 57.93091f);
                h.cubicTo(69.17688f, 57.93091f, 52.214314f, 49.392006f, 45.426636f, 45.59831f);
                h.close();
                h.moveTo(23.92041f, 22.062311f);
                h.lineTo(23.92041f, 15.751036f);
                h.cubicTo(23.92041f, 7.051979f, 30.904785f, 0.0f, 39.52468f, 0.0f);
                h.cubicTo(48.142685f, 0.0f, 55.128956f, 7.0538344f, 55.128956f, 15.751036f);
                h.lineTo(55.128956f, 22.062311f);
                h.cubicTo(55.128956f, 26.404568f, 52.825817f, 32.581375f, 49.987305f, 35.855644f);
                h.lineTo(48.319912f, 37.77901f);
                h.cubicTo(46.04784f, 40.399883f, 46.733746f, 43.733063f, 49.852333f, 45.224068f);
                h.lineTo(69.62199f, 54.675987f);
                h.cubicTo(71.959305f, 55.793465f, 74.15126f, 58.799007f, 74.51585f, 61.3749f);
                h.lineTo(74.97153f, 64.594444f);
                h.cubicTo(75.21618f, 66.32298f, 73.85184f, 68.16248f, 72.12305f, 68.078285f);
                h.lineTo(6.604266f, 68.078285f);
                h.cubicTo(4.8753734f, 68.16248f, 3.8324857f, 66.327934f, 4.0778384f, 64.594444f);
                h.lineTo(4.533522f, 61.3749f);
                h.cubicTo(4.899003f, 58.79267f, 7.0950084f, 55.790688f, 9.41165f, 54.682594f);
                h.lineTo(29.197031f, 45.21887f);
                h.cubicTo(32.315434f, 43.727276f, 33.002815f, 40.396038f, 30.72945f, 37.77501f);
                h.lineTo(29.06206f, 35.852623f);
                h.cubicTo(26.222404f, 32.5787f, 23.92041f, 26.403929f, 23.92041f, 22.062311f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                a = c.a(g, looper);
                float[] a2 = c.a(c, -1.0f, 0.0f, 27.333248f, 0.0f, 1.0f, 0.0f);
                d.reset();
                d.setValues(a2);
                canvas.concat(d);
                h = c.h(looper);
                h.moveTo(1.8318651f, 11.024287f);
                h.cubicTo(6.47523f, 11.364725f, 10.115674f, 15.24173f, 10.088107f, 19.9702f);
                h.lineTo(10.056429f, 25.403927f);
                h.cubicTo(10.03919f, 28.36074f, 8.595826f, 31.033453f, 6.379834f, 32.744877f);
                h.cubicTo(6.3019724f, 32.91909f, 6.1928797f, 33.109375f, 6.049243f, 33.316998f);
                h.cubicTo(3.9072914f, 36.41312f, 4.3254013f, 36.22716f, 4.3254013f, 38.0f);
                h.cubicTo(4.3254013f, 39.129623f, 4.2810683f, 40.577164f, 4.835036f, 41.62398f);
                h.cubicTo(5.3650746f, 42.62558f, 6.058379f, 43.33712f, 6.4863653f, 43.717873f);
                h.cubicTo(12.0072775f, 46.570488f, 21.32859f, 51.07534f, 21.32859f, 51.07534f);
                h.cubicTo(22.568909f, 51.677437f, 23.727386f, 53.27528f, 23.915657f, 54.64085f);
                h.lineTo(24.350327f, 57.793613f);
                h.cubicTo(24.35982f, 57.86246f, 24.366398f, 57.930397f, 24.370157f, 57.997326f);
                h.lineTo(25.302315f, 57.997326f);
                h.cubicTo(26.593607f, 58.05956f, 27.492397f, 57.023796f, 27.309658f, 55.746117f);
                h.lineTo(26.969294f, 53.366337f);
                h.cubicTo(26.696974f, 51.46232f, 25.059736f, 49.24072f, 23.313917f, 48.414715f);
                h.lineTo(8.54735f, 41.42816f);
                h.cubicTo(7.0193176f, 39.192307f, 7.194654f, 37.7021f, 7.360811f, 35.922062f);
                h.lineTo(8.648165f, 34.50333f);
                h.cubicTo(10.768336f, 32.083096f, 13.291223f, 27.5174f, 13.291223f, 24.307745f);
                h.lineTo(13.291223f, 19.642654f);
                h.cubicTo(13.291223f, 13.213965f, 7.2703595f, 8.0f, 0.83330566f, 8.0f);
                h.cubicTo(0.55311376f, 8.0f, 0.27523544f, 8.0098715f, -7.5495166E-15f, 8.029286f);
                h.cubicTo(0.6909507f, 8.936287f, 1.3045083f, 9.950972f, 1.8318651f, 11.024287f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a);
                canvas.restore();
                canvas.save();
                Paint a3 = c.a(g, looper);
                h = c.h(looper);
                h.moveTo(53.820503f, 11.001198f);
                h.cubicTo(58.981113f, 11.082424f, 63.1143f, 15.285621f, 63.08271f, 20.472427f);
                h.lineTo(63.061825f, 23.9017f);
                h.cubicTo(63.041103f, 27.304077f, 61.232307f, 30.346895f, 58.53236f, 32.10642f);
                h.cubicTo(58.53904f, 32.422142f, 58.393166f, 32.81987f, 58.049244f, 33.316998f);
                h.cubicTo(55.90729f, 36.41312f, 56.04546f, 36.281353f, 56.04546f, 38.0f);
                h.cubicTo(56.04546f, 39.129623f, 56.281067f, 40.577164f, 56.835037f, 41.62398f);
                h.cubicTo(57.365074f, 42.62558f, 58.05838f, 43.33712f, 58.486366f, 43.717873f);
                h.cubicTo(64.00728f, 46.570488f, 73.32859f, 51.07534f, 73.32859f, 51.07534f);
                h.cubicTo(74.56891f, 51.677437f, 75.72739f, 53.27528f, 75.91566f, 54.64085f);
                h.lineTo(76.35033f, 57.793613f);
                h.cubicTo(76.35982f, 57.86246f, 76.3664f, 57.930397f, 76.370155f, 57.997326f);
                h.lineTo(77.302315f, 57.997326f);
                h.cubicTo(78.593605f, 58.05956f, 79.49239f, 57.023796f, 79.30966f, 55.746117f);
                h.lineTo(78.96929f, 53.366337f);
                h.cubicTo(78.696976f, 51.46232f, 77.05974f, 49.24072f, 75.31392f, 48.414715f);
                h.lineTo(60.54735f, 41.42816f);
                h.cubicTo(59.019318f, 39.192307f, 58.91311f, 37.824722f, 59.079266f, 36.044685f);
                h.lineTo(60.74255f, 34.108715f);
                h.cubicTo(62.86272f, 31.688482f, 65.943375f, 27.5174f, 65.943375f, 24.307745f);
                h.lineTo(65.943375f, 19.642654f);
                h.cubicTo(65.943375f, 13.213965f, 59.27036f, 8.0f, 52.833305f, 8.0f);
                h.cubicTo(52.553112f, 8.0f, 52.275234f, 8.0098715f, 52.0f, 8.029286f);
                h.cubicTo(52.685993f, 8.92978f, 53.2957f, 9.9364195f, 53.820503f, 11.001198f);
                h.close();
                WeChatSVGRenderC2Java.setFillType(h, 2);
                canvas.drawPath(h, a3);
                canvas.restore();
                c.f(looper);
                break;
        }
        return 0;
    }
}
