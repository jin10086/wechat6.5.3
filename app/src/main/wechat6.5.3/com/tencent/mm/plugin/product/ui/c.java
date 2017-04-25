package com.tencent.mm.plugin.product.ui;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.platformtools.i;
import com.tencent.mm.platformtools.i.a;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.v;
import java.io.File;
import java.io.IOException;

public final class c implements i {
    private static final String eDd = (e.cnj + "wallet");
    private String url;

    public c(String str) {
        this.url = str;
    }

    public final String MU() {
        return xK(this.url);
    }

    public final String MV() {
        return this.url;
    }

    public final String MW() {
        return this.url;
    }

    public final String MX() {
        return this.url;
    }

    public final boolean MY() {
        return true;
    }

    public final boolean MZ() {
        return false;
    }

    public final Bitmap Na() {
        return null;
    }

    public final Bitmap a(Bitmap bitmap, a aVar) {
        if (a.doT == aVar) {
            try {
                d.a(bitmap, 100, CompressFormat.PNG, xK(this.url), false);
            } catch (IOException e) {
                try {
                    File file = new File(eDd);
                    if (!file.exists()) {
                        file.mkdir();
                    }
                    v.w("MicroMsg.WalletGetPicStrategy", " retry saving bitmap");
                    d.a(bitmap, 100, CompressFormat.PNG, xK(this.url), false);
                } catch (Throwable e2) {
                    v.a("MicroMsg.WalletGetPicStrategy", e2, "", new Object[0]);
                    v.w("MicroMsg.WalletGetPicStrategy", "save bitmap fail");
                }
            }
        }
        v.d("MicroMsg.WalletGetPicStrategy", "get bitmap, from %s", new Object[]{aVar.toString()});
        return bitmap;
    }

    public final void Nb() {
    }

    public final void H(String str, boolean z) {
    }

    public final void a(a aVar, String str) {
    }

    public static String xK(String str) {
        if (be.kS(str)) {
            v.w("MicroMsg.WalletGetPicStrategy", "getStoragePath: but url is null");
            return null;
        }
        return String.format("%s/%s", new Object[]{eDd, g.m(str.getBytes())});
    }
}
