package com.tencent.mm.plugin.game.d;

import com.tencent.mm.ba.a;

public final class cc extends a {
    public String gkT;
    public String gmN;
    public int gof;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.gmN != null) {
                aVar.e(1, this.gmN);
            }
            if (this.gkT != null) {
                aVar.e(2, this.gkT);
            }
            aVar.dV(3, this.gof);
            return 0;
        } else if (i == 1) {
            if (this.gmN != null) {
                r0 = a.a.a.b.b.a.f(1, this.gmN) + 0;
            } else {
                r0 = 0;
            }
            if (this.gkT != null) {
                r0 += a.a.a.b.b.a.f(2, this.gkT);
            }
            return r0 + a.a.a.a.dS(3, this.gof);
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
            cc ccVar = (cc) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    ccVar.gmN = aVar3.pMj.readString();
                    return 0;
                case 2:
                    ccVar.gkT = aVar3.pMj.readString();
                    return 0;
                case 3:
                    ccVar.gof = aVar3.pMj.mH();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
