package com.tencent.mm.protocal.c;

import a.a.a.b;
import com.tencent.mm.ba.a;

public final class bhp extends a {
    public String efy;
    public long ncA;
    public String ncy;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a.a.a.c.a aVar = (a.a.a.c.a) objArr[0];
            if (this.ncy == null) {
                throw new b("Not all required fields were included: Talker");
            } else if (this.efy == null) {
                throw new b("Not all required fields were included: NickName");
            } else {
                if (this.ncy != null) {
                    aVar.e(1, this.ncy);
                }
                if (this.efy != null) {
                    aVar.e(2, this.efy);
                }
                aVar.C(3, this.ncA);
                return 0;
            }
        } else if (i == 1) {
            if (this.ncy != null) {
                r0 = a.a.a.b.b.a.f(1, this.ncy) + 0;
            } else {
                r0 = 0;
            }
            if (this.efy != null) {
                r0 += a.a.a.b.b.a.f(2, this.efy);
            }
            return r0 + a.a.a.a.B(3, this.ncA);
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = a.a(aVar2); r0 > 0; r0 = a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.ncy == null) {
                throw new b("Not all required fields were included: Talker");
            } else if (this.efy != null) {
                return 0;
            } else {
                throw new b("Not all required fields were included: NickName");
            }
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            bhp com_tencent_mm_protocal_c_bhp = (bhp) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    com_tencent_mm_protocal_c_bhp.ncy = aVar3.pMj.readString();
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_bhp.efy = aVar3.pMj.readString();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_bhp.ncA = aVar3.pMj.mI();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
