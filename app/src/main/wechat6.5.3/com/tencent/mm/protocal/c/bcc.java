package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class bcc extends aqp {
    public String gln;
    public String mXJ;
    public int mXK;
    public int mXL;
    public int mdC;
    public int mdF;
    public int mfb;
    public are mfg;
    public int mfh;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mfg == null) {
                throw new b("Not all required fields were included: Data");
            }
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            if (this.gln != null) {
                aVar.e(2, this.gln);
            }
            if (this.mfg != null) {
                aVar.dX(3, this.mfg.aHr());
                this.mfg.a(aVar);
            }
            aVar.dV(4, this.mfb);
            if (this.mXJ != null) {
                aVar.e(5, this.mXJ);
            }
            aVar.dV(6, this.mfh);
            aVar.dV(7, this.mXK);
            aVar.dV(8, this.mdF);
            aVar.dV(9, this.mXL);
            aVar.dV(10, this.mdC);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.gln != null) {
                r0 += a.a.a.b.b.a.f(2, this.gln);
            }
            if (this.mfg != null) {
                r0 += a.a.a.a.dU(3, this.mfg.aHr());
            }
            r0 += a.a.a.a.dS(4, this.mfb);
            if (this.mXJ != null) {
                r0 += a.a.a.b.b.a.f(5, this.mXJ);
            }
            return ((((r0 + a.a.a.a.dS(6, this.mfh)) + a.a.a.a.dS(7, this.mXK)) + a.a.a.a.dS(8, this.mdF)) + a.a.a.a.dS(9, this.mXL)) + a.a.a.a.dS(10, this.mdC);
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = com.tencent.mm.ba.a.a(aVar2); r0 > 0; r0 = com.tencent.mm.ba.a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.mfg != null) {
                return 0;
            }
            throw new b("Not all required fields were included: Data");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            bcc com_tencent_mm_protocal_c_bcc = (bcc) objArr[1];
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
                        com_tencent_mm_protocal_c_bcc.mPU = enVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_bcc.gln = aVar3.pMj.readString();
                    return 0;
                case 3:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        enVar = new are();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = enVar.a(aVar4, enVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_bcc.mfg = enVar;
                    }
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_bcc.mfb = aVar3.pMj.mH();
                    return 0;
                case 5:
                    com_tencent_mm_protocal_c_bcc.mXJ = aVar3.pMj.readString();
                    return 0;
                case 6:
                    com_tencent_mm_protocal_c_bcc.mfh = aVar3.pMj.mH();
                    return 0;
                case 7:
                    com_tencent_mm_protocal_c_bcc.mXK = aVar3.pMj.mH();
                    return 0;
                case 8:
                    com_tencent_mm_protocal_c_bcc.mdF = aVar3.pMj.mH();
                    return 0;
                case 9:
                    com_tencent_mm_protocal_c_bcc.mXL = aVar3.pMj.mH();
                    return 0;
                case 10:
                    com_tencent_mm_protocal_c_bcc.mdC = aVar3.pMj.mH();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
