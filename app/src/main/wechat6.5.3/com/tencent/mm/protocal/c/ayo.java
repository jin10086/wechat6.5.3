package com.tencent.mm.protocal.c;

import a.a.a.c.a;
import java.util.LinkedList;

public final class ayo extends aqp {
    public avd mVT;
    public String mVV;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            if (this.mVT != null) {
                aVar.dX(2, this.mVT.aHr());
                this.mVT.a(aVar);
            }
            if (this.mVV == null) {
                return 0;
            }
            aVar.e(3, this.mVV);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.mVT != null) {
                r0 += a.a.a.a.dU(2, this.mVT.aHr());
            }
            if (this.mVV != null) {
                r0 += a.a.a.b.b.a.f(3, this.mVV);
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = aqp.a(aVar2); r0 > 0; r0 = aqp.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            ayo com_tencent_mm_protocal_c_ayo = (ayo) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            byte[] bArr;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        en enVar = new en();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, aqp.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_ayo.mPU = enVar;
                    }
                    return 0;
                case 2:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        avd com_tencent_mm_protocal_c_avd = new avd();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_avd.a(aVar4, com_tencent_mm_protocal_c_avd, aqp.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_ayo.mVT = com_tencent_mm_protocal_c_avd;
                    }
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_ayo.mVV = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
