package com.tencent.mm.plugin.wallet.a;

import com.tencent.mm.ba.a;

public final class h extends a {
    public String desc;
    public String id;
    public String kHR;
    public String kHS;
    public String name;
    public int status;
    public int type;
    public String url;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.id != null) {
                aVar.e(1, this.id);
            }
            if (this.name != null) {
                aVar.e(2, this.name);
            }
            if (this.desc != null) {
                aVar.e(3, this.desc);
            }
            aVar.dV(4, this.status);
            if (this.url != null) {
                aVar.e(5, this.url);
            }
            aVar.dV(6, this.type);
            if (this.kHR != null) {
                aVar.e(7, this.kHR);
            }
            if (this.kHS == null) {
                return 0;
            }
            aVar.e(8, this.kHS);
            return 0;
        } else if (i == 1) {
            if (this.id != null) {
                r0 = a.a.a.b.b.a.f(1, this.id) + 0;
            } else {
                r0 = 0;
            }
            if (this.name != null) {
                r0 += a.a.a.b.b.a.f(2, this.name);
            }
            if (this.desc != null) {
                r0 += a.a.a.b.b.a.f(3, this.desc);
            }
            r0 += a.a.a.a.dS(4, this.status);
            if (this.url != null) {
                r0 += a.a.a.b.b.a.f(5, this.url);
            }
            r0 += a.a.a.a.dS(6, this.type);
            if (this.kHR != null) {
                r0 += a.a.a.b.b.a.f(7, this.kHR);
            }
            if (this.kHS != null) {
                r0 += a.a.a.b.b.a.f(8, this.kHS);
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            h hVar = (h) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    hVar.id = aVar3.pMj.readString();
                    return 0;
                case 2:
                    hVar.name = aVar3.pMj.readString();
                    return 0;
                case 3:
                    hVar.desc = aVar3.pMj.readString();
                    return 0;
                case 4:
                    hVar.status = aVar3.pMj.mH();
                    return 0;
                case 5:
                    hVar.url = aVar3.pMj.readString();
                    return 0;
                case 6:
                    hVar.type = aVar3.pMj.mH();
                    return 0;
                case 7:
                    hVar.kHR = aVar3.pMj.readString();
                    return 0;
                case 8:
                    hVar.kHS = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
