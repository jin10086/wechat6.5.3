package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class ays extends aqp {
    public boolean mVW;
    public String mhJ;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mhJ == null) {
                throw new b("Not all required fields were included: brand_user_name");
            }
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            if (this.mhJ != null) {
                aVar.e(2, this.mhJ);
            }
            aVar.ab(3, this.mVW);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.mhJ != null) {
                r0 += a.a.a.b.b.a.f(2, this.mhJ);
            }
            return r0 + (a.a.a.b.b.a.cw(3) + 1);
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = com.tencent.mm.ba.a.a(aVar2); r0 > 0; r0 = com.tencent.mm.ba.a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.mhJ != null) {
                return 0;
            }
            throw new b("Not all required fields were included: brand_user_name");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            ays com_tencent_mm_protocal_c_ays = (ays) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList zQ = aVar3.zQ(intValue);
                    int size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) zQ.get(intValue);
                        com.tencent.mm.ba.a enVar = new en();
                        a.a.a.a.a aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = enVar.a(aVar4, enVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_ays.mPU = enVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_ays.mhJ = aVar3.pMj.readString();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_ays.mVW = aVar3.bQJ();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
