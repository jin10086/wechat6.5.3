package com.tencent.mm.al;

import com.tencent.mm.ba.a;

public final class e extends a {
    public String cUh;
    public String cUi;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.cUh != null) {
                aVar.e(1, this.cUh);
            }
            if (this.cUi == null) {
                return 0;
            }
            aVar.e(2, this.cUi);
            return 0;
        } else if (i == 1) {
            if (this.cUh != null) {
                r0 = a.a.a.b.b.a.f(1, this.cUh) + 0;
            } else {
                r0 = 0;
            }
            if (this.cUi != null) {
                r0 += a.a.a.b.b.a.f(2, this.cUi);
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
            e eVar = (e) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    eVar.cUh = aVar3.pMj.readString();
                    return 0;
                case 2:
                    eVar.cUi = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
