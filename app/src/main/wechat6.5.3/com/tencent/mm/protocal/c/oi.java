package com.tencent.mm.protocal.c;

import a.a.a.b;
import com.tencent.mm.ba.a;

public final class oi extends a {
    public String mqz;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.mqz == null) {
                throw new b("Not all required fields were included: HeadUrl");
            } else if (this.mqz == null) {
                return 0;
            } else {
                aVar.e(1, this.mqz);
                return 0;
            }
        } else if (i == 1) {
            if (this.mqz != null) {
                r0 = a.a.a.b.b.a.f(1, this.mqz) + 0;
            } else {
                r0 = 0;
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.mqz != null) {
                return 0;
            }
            throw new b("Not all required fields were included: HeadUrl");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            oi oiVar = (oi) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    oiVar.mqz = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
