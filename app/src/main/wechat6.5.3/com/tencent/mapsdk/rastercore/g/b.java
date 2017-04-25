package com.tencent.mapsdk.rastercore.g;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.Base64;
import android.view.View;
import com.tencent.mapsdk.rastercore.d.e;
import com.tencent.mapsdk.rastercore.f.a;
import com.tencent.mapsdk.rastercore.tile.MapTile.MapSource;

public final class b extends View {
    private e a;
    private Bitmap b;
    private Bitmap c;
    private Bitmap d;
    private Paint e = new Paint();
    private boolean f = false;
    private int g = 0;
    private int h = 10;
    private int i = 10;

    public b(e eVar) {
        super(e.a());
        this.a = eVar;
        e.a().getResources().getAssets();
        try {
            byte[] decode = Base64.decode("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", 0);
            if (decode != null) {
                this.b = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                this.b = a.a(this.b, (float) (((double) eVar.f().b()) * 0.7d));
            }
            this.c = this.b;
        } catch (Throwable th) {
            new StringBuilder("watermarker decode error:").append(th.toString());
        }
        this.e.setAntiAlias(true);
        this.e.setColor(-16777216);
        this.e.setStyle(Style.STROKE);
    }

    public final void a() {
        try {
            if (this.b != null) {
                this.b.recycle();
            }
            if (this.c != null) {
                this.c.recycle();
            }
            this.b = null;
            this.c = null;
            this.e = null;
        } catch (Exception e) {
        }
    }

    public final void a(int i) {
        this.g = i;
    }

    public final void a(Bitmap bitmap) {
        if (bitmap != null) {
            this.d = bitmap;
            this.d = a.a(this.d, this.a.f().b() * 2.0f);
            postInvalidate();
        }
    }

    public final void a(boolean z) {
        this.f = z;
        invalidate();
    }

    public final void onDraw(Canvas canvas) {
        if (this.c != null) {
            Bitmap bitmap = this.a.f().c() == MapSource.BING ? this.d : this.f ? this.c : this.b;
            if (bitmap == this.c || this.d != null) {
                int width = bitmap.getWidth() + 3;
                int height = bitmap.getHeight() + 3;
                switch (this.g) {
                    case 0:
                        this.h = 10;
                        this.i = this.a.c().getHeight() - height;
                        break;
                    case 1:
                        this.h = this.a.c().getWidth() - width;
                        this.i = this.a.c().getHeight() - height;
                        break;
                    case 2:
                        this.h = this.a.c().getWidth() - width;
                        this.i = 10;
                        break;
                    case 3:
                        this.h = 10;
                        this.i = 10;
                        break;
                    case 4:
                        this.h = (this.a.c().getWidth() - width) / 2;
                        this.i = this.a.c().getHeight() - height;
                        break;
                    default:
                        this.h = (this.a.c().getWidth() - width) / 2;
                        this.i = 10;
                        break;
                }
                if (this.a.f().c() == MapSource.BING) {
                    this.i -= 2;
                } else {
                    this.i -= 8;
                }
                canvas.drawBitmap(bitmap, (float) (this.h - 5), (float) this.i, this.e);
            }
        }
    }
}
