package com.tencent.mm.plugin.game.d;

import com.tencent.mm.ba.a;

public final class an extends a {
    public String gmG;
    public String gmH;
    public String gmI;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.gmG != null) {
                aVar.e(1, this.gmG);
            }
            if (this.gmH != null) {
                aVar.e(2, this.gmH);
            }
            if (this.gmI == null) {
                return 0;
            }
            aVar.e(3, this.gmI);
            return 0;
        } else if (i == 1) {
            if (this.gmG != null) {
                r0 = a.a.a.b.b.a.f(1, this.gmG) + 0;
            } else {
                r0 = 0;
            }
            if (this.gmH != null) {
                r0 += a.a.a.b.b.a.f(2, this.gmH);
            }
            if (this.gmI != null) {
                r0 += a.a.a.b.b.a.f(3, this.gmI);
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
            an anVar = (an) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    anVar.gmG = aVar3.pMj.readString();
                    return 0;
                case 2:
                    anVar.gmH = aVar3.pMj.readString();
                    return 0;
                case 3:
                    anVar.gmI = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
