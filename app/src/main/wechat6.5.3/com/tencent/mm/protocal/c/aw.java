package com.tencent.mm.protocal.c;

import com.tencent.mm.ba.a;

public final class aw extends a {
    public int mbs;
    public int mbt;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            aVar.dV(1, this.mbs);
            aVar.dV(2, this.mbt);
            return 0;
        } else if (i == 1) {
            return (a.a.a.a.dS(1, this.mbs) + 0) + a.a.a.a.dS(2, this.mbt);
        } else {
            if (i == 2) {
                a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
                for (int a = a.a(aVar2); a > 0; a = a.a(aVar2)) {
                    if (!super.a(aVar2, this, a)) {
                        aVar2.bQL();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
                aw awVar = (aw) objArr[1];
                switch (((Integer) objArr[2]).intValue()) {
                    case 1:
                        awVar.mbs = aVar3.pMj.mH();
                        return 0;
                    case 2:
                        awVar.mbt = aVar3.pMj.mH();
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
