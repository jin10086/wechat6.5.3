package com.tencent.mm.modelbiz.a;

import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.ti;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.v.b;
import com.tencent.mm.v.b.a;
import com.tencent.mm.v.e;
import com.tencent.mm.v.k;

public final class q extends k implements j {
    public b cif;
    private e cii;
    Object data;

    public q(String str, Object obj) {
        a aVar = new a();
        aVar.czn = new th();
        aVar.czo = new ti();
        aVar.uri = "/cgi-bin/mmocbiz-bin/getbizchatmyuserinfo";
        this.cif = aVar.Bv();
        ((th) this.cif.czk.czs).mhJ = str;
        this.data = obj;
    }

    public final void a(int i, int i2, int i3, String str, p pVar, byte[] bArr) {
        v.d("MicroMsg.brandservice.NetSceneGetBizChatMyUserInfo", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        if (this.cii != null) {
            this.cii.a(i2, i3, str, this);
        }
    }

    public final int getType() {
        return 1354;
    }

    public final int a(com.tencent.mm.network.e eVar, e eVar2) {
        this.cii = eVar2;
        v.i("MicroMsg.brandservice.NetSceneGetBizChatMyUserInfo", "do scene");
        return a(eVar, this.cif, this);
    }
}
