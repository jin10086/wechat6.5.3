package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class nj extends aqp {
    public int efm;
    public int mfb;
    public ali mpm;
    public int mpn;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mpm == null) {
                throw new b("Not all required fields were included: Package");
            }
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            if (this.mpm != null) {
                aVar.dX(2, this.mpm.aHr());
                this.mpm.a(aVar);
            }
            aVar.dV(3, this.mfb);
            aVar.dV(4, this.mpn);
            aVar.dV(5, this.efm);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.mpm != null) {
                r0 += a.a.a.a.dU(2, this.mpm.aHr());
            }
            return ((r0 + a.a.a.a.dS(3, this.mfb)) + a.a.a.a.dS(4, this.mpn)) + a.a.a.a.dS(5, this.efm);
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = com.tencent.mm.ba.a.a(aVar2); r0 > 0; r0 = com.tencent.mm.ba.a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.mpm != null) {
                return 0;
            }
            throw new b("Not all required fields were included: Package");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            nj njVar = (nj) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            byte[] bArr;
            com.tencent.mm.ba.a enVar;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        enVar = new en();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        njVar.mPU = enVar;
                    }
                    return 0;
                case 2:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        enVar = new ali();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        njVar.mpm = enVar;
                    }
                    return 0;
                case 3:
                    njVar.mfb = aVar3.pMj.mH();
                    return 0;
                case 4:
                    njVar.mpn = aVar3.pMj.mH();
                    return 0;
                case 5:
                    njVar.efm = aVar3.pMj.mH();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
