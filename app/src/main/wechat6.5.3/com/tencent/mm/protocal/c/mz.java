package com.tencent.mm.protocal.c;

import com.tencent.mm.ba.a;

public final class mz extends a {
    public String info;
    public int moW;
    public int moX;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            aVar.dV(1, this.moW);
            aVar.dV(2, this.moX);
            if (this.info != null) {
                aVar.e(3, this.info);
            }
            return 0;
        } else if (i == 1) {
            r0 = (a.a.a.a.dS(1, this.moW) + 0) + a.a.a.a.dS(2, this.moX);
            if (this.info != null) {
                return r0 + a.a.a.b.b.a.f(3, this.info);
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
            mz mzVar = (mz) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    mzVar.moW = aVar3.pMj.mH();
                    return 0;
                case 2:
                    mzVar.moX = aVar3.pMj.mH();
                    return 0;
                case 3:
                    mzVar.info = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
