package com.tencent.mm.g.a.a;

import com.tencent.mm.ba.a;

public final class b extends a {
    public String caJ;
    public int caK;
    public String caL;
    public String userName;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.userName != null) {
                aVar.e(1, this.userName);
            }
            if (this.caJ != null) {
                aVar.e(2, this.caJ);
            }
            aVar.dV(3, this.caK);
            if (this.caL == null) {
                return 0;
            }
            aVar.e(4, this.caL);
            return 0;
        } else if (i == 1) {
            if (this.userName != null) {
                r0 = a.a.a.b.b.a.f(1, this.userName) + 0;
            } else {
                r0 = 0;
            }
            if (this.caJ != null) {
                r0 += a.a.a.b.b.a.f(2, this.caJ);
            }
            r0 += a.a.a.a.dS(3, this.caK);
            if (this.caL != null) {
                r0 += a.a.a.b.b.a.f(4, this.caL);
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
            b bVar = (b) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    bVar.userName = aVar3.pMj.readString();
                    return 0;
                case 2:
                    bVar.caJ = aVar3.pMj.readString();
                    return 0;
                case 3:
                    bVar.caK = aVar3.pMj.mH();
                    return 0;
                case 4:
                    bVar.caL = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
