package com.tencent.mm.protocal.c;

import com.tencent.mm.ba.a;

public final class ws extends a {
    public int myW;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            ((a.a.a.c.a) objArr[0]).dV(1, this.myW);
            return 0;
        } else if (i == 1) {
            return a.a.a.a.dS(1, this.myW) + 0;
        } else {
            if (i == 2) {
                a.a.a.a.a aVar = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
                for (int a = a.a(aVar); a > 0; a = a.a(aVar)) {
                    if (!super.a(aVar, this, a)) {
                        aVar.bQL();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                a.a.a.a.a aVar2 = (a.a.a.a.a) objArr[0];
                ws wsVar = (ws) objArr[1];
                switch (((Integer) objArr[2]).intValue()) {
                    case 1:
                        wsVar.myW = aVar2.pMj.mH();
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
